/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingjulia;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class StreamingJulia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner valorTeclado = new Scanner(System.in);

        System.out.println("Bem-vindo!");
        Plataforma p1 = new Plataforma();
        System.out.println("Preencha os dados para cadastar a plataforma.");
        System.out.println("Nome: ");
        p1.nome = valorTeclado.nextLine();
        System.out.println("Empresa: ");
        p1.empresa = valorTeclado.nextLine();
        System.out.println("Dominio: ");
        p1.dominio = valorTeclado.nextLine();
        System.out.println("Datat de Fundação: ");
        p1.dataFundacao = valorTeclado.nextLine();
        System.out.println("Fundador: ");
        p1.fundador = valorTeclado.nextLine();

        System.out.println("Escolha um apção: ");
        System.out.println("[1] - Cadastrar series");
        System.out.println("[2] - Mostrar informações");
        System.out.println("[3] - Mostrar series");
        System.out.println("[4] - Media da Notas");
        System.out.println("[0] - Sair");

        int opcao = 5;

        while (opcao != 0) {

            opcao = valorTeclado.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Quantas series deseja cadastar: ");
                    int numSeries = valorTeclado.nextInt();

                    Serie[] serie_aux = new Serie[100];

                    for (int i = 0; i < numSeries; i++) {

                        Serie novaserie = new Serie();

                        System.out.println("Preencha os dados");
                        System.out.println("Nome: ");
                        valorTeclado.nextLine();
                        novaserie.nome = valorTeclado.nextLine();
                        System.out.println("Classificacao: ");
                        novaserie.classificacao = valorTeclado.nextDouble();
                        System.out.println("Temporada: ");
                        novaserie.temporada = valorTeclado.nextInt();
                        valorTeclado.nextLine();
                        System.out.println("Ator 1: ");
                        novaserie.atores[0] = valorTeclado.nextLine();
                        System.out.println("Ator 2: ");
                        novaserie.atores[1] = valorTeclado.nextLine();
                        System.out.println("Ator 3: ");
                        novaserie.atores[2] = valorTeclado.nextLine();
                        
                        System.out.println("Produtora");
                        System.out.println("Nome: ");
                        Produtora produtora_aux = new Produtora();
                        produtora_aux.nome = valorTeclado.nextLine();
                        System.out.println("Diretor: ");
                        produtora_aux.diretor = valorTeclado.nextLine();
                        
                        novaserie.produtora = produtora_aux;
                      
                        serie_aux[i] = novaserie;
                    }
                    
                    p1.series = serie_aux;
                    
                    break;

                case 2:
                    p1.exibirinfos();
                    break;

                case 3:
                    p1.exibirSeries();
                    break;
                case 4:
                    System.out.println("Media das notas: ");
                    p1.calculaMediaNotas();

                    break;
            }

            System.out.println("Escolha um apção: ");
            System.out.println("[1] - Cadastrar series");
            System.out.println("[2] - Mostrar informações");
            System.out.println("[3] - Mostrar series");
            System.out.println("[4] - Media da Notas");
            System.out.println("[0] - Sair");

        }

        System.out.println("Obrigada!");

        valorTeclado.close();
    }

}
