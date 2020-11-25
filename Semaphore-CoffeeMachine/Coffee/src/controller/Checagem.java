/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.*;

/**
 *
 * @author julin
 */
public class Checagem implements Runnable{ 
    
    protected int qtdAcucar;
    protected int qtdAgua;
    protected int qtdIngrediente;   
    protected int nivelAgua;
    protected int nivelAçucar;
    protected int nivelCafe;
    protected int nivelLeite;
    protected int nivelChocolate;
    protected int nivelCopo;
    protected int opcao;

    public Checagem(Bebida bebida, Maquina maquina) {
        this.qtdAcucar = bebida.getQtdAcucar();
        this.qtdAgua = bebida.getQtdAgua();
        this.qtdIngrediente = bebida.getQtdIngrediente();
        this.nivelAgua = maquina.getNivelAgua();
        this.nivelAçucar = maquina.getNivelAçucar();
        this.nivelCafe = maquina.getNivelCafe();
        this.nivelLeite = maquina.getNivelLeite();
        this.nivelChocolate = maquina.getNivelChocolate();
        this.nivelCopo = maquina.getNivelCopo();
    }
    
    public void opcao(Bebida bebida){
      
        if (bebida instanceof Cafe) {  
            opcao = 1;
        }
        else if (bebida instanceof Chocolate) {  
            opcao = 2;
        }
        else if (bebida instanceof Pingado) {  
            opcao = 3;
        }  
    }

    @Override
    public void run() {
        
        if (nivelAgua > qtdAgua) {  
            System.out.println("Água ok");
        }
        if (nivelAçucar > qtdAcucar) {  
            System.out.println("Açucar ok");
        }
        if (nivelCopo > 1) {  
            System.out.println("Copo ok");
        }
        
        switch(opcao){
            case 1: 
                if(nivelCafe > qtdIngrediente)
                    System.out.println("Café ok");
                break;
            case 2: 
                if(nivelChocolate > qtdIngrediente/2)
                    System.out.println("Chocolate ok");
                if(nivelLeite > qtdIngrediente/2)
                    System.out.println("Leite ok");
                break;
            case 3:
                if(nivelCafe > qtdIngrediente/2)
                     System.out.println("Café ok");
                if(nivelLeite > qtdIngrediente/2)
                    System.out.println("Leite ok");
                break;
        }          
        
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
  }

}

    