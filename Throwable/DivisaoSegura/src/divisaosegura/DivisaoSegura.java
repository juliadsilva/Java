/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisaosegura;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class DivisaoSegura {

    public static void main(String[] args) {
        while (true) {
            try {
                // JOptionPane para solicitar informações
                // Input dialog
                int numero1 = Integer.parseInt(JOptionPane.
                        showInputDialog("Qual o primeiro numero?"));

                int numero2 = Integer.parseInt(JOptionPane.
                        showInputDialog("Qual o segundo numero?"));

                //Message dialog
                JOptionPane.showMessageDialog(null,
                        "Resultado Divisao: " + numero1 / numero2);

            } catch (ArithmeticException e1) {
                JOptionPane.showMessageDialog(null, "ERRO! Divisao por 0");
            } catch (NumberFormatException e2) {
                JOptionPane.showMessageDialog(null, "ERRO! Entre com um numero inteiro.");
            }
        }
    }
}
