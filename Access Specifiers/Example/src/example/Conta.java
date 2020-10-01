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
public class Conta {

    //Modificadores de acesso:
    //1. PUBLIC: deixa o resto do seu programa ver o recurso
    //2. Private: deixa apenas a propria classe acessar o recurso
    private int numero;
    private float saldo = 5000;

    public void sacar(float quantia) {
        if ((saldo - quantia) >= 0) {

            saldo = saldo - quantia;
            System.out.println("Saque realizado com sucesso! Novo saldo: " + saldo);
        }else 
            System.out.println("Saque não realizado! Saldo insuficiente!");
    }

    public float getSaldo() {

        //Posso colocar logica aqui 
        return saldo;
    }

    public void setSaldo(float saldo) {

        //Posso colocar logica aqui 
        this.saldo = saldo;
    }

}
