/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amongus;

/**
 *
 * @author Administrador
 */
public class AmongUs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Nave nave = new Nave();

        Astronauta tripulante1 = new Tripulante();
        tripulante1.nome = "Vitor";
        tripulante1.cor = "Azul";
        tripulante1.skin.setTipo("Policial");
        tripulante1.pet.setPet("Cachorro");
        nave.addAstronauta(tripulante1);

        Astronauta tripulante2 = new Tripulante();
        tripulante2.nome = "Pedro";
        tripulante2.cor = "Branco";
        tripulante2.skin.setTipo("Medico");
        nave.addAstronauta(tripulante2);

        Astronauta impostor = new Impostor();
        impostor.nome = "Loki";
        impostor.cor = "Vermelho";
        impostor.skin.setTipo("Capitao");
        impostor.pet.setPet("Pantera Lunar");
        nave.addAstronauta(impostor);

        nave.listarAstrounatas();
    }
}
