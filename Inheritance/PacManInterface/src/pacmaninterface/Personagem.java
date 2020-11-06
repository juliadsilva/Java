/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmaninterface;

/**
 *
 * @author Administrador
 */
public class Personagem implements Movel {
    
    protected String cor;
    protected int posicaoX;
    protected int posicaoY;

    @Override
    public void movePraCima() {
        posicaoY--; 
    }

    @Override
    public void movePraBaixo() {
        posicaoY++;
    }

    @Override
    public void movePraDireita() {
        posicaoX++;
    }

    @Override
    public void movePraEsquerda() {
        posicaoX--;
    }
    
}
