/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcmania;

/**
 *
 * @author julia
 */
public class Cliente {

    String nome;
    long cpf;

    Computador[] computadores;

    public float calculaTotalCompra() {

        float total = 0;
        
        System.out.println("**********Computadores Adquiridos**********");
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null) {
                System.out.println("Marca: " + computadores[i].marca);
                System.out.printf("Preco: R$ %.2f \n", computadores[i].preco);
                System.out.println("Hardwares Basicos: ");
                System.out.println("- " + computadores[i].hardwares[0].nome + " (" + computadores[i].hardwares[0].capacidade + " Mhz)");
                System.out.println("- " + computadores[i].hardwares[1].capacidade + "Gb de " + computadores[i].hardwares[1].nome);
                System.out.println("- " + computadores[i].hardwares[2].capacidade + "Gb de " + computadores[i].hardwares[2].nome);
                System.out.println("Sistema Operacional: " + computadores[i].so.nome + " (" + computadores[i].so.tipo + " bits)");
                System.out.println("Memoria USB: " + computadores[i].memoriausb.nome + " de " + computadores[i].memoriausb.capacidade + "Gb");
                System.out.println("-------------------------------------------");
                total = computadores[i].preco + total;
            }
        }

        return total;
    }
}
