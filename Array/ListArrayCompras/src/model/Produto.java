/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author julin
 */
public class Produto implements Comparable<Produto> {
    
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    
    //ITEM I E III
    @Override
    public int compareTo(Produto p) {
        return Double.compare(this.preco, p.preco);
    }
    
    /*ITEM II
    @Override
    public int compareTo(Produto p) {
        return this.nome.compare(p.nome);
    }
    */    
    
}
