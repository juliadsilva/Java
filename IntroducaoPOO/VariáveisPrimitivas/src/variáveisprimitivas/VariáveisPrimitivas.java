/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variáveisprimitivas;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class VariáveisPrimitivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //De acordo com a opção do usuario imprima a tabela verdade do operador desejado (E ou OU)
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a op: (E/OU)");
        String op = sc.nextLine().toUpperCase();

        while (!op.equals("E") && !op.equals("OU")) {
            System.out.println("Entre com a op: (E/OU)");
            op = sc.nextLine().toUpperCase();
        }

        switch (op) {
            case "E":
                System.out.println("O E O = 0");
                System.out.println("O E 1 = 0");
                System.out.println("1 E O = 0");
                System.out.println("1 E 1 = 1");
                break;

            case "OU":
                System.out.println("O E O = 0");
                System.out.println("O E 1 = 1");
                System.out.println("1 E O = 1");
                System.out.println("1 E 1 = 1");
                break;

        }

        //Calculo IMC
        System.out.println("Entre com seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Entre com sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("%s %.2f %n", "O IMC é:", imc);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal - Parabens");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade Grau 1");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade Grau 2");
        } else {
            System.out.println("Obesidade Grau 3");
        }

        //Calculadora
        System.out.println("Entre com o primeiro valor: ");
        double n1 = sc.nextDouble();
        System.out.println("Entre com o segundo valor: ");
        double n2 = sc.nextDouble();

        int si = -1;
        while (si != 0) {
            System.out.println("[1] Soma");
            System.out.println("[2] Subtração");
            System.out.println("[3] Multiplicação");
            System.out.println("[4] Divisão");
            System.out.println("[0] Sair");

            System.out.println("Entre com uma opção: ");
            si = sc.nextInt();

            switch (si) {
                case 1:
                    System.out.println("Resultado: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (n1 * n2));
                    break;
                case 4:
                    if (n2 == 0) {
                        System.out.println("Valor invalido: n2=0");
                    } else {
                        System.out.println("Resultado: " + (n1 / n2));
                    }
                    break;
                case 0:
                    break;
            }

        }

        //Senha invalida
        String SENHA_CORRETA = "2002";
        System.out.println("Entre com a senha: ");
        String senha = sc.nextLine();

        while (!senha.equals(SENHA_CORRETA)) {
            System.out.println("Senha invalida");
            System.out.println("Entre com a senha: ");
            senha = sc.nextLine();
        }

        System.out.println("Acesso permitido");

        sc.close();

    }

}
