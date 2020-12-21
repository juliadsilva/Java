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
public class Musica {
    
    private int idMusica;
    private String nomeMusica;
    private double tempoDuracao; //Em minutos
    private int ano;
    private String genero;
    
    Artista artista = new Artista();

    public int getIdMusica() {
        return idMusica;
    }

    public void setIdMusica(int idMusica) {
        this.idMusica = idMusica;
    }
    
    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public double getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(double tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getnomeArtista() {
        return artista.nomeArtista;
    }

    public void setnomeArtista(String nome) {
        this.artista.nomeArtista = nome;
    }
}