/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author julin
 */
public class Produto implements Serializable{
    
    private String nome;
    private String preco;
    private String setor;
    private String codigo;
    private String desconto;

    public Produto(String nome, String preco, String setor, String codigo, String desconto) {
        this.nome = nome;
        this.preco = preco;
        this.setor = setor;
        this.codigo = codigo;
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }

    public String getPreco() {
        return preco;
    }

    public String getSetor() {
        return setor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDesconto() {
        return desconto;
    }

}
