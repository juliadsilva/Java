/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Calculos c = new Calculos();

        c.setNum1(Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o valor 1: ")));
        c.setNum2(Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o valor 2: ")));

        //JOptionPane.showMessageDialog(null, "Resultado: " + c.soma());
        //JOptionPane.showMessageDialog(null, "Resultado: " + c.sub());
        //JOptionPane.showMessageDialog(null, "Resultado: " + c.mult());
        JOptionPane.showMessageDialog(null, "Resultado: " + c.div());
    }
}
