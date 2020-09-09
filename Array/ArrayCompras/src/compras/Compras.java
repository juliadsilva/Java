/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compras;

/**
 *
 * @author julia
 */
public class Compras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Produto [] produtos = new Produto[5];
        
        Produto p1 = new Produto("Iphone XR", "Celular", "Apple", 2999.99);
        Produto p2 = new Produto("Geladeira","Eletrodomestico", "Consul", 1500);
        Produto p3 = new Produto("Fone de Ouvido", "Periferico", "Xaomi", 749.90);
        
        produtos[0] = p1;
        produtos[1] = p2;
        produtos[2] = p3;
        
        Carrinho c = new Carrinho(produtos);
        c.exibirInfos();
        
        
        
        
    }
    
}
