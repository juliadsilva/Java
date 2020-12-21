/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.meaw.model;

/**
 *
 * @author julia e rafaela
 */
public class Playlist {
    
    private int idPlaylist;
    private String nomePlay;
    private long qtdMusicasPlay;
        
    public int getIdPlaylist() {
        return idPlaylist;
    }

    public void setIdPlaylist(int idPlaylist) {
        this.idPlaylist = idPlaylist;
    }

    public String getNomePlay() {
        return nomePlay;
    }

    public void setNomePlay(String nomePlay) {
        this.nomePlay = nomePlay;
    }

    public long getQtdMusicasPlay() {
        return qtdMusicasPlay;
    }

    public void setQtdMusicasPlay(long qtdMusicasPlay) {
        this.qtdMusicasPlay = qtdMusicasPlay;
    }  

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
