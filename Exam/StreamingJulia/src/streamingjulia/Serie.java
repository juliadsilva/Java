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
public class Serie {

    public String nome;
    public String categoria;
    public double classificacao;
    public int temporada;

    public String[] atores = new String[3];

    public Produtora produtora = new Produtora();

    void mostraInfos() {
        System.out.println("------ Serie -----");
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Classificacao: " + classificacao);
        System.out.println("Temporada: " + temporada);
        System.out.println("Atores: ");
        System.out.println("1) " + atores[0]);
        System.out.println("2) " + atores[1]);
        System.out.println("3) " + atores[2]);;
        System.out.println("Produtora");
        System.out.println("Nome: " + produtora.nome);
        System.out.println("Diretor: " + produtora.diretor);
        System.out.println("---------------------------------------");
    }
}
