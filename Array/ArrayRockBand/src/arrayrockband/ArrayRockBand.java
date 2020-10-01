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
public class ArrayRockBand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Empresario emp = new Empresario(1234567, "Itamar");

        //Criando musicos
        Musico[] musico_aux = new Musico[100];

        Musico mus1 = new Musico("Davi Restani", "Guitarista");
        Musico mus2 = new Musico("Julia Daniele", "Baterista");
        Musico mus3 = new Musico("Leo Brandão", "Vocalista");

        musico_aux[0] = mus1;
        musico_aux[1] = mus2;
        musico_aux[2] = mus3;

        //Criando musicas
        Musica[] musicas_aux = new Musica[100];

        Musica music1 = new Musica("Sweet Child of Mine", "4:30");
        Musica music2 = new Musica("Faroeste Caboclo", "9:00");
        Musica music3 = new Musica("Baroes da Pisadinha", "11:00");

        musicas_aux[0] = music1;
        musicas_aux[1] = music2;
        musicas_aux[2] = music3;

        Banda band = new Banda();
        band.nome = "Jump of the cats";
        band.genero = "Rock n Roll";
        band.empresario = emp;
        band.musicos = musico_aux;
        band.musicas = musicas_aux;
        
        band.mostraInfosBanda();
    }
}
