/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch_while;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author julia
 */
public class Switch_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

        //Hora do desespero
        System.out.println("Qual a sua NPA?");

        int npa = teclado.nextInt();

        if (npa < 30) {
            System.out.println("Voce foi reprovado");
        } else if (npa < 60) {
            System.out.println("Fazer a NP3");
        } else {
            System.out.println("Aprovado!!!");
        }

        //Pokemon
        Scanner elemento = new Scanner(System.in);

        System.out.println("Qual o seu elemental?");

        String pokemon = elemento.nextLine();

        pokemon = pokemon.toLowerCase();

        System.out.println("A fraqueza do elemento " + pokemon + " é ");

        switch (pokemon) {
            case "fogo":
                System.out.println("Agua");
                break;
            case "agua":
                System.out.println("Eletricidade");
                break;
            case "eletricidade":
                System.out.println("Pedro");
                break;
            case "pedra":
                System.out.println("Gelo");
                break;
            case "gelo":
                System.out.println("Fogo");
                break;
            case "planta":
                System.out.println("Fogo");
                break;
            default:
                System.out.println("Elemental invalido");
        }

        //CAn you guess the number?
        Scanner sc = new Scanner(System.in);
        Random randomGenerator = new Random();
        int numAleatorio = randomGenerator.nextInt(10) + 1;
        int cont = 0;

        System.out.println("Entre com o numero: ");
        int numero = sc.nextInt();

        while (numAleatorio != numero) {
            System.out.println("Entre com o numero: ");
            numero = sc.nextInt();
            cont = cont + 1;
        }

        System.out.println("Voce adivinhou o numero " + numAleatorio);
        System.out.println("Voce realizou " + cont + " tentativas");

        //Tabuada
        Scanner leitura = new Scanner(System.in);
        
        System.out.println("Qual a tabuada?");
        int tab = leitura.nextInt();
        System.out.println("Qual é o inicio?");
        int ini = leitura.nextInt();
        System.out.println("Qual é o fim?");
        int fim = leitura.nextInt();
        
        for (int i = ini; i <= fim; i++) {
            System.out.println(tab + " x " + i + " = " + (tab*i)); 
           
        }       
      
    }
}
    

