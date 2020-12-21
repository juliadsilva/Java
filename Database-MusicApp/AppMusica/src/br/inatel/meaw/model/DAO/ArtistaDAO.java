/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.meaw.model.DAO;

import br.inatel.meaw.controller.MySQLConnection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import br.inatel.meaw.model.Artista;
import br.inatel.meaw.utils.Constants;

/**
 *
 * @author julia e rafaela
 */
public class ArtistaDAO {
     
    boolean sucesso = false;
    
    
    /************************ INSERIR *********************************/
    public boolean adicionarNovoArtista(MySQLConnection connection, String nomeArtista) 
    {   
        //Comando em SQL:
        String insertCommand = "INSERT INTO artista(nomeArtista,qtdMusica)VALUES(?,?)";
        
            try 
            {
                connection.setPreparedStatement(connection.getConnection().prepareStatement(insertCommand));
                connection.getPreparedStatement().setString(1, nomeArtista);
                connection.getPreparedStatement().setInt(2, 0);
                
                connection.getPreparedStatement().execute();
                sucesso = true;
                JOptionPane.showMessageDialog(null, "Artista adicionado com sucesso.", "Miaw", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (SQLException ex) 
            {
                System.out.println("Erro = " + ex.getMessage());
                sucesso = false;
            }        
        return sucesso;
    }
    
    /************************ Listar *********************************/
    public  ArrayList<Artista> listarArtista (MySQLConnection connection) {
        ArrayList<Artista> artistaList = new ArrayList<>();
        
        //Comando em SQL:
        String selectCommand = "SELECT * FROM artista";
        
        try {
            connection.setStatement(connection.getConnection().createStatement());
            connection.setResult(connection.getStatement().executeQuery(selectCommand));
            while (connection.getResult().next()) {
                Artista artista = new Artista();
                artista.setNomeArtista(connection.getResult().getString(Constants.NOMEARTISTA));
                artista.setQtdMusica(connection.getResult().getLong(Constants.QTDMUSICA));
                
                artistaList.add(artista);
            }
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            sucesso = false;
        }

        return  artistaList;
    }
    
    /************************ QUANTIDADE MUSICAS *********************************/
    public boolean inserirQuantidadeMusica(MySQLConnection connection, String nomeArtista) {
              
        //Comando em SQL:    
        String updateCommand = "UPDATE artista SET qtdMusica = qtdMusica + 1 WHERE nomeArtista = ?";
        
        try{                    
            connection.setPreparedStatement(connection.getConnection().prepareStatement(updateCommand));
            connection.getPreparedStatement().setString(1, nomeArtista);
            connection.getPreparedStatement().execute();
            
            sucesso = true;
        }catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            sucesso = false;
        }
        return sucesso;
    }
    
    
        /************************ QUANTIDADE MUSICAS *********************************/
    public boolean descQuantidadeMusica(MySQLConnection connection, int idMusica) {
         
        String nome = null;
              
        //Comando em SQL:  
        StringBuilder builder = new StringBuilder("SELECT nomeArtista FROM musica WHERE idMusica = ");
        builder.append(idMusica);
        String selectCommand = builder.toString();  
        
        String updateCommand = "UPDATE artista SET qtdMusica = qtdMusica - 1 WHERE nomeArtista = ?";       
                
        try{
            connection.setStatement(connection.getConnection().createStatement());
            connection.setResult(connection.getStatement().executeQuery(selectCommand));
            while(connection.getResult().next()){  
               nome = connection.getResult().getString(Constants.NOMEARTISTA);
            }        
                       
            connection.setPreparedStatement(connection.getConnection().prepareStatement(updateCommand));
            connection.getPreparedStatement().setString(1, nome);
            connection.getPreparedStatement().execute();
                
            sucesso = true;
        }catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            sucesso = false;
        }
        return sucesso;
    }
    
    /************************ QUANTIDADE MUSICAS *********************************/
    public String quantidadeMusicaArtista(MySQLConnection connection, String nomeArtista) {
        
        String quantidade = null;
        
        //Comando em SQL:
        StringBuilder builder = new StringBuilder("SELECT qtdMusica FROM artista WHERE nomeArtista = '");
        builder.append(nomeArtista).append("'");
        String selectCommand = builder.toString();  
             
        try{
            connection.setStatement(connection.getConnection().createStatement());
            connection.setResult(connection.getStatement().executeQuery(selectCommand));
             while(connection.getResult().next()){  
               quantidade = connection.getResult().getString(Constants.QTDMUSICA);
            } 
   
             sucesso = true;
        }catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            sucesso = false;
        }
        return quantidade;
    }
}