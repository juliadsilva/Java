/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcmania;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class PcMania {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opcao = -1; //Variavel para o cliente escolher a opção do menu
        int i = -1; //Variavel para contar a quantidade de computadores comprados
        float total; //retorno da função

        //Inicalização do scanner
        Scanner valorTeclado = new Scanner(System.in);

        //Vetor de computadores
        Computador[] comp_aux = new Computador[100];

        //Cadastro dos produtos
        //Promoção 01
        Computador promo1 = new Computador();
        promo1.marca = "Positivo";
        promo1.preco = 13000;

        HardwareBasico hard1 = new HardwareBasico("Pentium Core i3", 1200);
        promo1.hardwares[0] = hard1;
        HardwareBasico hard2 = new HardwareBasico("Memoria RAM", 4);
        promo1.hardwares[1] = hard2;
        HardwareBasico hard3 = new HardwareBasico("HD", 500);
        promo1.hardwares[2] = hard3;

        promo1.so.nome = "Linux Ubuntu";
        promo1.so.tipo = 32;
        
        MemoriaUsb mem1 = new MemoriaUsb();
        mem1.nome = "Pen-drive";
        mem1.capacidade = 16;
        promo1.addMemoriaUSB(mem1);

        //Promoção 02
        Computador promo2 = new Computador();
        promo2.marca = "Acer";
        promo2.preco = 1800;

        HardwareBasico hard4 = new HardwareBasico("Pentium Core i5", 2260);
        promo2.hardwares[0] = hard4;
        HardwareBasico hard5 = new HardwareBasico("Memoria RAM", 8);
        promo2.hardwares[1] = hard5;
        HardwareBasico hard6 = new HardwareBasico("HD", 1000);
        promo2.hardwares[2] = hard6;

        promo2.so.nome = "Windows 8";
        promo2.so.tipo = 64;
        
        MemoriaUsb mem2 = new MemoriaUsb();
        mem2.nome = "Pen-drive";
        mem2.capacidade = 32;
        promo2.addMemoriaUSB(mem2);
        
        //Promoção 03
        Computador promo3 = new Computador();
        promo3.marca = "Vaio";
        promo3.preco = 2800;

        HardwareBasico hard7 = new HardwareBasico("Pentium Core i7", 3500);
        promo3.hardwares[0] = hard7;
        HardwareBasico hard8 = new HardwareBasico("Memoria RAM", 16);
        promo3.hardwares[1] = hard8;
        HardwareBasico hard9 = new HardwareBasico("HD", 2000);
        promo3.hardwares[2] = hard9;

        promo3.so.nome = "Windows 10";
        promo3.so.tipo = 64;    
        
        MemoriaUsb mem3 = new MemoriaUsb();
        mem3.nome = "HD";
        mem3.capacidade = 1000;
        promo3.addMemoriaUSB(mem3);
       
        //Cadastro do cliente
        Cliente cliente = new Cliente();
        System.out.println("Seja bem-vindo a PC Mania");
        System.out.println("Entre com seus dados");
        System.out.println("Nome: ");
        cliente.nome = valorTeclado.nextLine();
        System.out.println("CPF: ");
        cliente.cpf = valorTeclado.nextLong();

        while (opcao != 0) {

            System.out.println("Escolha uma opção:");
            System.out.println("[1] Mostrar menu de computadores");
            System.out.println("[2] Comprar um computador");
            System.out.println("[0] Finalizar comprar");

            opcao = valorTeclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Computador 1");
                    promo1.mostraPCConfigs();
                    System.out.println("Computador 2");
                    promo2.mostraPCConfigs();
                    System.out.println("Computador 3");
                    promo3.mostraPCConfigs();
                    break;
                case 2:
                    i++;
                    System.out.println("Qual computador deseja comprar?");
                    System.out.println("Digite o codigo");
                    int codigo = valorTeclado.nextInt();

                    switch (codigo) {
                        case 1:
                            comp_aux[i] = promo1;
                            break;
                        case 2:
                            comp_aux[i] = promo2;
                            break;
                        case 3:
                            comp_aux[i] = promo3;
                            break;
                    }
                    break;
            }

            cliente.computadores = comp_aux;
        }

        //Informações do Cliente, dos PC’s adquiridos por ele e o total da sua compra
        System.out.println("");
        System.out.println("Informações da Compra");
        System.out.println("-------------------------------------------");
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("CPF: " + cliente.cpf + "\n");

        total = cliente.calculaTotalCompra();
        System.out.printf("Total: R$ %.2f \n", total);

        System.out.println("Obrigada!");

        valorTeclado.close();
    }

}
