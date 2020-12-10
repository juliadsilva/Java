/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listarraycofrinho;

/**
 *
 * @author julin
 */
public class ListArrayCofrinho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cofrinho cofre = new Cofrinho();
        cofre.addMoeda(new Moeda(0.10f));
        cofre.addMoeda(new Moeda(0.25f));
        cofre.addMoeda(new Moeda(0.50f));
        cofre.addMoeda(new Moeda(1.00f));
        cofre.addMoeda(new Moeda(0.50f));
        cofre.addMoeda(new Moeda(0.25f));
        cofre.addMoeda(new Moeda(0.05f));
            
        System.out.println("Valor Total: " + cofre.getValorTotal());
        System.out.println("Quantidade Moedas: " + cofre.getQuantidadeMoedas());
        System.out.println("Moeda maior valor "  + cofre.getMoedaMaiorValor().getValor());
        cofre.ordenaMoedas();
        for (int i = 0; i < cofre.moedas.size(); i++) {
            System.out.println(cofre.moedas.get(i).getValor() + " ");           
        }
    } 
}
