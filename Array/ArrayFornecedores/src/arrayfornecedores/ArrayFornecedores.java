/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayfornecedores;

/**
 *
 * @author julia
 */
public class ArrayFornecedores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Restaurante restaurante = new Restaurante("Huragono", "Rua ABC", "123456789");
        
        restaurante.fornecedores[0].tipo = "Frutos do Mar";
        restaurante.fornecedores[0].quantidade = 20;
        
        restaurante.fornecedores[1].tipo = "Carnes";
        restaurante.fornecedores[1].quantidade = 50;
        
        restaurante.fornecedores[2].tipo = "Legumes";
        restaurante.fornecedores[2].quantidade = 100;
                
        restaurante.exibirInfos();
    }
    
}
