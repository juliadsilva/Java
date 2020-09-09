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
public class Piloto {
    
    String nome;
    boolean vilao; //True - vilão / False - mocinho
    
    void soltaSuperPoder(){
        System.out.println("O piloto " + nome + " soltou um super poder");
    }
}
