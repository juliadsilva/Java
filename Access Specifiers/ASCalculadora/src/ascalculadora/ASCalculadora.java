/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascalculadora;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class ASCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner valorTeclado = new Scanner(System.in);
        System.out.println("Entre com o raio: ");
        double raio = valorTeclado.nextDouble();
        
        System.out.println("Circurferencia " + Calculadora.circunferencia(raio));
        System.out.println("Volume: " + Calculadora.volume(raio));
        System.out.println("O valor de pi é: " + Calculadora.getPI());
        
        valorTeclado.close(); 
    }
}
