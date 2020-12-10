/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author julin
 */
public class Carrinho {
    
    private List<Produto> produtos = new ArrayList<>();
    
    public void addProduto(Produto produto){
        produtos.add(produto);
    }
    
    public void finalizarCompra(){
        Collections.sort(produtos);
        Collections.reverse(produtos);
        for (int i= 0; i < produtos.size(); i++) {
            System.out.println("Nome: " + produtos.get(i).getNome());
            System.out.println("Preço: " + produtos.get(i).getPreco());
        }
    }
}
