/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author julia
 */
public class Dentista implements Serializable{
    
    private String nome;
    private String documento;
    private String cro;
    private long telefone;
    private String especialidade;
    private int avaliacao;

    public Dentista(String nome, String documento, String cro, long telefone, String especialidade, int avaliacao) {
        this.nome = nome;
        this.documento = documento;
        this.cro = cro;
        this.telefone = telefone;
        this.especialidade = especialidade;
        this.avaliacao = avaliacao;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public String getCro() {
        return cro;
    }

    public long getTelefone() {
        return telefone;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public int getAvaliacao() {
        return avaliacao;
    } 
}
