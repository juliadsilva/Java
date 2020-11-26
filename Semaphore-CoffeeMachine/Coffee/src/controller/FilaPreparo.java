/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.concurrent.Semaphore;
import view.MainFrame;

/**
 *
 * @author julin
 */
public class FilaPreparo {
    Semaphore semaforo = new Semaphore(1);
    
    public void prepraBebidaSemSemaforo(String ingredientes) {
        MainFrame.addSaidaConsole("\nMisturando: " + ingredientes);
        MainFrame.addSaidaConsole("\n" + Thread.currentThread().getName() + " está pronto!");
    }
    
    public void prepraBebida(String ingredientes) {
        try {
            semaforo.acquire(); 
             MainFrame.addSaidaConsole("\nMisturando: " + ingredientes);
             Thread.sleep(500);
        } catch (InterruptedException ex) {} 
        finally {
            MainFrame.addSaidaConsole("\n" + Thread.currentThread().getName() + " está pronto!");
            semaforo.release(); 
        }
    }
}
