/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.meaw.model.DAO;

import br.inatel.meaw.controller.MySQLConnection;
import br.inatel.meaw.exception.CampoVazioException;
import br.inatel.meaw.exception.EmailInvalidoException;
import br.inatel.meaw.exception.UsuarioExistenteException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import br.inatel.meaw.model.Musica;
import br.inatel.meaw.model.Usuario;
import br.inatel.meaw.utils.Constants;

/**
 *
 * @author julia e rafaela
 */
public class UsuarioDAO {
      
    boolean sucesso = false;
    
    /************************ INSERIR *********************************/
    public boolean inserirUsuario(MySQLConnection connection, Usuario novoUsuario) 
    {   
        if(novoUsuario.getNomeUsuario().isEmpty() || novoUsuario.getSenha().isEmpty())
            throw new CampoVazioException();
        else{
            if(novoUsuario.getEmail().contains("@")){
            
                //Comando em SQL:
                String insertCommand = "INSERT INTO usuario (nomeUsuario, email,senha, idTipoUsuario)VALUES(?,?,?,?)";
        
                try {
                    connection.setPreparedStatement(connection.getConnection().prepareStatement(insertCommand));
                    connection.getPreparedStatement().setString(1, novoUsuario.getNomeUsuario());
                    connection.getPreparedStatement().setString(2, novoUsuario.getEmail());
                    connection.getPreparedStatement().setString(3, novoUsuario.getSenha()); 
                    connection.getPreparedStatement().setInt(4, novoUsuario.getIdTipoUsuario());                
                    connection.getPreparedStatement().execute();
                
                    sucesso = true;
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso", "Miaw", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (SQLException ex){
                    System.out.println("Erro = " + ex.getMessage());
                    sucesso = false;
                } 
            }else throw new EmailInvalidoException();
        }
        return sucesso;
    }
    
    /************************ VERIFICAR EXISTENTE *********************************/
    public boolean existeUsuario(MySQLConnection connection, Usuario novoUsuario) 
    {   
                
        //Comando em SQL:
        String selectCommand = "SELECT * FROM usuario";
      
        try{
            connection.setStatement(connection.getConnection().createStatement());
            connection.setResult(connection.getStatement().executeQuery(selectCommand));
            while(connection.getResult().next()){  
                String email = connection.getResult().getString(Constants.EMAIL);
                if(email.equals(novoUsuario.getEmail()))
                   throw new UsuarioExistenteException();
            }
            sucesso = true;
        }catch (SQLException ex){
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        }                
        return sucesso;
    }
    
     /*********************** BUSCAR USUARIO PARA LOGIN ************************/
    public Usuario buscarUsuario(MySQLConnection connection, String email, String senha) 
    {
        Usuario user = new Usuario();
        //Comando em SQL:
        StringBuilder builder = new StringBuilder("SELECT * FROM usuario WHERE email = '");
        builder.append(email).append("' AND senha = '");
        builder.append(senha).append("'");
        String selectCommand = builder.toString();
       
        try{
            connection.setStatement(connection.getConnection().createStatement());
            connection.setResult(connection.getStatement().executeQuery(selectCommand));
            while(connection.getResult().next()){  
                user.setEmail(connection.getResult().getString(Constants.EMAIL));
                user.setSenha(connection.getResult().getString(Constants.SENHA));
                user.setIdUsuario(connection.getResult().getInt(Constants.IDUSUARIO));   
                user.setIdTipoUsuario(connection.getResult().getInt(Constants.IDTIPOUSUARIO));
            }  
            sucesso = true;
        }catch (SQLException ex){
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        }         
        return user;
    }
         
    /************************ LISTAR USUARIOS *********************************/
    public  ArrayList<Usuario> listarUsuarios(MySQLConnection connection){    
        ArrayList<Usuario> listaDeUsuarios = new ArrayList<>();
                
        //Comando em SQL:
        String selectCommand = "SELECT * FROM usuario"; 
        
        try{
            connection.setStatement(connection.getConnection().createStatement());
            connection.setResult(connection.getStatement().executeQuery(selectCommand));
            while(connection.getResult().next()){
                Usuario usuarioTemp = new Usuario();
                usuarioTemp.setIdUsuario(connection.getResult().getInt(Constants.IDUSUARIO));
                usuarioTemp.setNomeUsuario(connection.getResult().getString(Constants.NOMEUSUARIO));
                usuarioTemp.setEmail(connection.getResult().getString(Constants.EMAIL));
                usuarioTemp.setIdTipoUsuario(connection.getResult().getInt(Constants.IDTIPOUSUARIO));
                
                listaDeUsuarios.add(usuarioTemp);
            }
            sucesso = true;
        }catch (SQLException ex){
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } 
        return listaDeUsuarios;
    }  
    

        
    /************************ BUSCAR MUSICA *********************************/
    public ArrayList<Musica> buscarMusicas (MySQLConnection connection){
        
        ArrayList<Musica> musicaList = new ArrayList<>();
        
        //Comando em SQL:
        String selectCommand = "SELECT * FROM musica";
                
        try{
            connection.setStatement(connection.getConnection().createStatement());
            connection.setResult(connection.getStatement().executeQuery(selectCommand));
            while (connection.getResult().next()) {
                Musica musica = new Musica();
                musica.setIdMusica(connection.getResult().getInt(Constants.IDMUSICA));
                musica.setNomeMusica(connection.getResult().getString(Constants.NOMEMUSICA));
                musica.setTempoDuracao(connection.getResult().getDouble(Constants.TEMPO));
                musica.setAno(connection.getResult().getInt(Constants.ANO));
                musica.setGenero(connection.getResult().getString(Constants.GENERO));
                musica.setnomeArtista(connection.getResult().getString(Constants.NOMEARTISTA));
                
                musicaList.add(musica);
            }
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            sucesso = false;
        }
        return  musicaList;
    }
    
}
