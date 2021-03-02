/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.meaw.model.DAO;

import br.inatel.meaw.controller.MySQLConnection;
import br.inatel.meaw.model.Musica;
import br.inatel.meaw.utils.Constants;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author julia e rafaela
 */
public class UserComumDAO extends UsuarioDAO{
        
    /************************ BUSCAR MUSICA *********************************/
    public ArrayList<Musica> buscarMusica (MySQLConnection connection, String filter, String value){
        
        ArrayList<Musica> musicaList = new ArrayList<>();
        String selectCommand;
        
        if(filter.equals("ano")){
            //Comando em SQL:
            StringBuilder builder = new StringBuilder("SELECT * FROM musica WHERE ");
            builder.append(filter).append(" = ");
            builder.append(value);
            selectCommand = builder.toString();  
        }else{
            //Comando em SQL:
            StringBuilder builder = new StringBuilder("SELECT * FROM musica WHERE ");
            builder.append(filter).append(" LIKE '");
            builder.append(value).append("%'");
            selectCommand = builder.toString();    
        }     
                             
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
    

    

 

