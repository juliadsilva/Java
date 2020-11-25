/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.FilaPreparo;

/**
 *
 * @author julin
 */
public class Maquina {
    
    private int nivelAgua = 100;
    private int nivelAçucar = 50;
    private int nivelCafe = 100;
    private int nivelLeite = 100;
    private int nivelChocolate = 100;
    private int nivelCopo = 50;
    
    private FilaPreparo filaPreparo;

    public Maquina() {
        this.filaPreparo = new FilaPreparo();
        System.out.println("Maquina Ligada");
    }
    
    public FilaPreparo getFilaPreparo() {
        return filaPreparo;
    }

    
    public int getNivelAgua() {
        return nivelAgua;
    }

    public void setNivelAgua(int nivelAgua) {
        this.nivelAgua = nivelAgua;
    }

    public int getNivelAçucar() {
        return nivelAçucar;
    }

    public void setNivelAçucar(int nivelAçucar) {
        this.nivelAçucar = nivelAçucar;
    }

    public int getNivelCafe() {
        return nivelCafe;
    }

    public void setNivelCafe(int nivelCafe) {
        this.nivelCafe = nivelCafe;
    }

    public int getNivelLeite() {
        return nivelLeite;
    }

    public void setNivelLeite(int nivelLeite) {
        this.nivelLeite = nivelLeite;
    }

    public int getNivelChocolate() {
        return nivelChocolate;
    }

    public void setNivelChocolate(int nivelChocolate) {
        this.nivelChocolate = nivelChocolate;
    }

    public int getNivelCopo() {
        return nivelCopo;
    }

    public void setNivelCopo(int nivelCopo) {
        this.nivelCopo = nivelCopo;
    }
    
    
    
    
}
