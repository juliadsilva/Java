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
public class ASContaCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Julia", 123456789);
        Conta conta1 = new Conta(c1);

        conta1.deposita(1375);
        conta1.saca(75);
        conta1.extrato();

        Cliente c2 = new Cliente("Ana", 13444425);
        Conta conta2 = new Conta(c2);

        conta2.deposita(6225);
        conta2.saca(1400);
        conta2.extrato();
        
        System.out.println("Quantidade de clientes do banco é: " + Conta.getQtdClientes());
    }
}
