/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariokart;

/**
 *
 * @author julia
 */
public class Kart {
    
    String nome;
    
    void pular(){
        System.out.println("O kart " + nome + " pulou");
    }
    
    void soltarTurbo(){
        System.out.println("O kart " + nome + " soltou turbo");
    }
    
    void fazerDrift(){
         System.out.println("O kart " + nome + " fez drift");
        
    }
    
    //Agregação
    Piloto piloto;
    
    //Composição
    Motor motor1 = new Motor();
    Motor motor2 = new Motor();
}
