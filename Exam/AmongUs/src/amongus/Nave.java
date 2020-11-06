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
public class Nave {

    private int k = 0;

    Astronauta[] astronautas = new Astronauta[10];
    
    public void addAstronauta(Astronauta astronauta) {
        k = astronauta.getQtdAustronauta();
        astronautas[k] = astronauta;
    }

    public void listarAstrounatas() {
        System.out.println("*****Astrounatas*****\n");
        for (int i = 0; i < astronautas.length; i++) {

            if (astronautas[i] != null) {

                if (astronautas[i] instanceof Tripulante) {
                    System.out.println("***Tripulante***");
                    Tripulante triaux = (Tripulante) astronautas[i];
                    triaux.votar();
                    triaux.fazerTask();
                    triaux.reportar();
                    triaux.mostrarInfo();
                } else if (astronautas[i] instanceof Impostor) {
                    System.out.println("***Impostor***");
                    Impostor impaux = (Impostor) astronautas[i];
                    impaux.votar();
                    impaux.sabotarReator();
                    impaux.sabotarOxigenio();
                    impaux.sabotarLuz();
                    impaux.executar();
                    impaux.reportar();
                    impaux.fazerTask();
                    impaux.mostrarInfo();
                }
            }
        }

        System.out.println("Numero de Astronautas: " + k);
    }
}
