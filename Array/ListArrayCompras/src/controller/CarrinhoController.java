/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Carrinho;
import model.Produto;

/**
 *
 * @author julin
 */
public class CarrinhoController {
    private static Carrinho carrinho = new Carrinho();
    
    public static void addProduto(Produto produto){
        carrinho.addProduto(produto);
    }
    
    public static void finalizarCompra(){
        carrinho.finalizarCompra();
    }
}
