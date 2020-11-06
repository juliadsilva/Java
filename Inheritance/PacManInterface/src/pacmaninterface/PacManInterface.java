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
        int[][] campo = new int[100][100]; //campo minado

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
        pink.posicaoY = 99;
        campo[pink.posicaoX][pink.posicaoY] = 1;

        blue.posicaoX = 99;
        blue.posicaoY = 0;
        campo[blue.posicaoX][blue.posicaoY] = 1;

        orange.posicaoX = 99;
        orange.posicaoY = 99;
        campo[orange.posicaoX][orange.posicaoY] = 1;

        // Inicializando o PacMan
        pac.posicaoX = 50;
        pac.posicaoY = 50;
        campo[pac.posicaoX][pac.posicaoY] = 2;

        //Inicializado vidas e pontuação
        pac.setVidas(3);
        pac.setPontuacao(0);

        //Jogando
        Random random = new Random();

        //Ordem de movimentos: inimigos e PacMan 
        while (pac.getVidas() != 0) {

            //Movimento dos inimigos 
            //Zerando as posições anteriores
            campo[red.posicaoX][red.posicaoY] = 0;
            campo[pink.posicaoX][pink.posicaoY] = 0;
            campo[blue.posicaoX][blue.posicaoY] = 0;
            campo[orange.posicaoX][orange.posicaoY] = 0;

            //Numero aleatorio para definir qual movimento será executado
            int ale_red = 0 + random.nextInt(4);
            int ale_pink = 0 + random.nextInt(4);
            int ale_blue = 0 + random.nextInt(4);
            int ale_orange = 0 + random.nextInt(4);

            switch (ale_red) {
                case 0:
                    if (red.posicaoY != 0) {
                        red.movePraCima();
                    }
                    break;
                case 1:
                    if (red.posicaoY != 99) {
                        red.movePraBaixo();
                    }
                    break;
                case 2:
                    if (red.posicaoX != 99) {
                        red.movePraDireita();
                    }
                    break;
                case 3:
                    if (red.posicaoX != 0) {
                        red.movePraEsquerda();
                    }
                    break;
            }

            switch (ale_pink) {
                case 0:
                    if (pink.posicaoY != 0) {
                        pink.movePraCima();
                    }
                    break;
                case 1:
                    if (pink.posicaoY != 99) {
                        pink.movePraBaixo();
                    }
                    break;
                case 2:
                    if (pink.posicaoX != 99) {
                        pink.movePraDireita();
                    }
                    break;
                case 3:
                    if (pink.posicaoX != 0) {
                        pink.movePraEsquerda();
                    }
                    break;
            }

            switch (ale_blue) {
                case 0:
                    if (blue.posicaoY != 0) {
                        blue.movePraCima();
                    }
                    break;
                case 1:
                    if (blue.posicaoY != 99) {
                        blue.movePraBaixo();
                    }
                    break;
                case 2:
                    if (blue.posicaoX != 99) {
                        blue.movePraDireita();
                    }
                    break;
                case 3:
                    if (blue.posicaoX != 0) {
                        blue.movePraEsquerda();
                    }
                    break;
            }

            switch (ale_orange) {
                case 0:
                    if (orange.posicaoY != 0) {
                        orange.movePraCima();
                    }
                    break;
                case 1:
                    if (orange.posicaoY != 99) {
                        orange.movePraBaixo();
                    }
                    break;
                case 2:
                    if (orange.posicaoX != 99) {
                        orange.movePraDireita();
                    }
                    break;
                case 3:
                    if (orange.posicaoX != 0) {
                        orange.movePraEsquerda();
                    }
                    break;
            }

            //Posições atualizadas
            campo[red.posicaoX][red.posicaoY] = 1;
            campo[pink.posicaoX][pink.posicaoY] = 1;
            campo[blue.posicaoX][blue.posicaoY] = 1;
            campo[orange.posicaoX][orange.posicaoY] = 1;

            //Movimento do PacMan
            boolean morreu = false;

            //Zerando as posição anterior
            campo[pac.posicaoX][pac.posicaoY] = 0;

            //Numero aleatorio para definir qual movimento será executado
            int ale_pac = 0 + random.nextInt(4);

            switch (ale_pac) {
                case 0:
                    if (pac.posicaoY != 0) {
                        pac.movePraCima();
                        if (campo[pac.posicaoX][pac.posicaoY] == 1) {
                            morreu = true;
                        } else {
                            pac.ganhaPonto();
                        }
                    }
                    break;
                case 1:
                    if (pac.posicaoY != 99) {
                        pac.movePraBaixo();
                        if (campo[pac.posicaoX][pac.posicaoY] == 1) {
                            morreu = true;
                        } else {
                            pac.ganhaPonto();
                        }
                    }
                    break;
                case 2:
                    if (pac.posicaoX != 99) {
                        pac.movePraDireita();
                        if (campo[pac.posicaoX][pac.posicaoY] == 1) {
                            morreu = true;
                        } else {
                            pac.ganhaPonto();
                        }
                    }
                    break;
                case 3:
                    if (pac.posicaoX != 0) {
                        pac.movePraEsquerda();
                        if (campo[pac.posicaoX][pac.posicaoY] == 1) {
                            morreu = true;
                        } else {
                            pac.ganhaPonto();
                        }
                    }
                    break;
            }

            //Posição atualizada
            campo[pac.posicaoX][pac.posicaoY] = 2;

            //Caso, o PacMan perde a vida. Os personagens devem voltar a posição inicial
            if (morreu) {

                pac.perdeVida();
                red.posicaoX = 0;
                red.posicaoY = 0;
                campo[red.posicaoX][red.posicaoY] = 1;

                pink.posicaoX = 0;
                pink.posicaoY = 99;
                campo[pink.posicaoX][pink.posicaoY] = 1;

                blue.posicaoX = 99;
                blue.posicaoY = 0;
                campo[blue.posicaoX][blue.posicaoY] = 1;

                orange.posicaoX = 99;
                orange.posicaoY = 99;
                campo[orange.posicaoX][orange.posicaoY] = 1;

                pac.posicaoX = 50;
                pac.posicaoY = 50;
                campo[pac.posicaoX][pac.posicaoY] = 2;

                morreu = false;
            }
        }

        System.out.println("GAME OVER!");
        System.out.println("Pontuacao: " + pac.getPontuacao());
    }
}
