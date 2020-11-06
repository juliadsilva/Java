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
public class Calculos {

    private int num1;
    private int num2;

    public int soma() {
        return num1 + num2;
    }

    public int sub() {
        return num1 - num2;
    }

    public int mult() {
        return num1 * num2;
    }

    public int div() {
        int result = 0;
        try {
            result = num1 / num2;
        } catch (ArithmeticException e1) {
            JOptionPane.showMessageDialog(null, "ERRO! Divisao por 0");
        }
        return result;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

}
