/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author julia
 */
public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Conta c1 = new Conta();

        c1.sacar(250);

        System.out.println(c1.getSaldo());
    }
}
