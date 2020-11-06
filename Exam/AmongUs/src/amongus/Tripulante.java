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
public class Tripulante extends Astronauta implements Task {

    private int numTask;  

    @Override
    public void reportar() {
        System.out.println("O tripulante reportou um corpo");
    }

    @Override
    public void votar() {
        System.out.println("O tripulante votou");
    }

    @Override
    public void fazerTask() {
        numTask++;
        System.out.println("Task completa!!!");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de Task Feitas: " + numTask);
        System.out.println("-------------------------");
    }
}
