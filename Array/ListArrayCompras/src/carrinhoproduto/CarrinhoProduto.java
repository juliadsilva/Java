/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrinhoproduto;

import controller.CarrinhoController;
import model.Produto;

/**
 *
 * @author julin
 */
public class CarrinhoProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Produto p1 = new Produto("Iphone", 2900);
       Produto p2 = new Produto("Monitor LG", 2900);
       Produto p3 = new Produto("Mouse", 450);
       
       CarrinhoController.addProduto(p1);
       CarrinhoController.addProduto(p2);
       CarrinhoController.addProduto(p3);
       
       CarrinhoController.finalizarCompra();
    }
}
