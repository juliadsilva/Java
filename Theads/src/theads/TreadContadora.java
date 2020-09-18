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
public class TreadContadora extends Thread {

    String nome;

    public TreadContadora(String n) {

        nome = n;
    }

    //Toda thread tenha um metodo run
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(nome + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }

        }
    }
}
