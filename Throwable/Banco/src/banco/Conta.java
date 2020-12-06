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
public class Conta {

    private int numero;
    private double saldo;
    private String nome;
    private double limite;

    public Conta(int numero, String nome, double limite) {
        this.numero = numero;
        this.nome = nome;
        this.limite = limite;
    }

    public void depositar(int valor) {
        saldo = saldo + valor;
        System.out.println("Saldo Atual: " + saldo);
    }

    public void sacar(int valor) {
        if (valor > saldo) {
           throw new SaldoInsuficienteException("Saldo Insuficiente");
        }
        if (valor > limite) {
            throw new SaldoInsuficienteException("Valor maior que o limite");
        }

        saldo = saldo - valor;
        System.out.println("Saldo Atual: " + saldo);
    }
}
