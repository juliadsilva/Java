/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campominado;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author julia
 */
public class CampoMinado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner valorTeclado = new Scanner(System.in);
        Random randomGenerator = new Random();

        int localBombaLinha = randomGenerator.nextInt(3);
        int localBombaColuna = randomGenerator.nextInt(3);

        int[][] campoMinado = new int[3][3]; //campo minado
        int linha; //entrada do usuario 
        int coluna; //entrada do usuario 
        int cont = 0; //contatdor

        //Inicializando o campo em que 0-sem bomba e 1-bomba
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                campoMinado[i][j] = 0;
            }
        }

        //Colocando o bomba
        campoMinado[localBombaLinha][localBombaColuna] = 1;

        //Jogando!!!
        for (int i = 0; i < 8; i++) {
            cont++;
            System.out.println("Entre com a posição da matriz [linha][coluna]: ");
            linha = valorTeclado.nextInt();
            coluna = valorTeclado.nextInt();

            if (campoMinado[linha][coluna] == 0) {
                System.out.println("Muito Bom!");
            } else {
                System.out.println("BOOOOMMMMMMM!");
                System.out.println("Game Over!");
                System.out.println("Voce realizou " + cont + " tentativas");
                break;
            }
        }

        if (cont == 8) {
            System.out.println("Parabens");
            System.out.println("Você ZEROU o jogo");
        }
    }
}
