/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.MainFrame;

/**
 *
 * @author julin
 */
public class Mixer implements Runnable{
    FilaPreparo fila;
    String ingredientes;
    boolean usarSemaforo;
    
    public Mixer(FilaPreparo fila, String ingredientes, boolean usarSemaforo){
        this.fila = fila;
        this.ingredientes = ingredientes;
        this.usarSemaforo = usarSemaforo;
    }
    
    @Override
    public void run() {
        MainFrame.addSaidaConsole("\nPronto para começar o " + Thread.currentThread().getName());
        if(usarSemaforo) fila.prepraBebida(ingredientes);
        else fila.prepraBebidaSemSemaforo(ingredientes);
    }
}
