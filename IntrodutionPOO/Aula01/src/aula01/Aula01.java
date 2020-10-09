/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class Aula01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Hello Java!");
        
        int numViloes;
               
        Scanner teclado = new Scanner(System.in);
        System.out.print("Viloes ano um: ");      
        int anoUm = teclado.nextInt();
        System.out.print("Viloes ano dois: ");
        int anoDois = teclado.nextInt();
        System.out.print("Viloes ano tres: ");
        int anoTres = teclado.nextInt();
               
        numViloes = anoUm + anoDois + anoTres;
        
        System.out.println("O valor total é " + numViloes);
        System.out.println("O media é " + (numViloes/3));
        System.out.println("\n");
        
        String nome = "Julia Daniele";
        
        System.out.println(nome.length());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.startsWith("Julia"));
        System.out.println(nome.contains("b"));
       
    }
    
}
