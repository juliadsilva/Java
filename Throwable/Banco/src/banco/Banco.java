/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Conta c = new Conta(1, "Julia", 3500);

        c.depositar(1500);
        c.depositar(4000);

        try {
            c.sacar(3501);
        } catch (SaldoInsuficienteException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
