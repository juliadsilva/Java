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
public class Artista {
    
    protected String nomeArtista;
    protected long qtdMusica;

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public long getQtdMusica() {
        return qtdMusica;
    }

    public void setQtdMusica(long qtdMusica) {
        this.qtdMusica = qtdMusica;
    }
    
    @Override
    public String toString(){
        return getNomeArtista();
    }
}
