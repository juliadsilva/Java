/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.meaw.model.DAO;

import br.inatel.meaw.controller.MySQLConnection;
import br.inatel.meaw.exception.CampoVazioException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.inatel.meaw.model.Musica;

/**
 *
 * @author julia e rafaela
 */
public class GerenciadorDAO extends UsuarioDAO {
           
    boolean sucesso = false;
    
    /************************ INSERIR MUSICA *******************************/
    public boolean insertMusica(MySQLConnection connection, Musica musica) {
        
        if(musica.getNomeMusica().isEmpty() || musica.getnomeArtista().isEmpty()) throw new CampoVazioException();
        else{
            //Comando em SQL:
            String insertCommand = "INSERT INTO musica (nomeMusica,tempoDuracao,ano,genero,nomeArtista)VALUES(?,?,?,?,?)";
       
            try {                       
                connection.setPreparedStatement(connection.getConnection().prepareStatement(insertCommand));
                connection.getPreparedStatement().setString(1, musica.getNomeMusica());
                connection.getPreparedStatement().setDouble(2, musica.getTempoDuracao());
                connection.getPreparedStatement().setInt(3, musica.getAno());
                connection.getPreparedStatement().setString(4,musica.getGenero());
                connection.getPreparedStatement().setString(5,musica.getnomeArtista());
                connection.getPreparedStatement().execute();
                sucesso = true;
                JOptionPane.showMessageDialog(null, "Nova musica cadastrada", "Miaw", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                System.out.println("Error: " + ex.getMessage());
                sucesso = false;
            }
        }
        return sucesso;
    }
    
    public boolean atualizarMusica(MySQLConnection connection, Musica musica) {
        
        String updateMusica = "UPDATE musica SET nomeMusica = ?, tempoDuracao = ?, ano = ?, genero = ?, nomeArtista = ?  WHERE idMusica = ?";
        
        try{
            connection.setPreparedStatement(connection.getConnection().prepareStatement(updateMusica));
            
            connection.getPreparedStatement().setString(1, musica.getNomeMusica());
            connection.getPreparedStatement().setDouble(2, musica.getTempoDuracao());
            connection.getPreparedStatement().setInt(3, musica.getAno());
            connection.getPreparedStatement().setString(4, musica.getGenero());
            connection.getPreparedStatement().setString(5, musica.getnomeArtista());
            connection.getPreparedStatement().setInt(6, musica.getIdMusica());
            connection.getPreparedStatement().execute();
            sucesso = true;
            JOptionPane.showMessageDialog(null, "Atualizada com Sucesso!");
        }catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            sucesso = false;
        }
        return sucesso;
    }
    
    
    
    /************************ DELETAR MUSICA *******************************/
    public boolean deletarMusica(MySQLConnection connection, int idMusica){     
        
        //Comando em SQL:
        String deleteCommand = "DELETE FROM musica WHERE idMusica=?";
        
        try{
            connection.setPreparedStatement(connection.getConnection().prepareStatement(deleteCommand));
            connection.getPreparedStatement().setInt(1,idMusica);
            connection.getPreparedStatement().execute();
            sucesso = true;
            JOptionPane.showMessageDialog(null, "Musica deletada", "Miaw", JOptionPane.INFORMATION_MESSAGE);
        }catch (SQLException ex){
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } 
        return sucesso;
    }
    
    /************************ DELETAR USUARIO *******************************/
    public boolean deletarUsuario(MySQLConnection connection, int idUsuario){
       
        //Comando em SQL:
        String deleteCommand = "DELETE FROM usuario WHERE idUsuario=?";
        
        try{
            connection.setPreparedStatement(connection.getConnection().prepareStatement(deleteCommand));
            connection.getPreparedStatement().setInt(1, idUsuario);
            connection.getPreparedStatement().execute();
            sucesso = true;
            JOptionPane.showMessageDialog(null, "Usuario deletado", "Miaw", JOptionPane.INFORMATION_MESSAGE);
        }catch (SQLException ex){
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } 
        return sucesso;
    }
}

