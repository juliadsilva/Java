/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmaninterface;

import java.util.Random;

/**
 *
 * @author Administrador
 */
public class PacManInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Random random = new Random();
        int[][] campo = new int[10][10]; //campo minado
        
        //Criando personagens
        PacMan pac = new PacMan();
        Inimigo red = new Inimigo();
        Inimigo pink = new Inimigo();
        Inimigo blue = new Inimigo();
        Inimigo orange = new Inimigo();
        
        // Inicializado posicoes dos inimigos
        // Inimigos = 1 e PacMan = 2
        red.posicaoX = 0;
        red.posicaoY = 0;
        campo[red.posicaoX][red.posicaoY] = 1;
        
        pink.posicaoX = 0;
        pink.posicaoY = 9;
        campo[pink.posicaoX][pink.posicaoY] = 1;
        
        blue.posicaoX = 9;
        blue.posicaoY = 0;
        campo[blue.posicaoX][blue.posicaoY] = 1;
        
        orange.posicaoX = 9;
        orange.posicaoY = 9;
        campo[orange.posicaoX][orange.posicaoY] = 1;
        
        // Inicializando o PacMan
        pac.posicaoX = 4;
        pac.posicaoY = 4;
        campo[pac.posicaoX][pac.posicaoY] = 2;
       
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(campo[i][j] + " ");  
            }
            System.out.println("");          
        }
        
        
        
        

    }

}
