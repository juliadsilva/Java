/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascontacliente;

/**
 *
 * @author julia
 */
public class Conta {

    private static int qtdClientes;

    private double saldo;

    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.qtdClientes++;
    }

    public void deposita(double valor) {

        this.saldo += valor;
        System.out.println("Valor depositado: " + valor);
        System.out.println("Saldo total: " + saldo);
    }

    public void saca(double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
            System.out.println("Valor sacado: " + valor);
            System.out.println("Saldo total: " + saldo);
        }
    }

    public void extrato() {

        System.out.println("---------- Extrato ---------");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF:" + cliente.getCpf());
        System.out.println("Saldo: " + this.saldo);
        System.out.println("---------------------------");

    }
    
    public void editarCadastro(String nome){
        
       cliente.getNome();
        
    }

    public static int getQtdClientes() {
        return qtdClientes;
    }
}
