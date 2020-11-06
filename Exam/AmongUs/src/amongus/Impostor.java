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
public class Impostor extends Astronauta implements Executar, Task {

    private int numMortes;

    public void sabotarReator() {
        System.out.println("O impostor sabotou o reator");
    }

    public void sabotarOxigenio() {
        System.out.println("O impostor sabotou o oxigênio");
    }

    public void sabotarLuz() {
        System.out.println("O impostor sabotou a luz");
    }

    @Override
    public void reportar() {
        System.out.println("O impostor fez um kill report");
    }

    @Override
    public void votar() {
        System.out.println("O impostor votou");
    }

    @Override
    public void executar() {
        numMortes++;
        System.out.println("Executou!!!");
    }

    @Override
    public void fazerTask() {
        System.out.println("Fez uma fake task");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de Mortes: " + numMortes);
        System.out.println("-------------------------");
    }
}
