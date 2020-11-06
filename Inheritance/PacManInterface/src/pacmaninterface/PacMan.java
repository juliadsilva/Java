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
public class PacMan extends Personagem {
    
    private int pontuacao;
    private int vidas;
    
    public void perdeVida(){
        vidas--;
    }
    
    public void ganhaPonto(){
       pontuacao++;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getVidas() {
        return vidas;
    }      
}
