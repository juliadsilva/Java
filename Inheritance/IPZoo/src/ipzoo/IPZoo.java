/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipzoo;

/**
 *
 * @author Administrador
 */
public class IPZoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Zoologico zoo = new Zoologico();
        zoo.setNome("Zoo");
        zoo.setEndereco("Rua Bixo, 123, Rural");

        Coruja coruja = new Coruja();
        Peixe peixe = new Peixe();
        Leao leao = new Leao();
        Pato pato = new Pato();

        coruja.nome = "Edwiges";
        coruja.nPatas = 2;
        coruja.cor = "Cinza";
        coruja.setAlturaVoo(200);

        peixe.nome = "Nemo";
        peixe.nPatas = 0;
        peixe.cor = "Laranja";
        peixe.setnBarbatanas(2);

        leao.nome = "Alex";
        leao.nPatas = 4;
        leao.cor = "Caramelo";
        leao.setTamanhoJuba(50);

        pato.nome = "Donalds";
        pato.nPatas = 2;
        pato.cor = "Branco";
        pato.setTamanhoBico(10);

        //Zoologico
        zoo.getAnimais()[0] = coruja;
        zoo.getAnimais()[1] = peixe;
        zoo.getAnimais()[2] = leao;
        zoo.getAnimais()[3] = pato;

        //Varrendo vetor de animais
        for (int i = 0; i < zoo.getAnimais().length; i++) {
            
            if (zoo.getAnimais()[i] != null) {
                System.out.println("Nome: " + zoo.getAnimais()[i].nome);
                System.out.println("Patas: " + zoo.getAnimais()[i].nPatas);
                System.out.println("Cor: " + zoo.getAnimais()[i].cor);
            }

            if (zoo.getAnimais()[i] instanceof Coruja) {
                Coruja corujaaux = (Coruja) zoo.getAnimais()[i];
                System.out.println("Altura Voo: " + corujaaux.getAlturaVoo());
                corujaaux.fazBarulho();
            } else if (zoo.getAnimais()[i] instanceof Peixe) {
                Peixe peixeaux = (Peixe) zoo.getAnimais()[i];
                System.out.println("Barbatanas: " + peixeaux.getnBarbatanas());
                peixeaux.fazBarulho();
            } else if (zoo.getAnimais()[i] instanceof Leao) {
                Leao leaoaux = (Leao) zoo.getAnimais()[i];
                System.out.println("Juba: " + leaoaux.getTamanhoJuba() + " cm");
                leaoaux.fazBarulho();
            } else if (zoo.getAnimais()[i] instanceof Pato) {
                Pato patoaux = (Pato) zoo.getAnimais()[i];
                System.out.println("Bico: " + patoaux.getTamanhoBico() + " cm");
                patoaux.fazBarulho();
            }
        }
    }
}
