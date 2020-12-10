/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author julin
 */
public class ProdutoController {
    
    private static Produto produto;
    private static final ArrayList <Produto> produtos = new ArrayList<>();
    
    public static void addProduto(String nome, String preco, String setor, String codigo, String desconto){
        produto = new Produto(nome, preco, setor, codigo, desconto);
        produtos.add(produto);
        Arquivo.salvarArquivo(produtos);
    }
    
    public static ArrayList<Produto> listarPrdutos(){
        return Arquivo.lerArquivo();
    }
}
