/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingjulia;

/**
 *
 * @author julia
 */
public class Plataforma {

    public String nome;
    public String empresa;
    public String dominio;
    public String dataFundacao;
    public String fundador;

    public Serie[] series = new Serie[10];

    void exibirinfos() {
        System.out.println("------ Plataforma -----");
        System.out.println("Nome: " + nome);
        System.out.println("Empresa: " + empresa);
        System.out.println("Dominio: " + dominio);
        System.out.println("Data de Fundacao: " + dataFundacao);
        System.out.println("Fundador: " + fundador);
        exibirSeries();        
    }

    void exibirSeries() {
        for (int i = 0; i < series.length; i++) {
            System.out.println("------ Serie -----");
            if (series[i] != null) {
                System.out.print(i + ") ");
                System.out.println("Nome: " + series[i].nome);
                System.out.println("Categoria: " + series[i].categoria);
                System.out.println("Classificacao: " + series[i].classificacao);
                System.out.println("Temporada: " + series[i].temporada);
                System.out.println("Atores: ");
                System.out.println("1) " + series[i].atores[0]);
                System.out.println("2) " + series[i].atores[1]);
                System.out.println("3) " + series[i].atores[2]);
                System.out.println("*Produtora*");
                System.out.println("Nome: " + series[i].produtora.nome);
                System.out.println("Diretor: " + series[i].produtora.diretor);
                System.out.println("---------------------------------------");
            }
        }
    }

    double calculaMediaNotas() {
        return 0;
    }
}