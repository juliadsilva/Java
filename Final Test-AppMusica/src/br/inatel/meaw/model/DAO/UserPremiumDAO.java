/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.meaw.model.DAO;

import br.inatel.meaw.controller.MySQLConnection;
import br.inatel.meaw.exception.CampoVazioException;
import java.sql.SQLException;
import java.util.ArrayList; 
import javax.swing.JOptionPane;
import br.inatel.meaw.model.Musica;
import br.inatel.meaw.model.Playlist;
import br.inatel.meaw.utils.Constants;

/**
 *
 * @author julia e rafaela
 */
public class UserPremiumDAO extends UserComumDAO{

    boolean sucesso = false;
           
    /************************ CRIAR PLAYLIST *********************************/
    public boolean insertPlaylist(MySQLConnection connection, String nomePlay, int idUsuario) {
        
         if (nomePlay.isEmpty()) throw new CampoVazioException();
         else{
            //Comando em SQL:
            String insertCommand = "INSERT INTO playlist(nomePlay, idUsuario) VALUES (?,?)";
        
            try {
                connection.setPreparedStatement(connection.getConnection().prepareStatement(insertCommand));
                connection.getPreparedStatement().setString(1, nomePlay);
                connection.getPreparedStatement().setInt(2, idUsuario);
                connection.getPreparedStatement().execute();
                sucesso = true;
                System.out.println("Cadastro realizado com sucesso!");
            } catch (SQLException ex) {
                System.out.println("Error: " + ex.getMessage());
                sucesso = false;
            }
        }
            
        return sucesso;
    }   
    
    /************************ ID PLAYLIST *********************************/
    public int idPlaylist(MySQLConnection connection, Playlist playlist){
        
        int id = 0;
        String nome = playlist.getNomePlay();
        System.out.println("Nome: " + nome);
        
        //Comando em SQL:
        StringBuilder builder = new StringBuilder("SELECT idPlaylist FROM playlist WHERE nomePlay = '");
        builder.append(nome).append("'");
        String selectCommand = builder.toString();
                
        try{
            connection.setStatement(connection.getConnection().createStatement());
            connection.setResult(connection.getStatement().executeQuery(selectCommand));
             while(connection.getResult().next()){  
                id = connection.getResult().getInt(Constants.IDPLAYLIST);
            }
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            sucesso = false;
        }
        return id;
    }

    /************************ INSERIR MUSICA NA PLAYLIST *********************************/
    public boolean insertMusicaPlaylist(MySQLConnection connection, int idPlaylist, String idMusica) {
                     
        //Comando em SQL:
        String insertCommand = "INSERT INTO playmusica(idMusica, idPlaylist) VALUES (?,?)";
        
        try {
            connection.setPreparedStatement(connection.getConnection().prepareStatement(insertCommand));
            connection.getPreparedStatement().setString(1, idMusica);
            connection.getPreparedStatement().setInt(2, idPlaylist);
            connection.getPreparedStatement().execute();
            sucesso = true;
            System.out.println("Musica adicionada!");
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
            sucesso = false;
        }
        return sucesso; 
    }
      
    /************************ QUANTIDADE MUSICAS NA PLAYLIST *********************************/
    public boolean quantidadeMusica(MySQLConnection connection, int idPlay) {
        
        int quantidade = 0;
        //Comando em SQL:
        StringBuilder builder = new StringBuilder("SELECT COUNT(idMusica) AS idMusica FROM playmusica WHERE idPlaylist = ");
        builder.append(idPlay);
        String selectCommand = builder.toString();         
        String updateCommand = "UPDATE playlist SET qtdMusicaPlay =? WHERE idPlaylist =?";
        
        try{
            connection.setStatement(connection.getConnection().createStatement());
            connection.setResult(connection.getStatement().executeQuery(selectCommand));
             while(connection.getResult().next()){  
                quantidade = connection.getResult().getInt(Constants.IDMUSICA);
            }
             
            connection.setPreparedStatement(connection.getConnection().prepareStatement(updateCommand));
            connection.getPreparedStatement().setInt(1, quantidade);
            connection.getPreparedStatement().setInt(2, idPlay);
            connection.getPreparedStatement().execute();
            
            sucesso = true;
        }catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            sucesso = false;
        }
        return sucesso;
    }
       
    /************************ LISTAR PLAYLIST *********************************/
    public ArrayList<Playlist> listarPlaylist(MySQLConnection connection, int idUsuario) {
        
        ArrayList<Playlist> playList = new ArrayList<>();
        
        //Comando em SQL:
        StringBuilder builder = new StringBuilder("SELECT * FROM playlist WHERE idUsuario = ");
        builder.append(idUsuario);
        String selectCommand = builder.toString();        
        
        try{
            connection.setStatement(connection.getConnection().createStatement());
            connection.setResult(connection.getStatement().executeQuery(selectCommand));
            while (connection.getResult().next()) {
                Playlist play = new Playlist();
                play.setIdPlaylist(connection.getResult().getInt(Constants.IDPLAYLIST));
                play.setNomePlay(connection.getResult().getString(Constants.NOMEPLAY));
                play.setQtdMusicasPlay(connection.getResult().getInt(Constants.QTDMUSICAPLAY));
                               
                playList.add(play);
            }
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            sucesso = false;
        }
        return  playList;
    }
    
    /************************ LISTAR MUSICA DA PLAYLIST *********************************/
    public ArrayList<Musica> listarMusicaPlay (MySQLConnection connection, String idPlaylist) {
        
        ArrayList<Musica> musicaList = new ArrayList<>();
        
        //Comando em SQL:
        StringBuilder builder = new StringBuilder("SELECT m.idMusica, m.nomeMusica, m.nomeArtista, m.genero, m.tempoDuracao , m.ano");
        builder.append(" FROM playmusica AS pa");
        builder.append(" RIGHT JOIN MUSICA AS M");
        builder.append(" ON pa.idMusica = m.idMusica");
        builder.append(" WHERE pa.idPlaylist = ");
        builder.append(idPlaylist);
        String selectCommand = builder.toString();
                
        try {
            connection.setStatement(connection.getConnection().createStatement());
            connection.setResult(connection.getStatement().executeQuery(selectCommand));
            while (connection.getResult().next()) {
                Musica musica = new Musica();
                musica.setIdMusica(connection.getResult().getInt(Constants.IDMUSICA));
                musica.setNomeMusica(connection.getResult().getString(Constants.NOMEMUSICA));
                musica.setnomeArtista(connection.getResult().getString(Constants.NOMEARTISTA));
                musica.setGenero(connection.getResult().getString(Constants.GENERO));
                musica.setTempoDuracao(connection.getResult().getDouble(Constants.TEMPO));
                musica.setAno(connection.getResult().getInt(Constants.ANO));
               
                musicaList.add(musica);
            }
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            sucesso = false;
        }
        return  musicaList;
    }
       
    /************************ DELETAR PLAYLIST *******************************/
    public boolean deletarPlaylist(MySQLConnection connection, int idPlaylist) 
    {       
        //Comando em SQL:
        String deleteCommand = "DELETE FROM playlist WHERE idPlaylist=?";
        
        try{
            connection.setPreparedStatement(connection.getConnection().prepareStatement(deleteCommand));
            connection.getPreparedStatement().setInt(1, idPlaylist);
            connection.getPreparedStatement().execute();
            sucesso = true;
            JOptionPane.showMessageDialog(null, "Playlist deletada", "Miaw", JOptionPane.INFORMATION_MESSAGE);
        }catch (SQLException ex) 
        {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } 
        return sucesso;
    }    
}
