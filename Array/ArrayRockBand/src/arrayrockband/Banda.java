/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayrockband;

/**
 *
 * @author julia
 */
public class Banda {

    //Atribuitos explicitosF
    String nome;
    String genero;

    //Atributos implicitos
    //Agregação - parte independente 
    Empresario empresario;
    Musico[] musicos;

    //Associação com a musica
    Musica[] musicas;

    //Metodos   
    void mostraInfosBanda() {

        System.out.println("A: Nome da banda: " + nome);
        System.out.println("--------------------------");
        System.out.println("B: Genero da banda: " + genero);
        System.out.println("--------------------------");
        System.out.println("C: Empresario: ");

        if (empresario != null) {
            System.out.println("Nome: " + empresario.nome);
            System.out.println("CNPJ: " + empresario.cnpj);
        } else {
            System.out.println("Sem empresario!");
        }
        System.out.println("--------------------------");

        System.out.println("D: Musicos: ");
        for (int i = 0; i < musicos.length; i++) {
            if (musicos[i] != null) {
                System.out.println("Nome: " + musicos[i].nome);
                System.out.println("Funcao: " + musicos[i].funcao);
                System.out.println("********");
            }
        }
        System.out.println("--------------------------");

        System.out.println("E: Musicas: ");
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] != null) {
                System.out.println("Nome: " + musicas[i].nome);
                System.out.println("Tempo: " + musicas[i].tempo);
                System.out.println("********");
            }
        }
        System.out.println("--------------------------");
    }
}
