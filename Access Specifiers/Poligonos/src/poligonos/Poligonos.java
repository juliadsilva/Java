/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligonos;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class Poligonos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner valorTeclado = new Scanner(System.in);
        
        // Criando um objeto de poligono regular
        PoligonoRegular pr = new PoligonoRegular();
        
        //Entrada de dados
        int numlados;
        System.out.println("Entre com numero de lados do poligono: ");
        numlados = valorTeclado.nextInt();

        float comprimento;
        System.out.println("Entre com o comprimento de cada lado: ");
        comprimento = valorTeclado.nextFloat();
        
        //Calculando a area
        pr.calculaArea(numlados, comprimento);
        
        //Saida de dados
        System.out.println("Area: " + pr.getAreaPoligono());

        valorTeclado.close();
        
    }

}
