/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theads;

/**
 *
 * @author julia
 */
public class Theads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criando as threas
        TreadContadora t1 = new TreadContadora("Thread 1");
        TreadContadora t2 = new TreadContadora("Thread 2");
        TreadContadora t3 = new TreadContadora("Thread 3");
        
        //Colocando para executar
        t1.start();
        t2.start();
        t3.start();
    }
}
