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
public class Executar implements Runnable{ 
    
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

    public Executar(Bebida bebida, Maquina maquina) {
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
    
    public void executar(Bebida bebida, Maquina maquina){
        
        maquina.setNivelCopo(maquina.getNivelCopo() - 1);
        
        if (bebida instanceof Cafe) {  
            maquina.setNivelAgua(maquina.getNivelAgua() - qtdAgua);
            maquina.setNivelAçucar(maquina.getNivelAçucar() - qtdAcucar);
            maquina.setNivelCafe(maquina.getNivelCafe() - qtdIngrediente);
        }
        else if (bebida instanceof Chocolate) {  
            maquina.setNivelAgua(maquina.getNivelAgua() - qtdAgua);
            maquina.setNivelAçucar(maquina.getNivelAçucar() - qtdAcucar);
            maquina.setNivelChocolate(maquina.getNivelChocolate() - qtdIngrediente/2);
            maquina.setNivelLeite(maquina.getNivelLeite() - qtdIngrediente/2);
        }
        else if (bebida instanceof Pingado) {  
            maquina.setNivelAgua(maquina.getNivelAgua() - qtdAgua);
            maquina.setNivelAçucar(maquina.getNivelAçucar() - qtdAcucar);
            maquina.setNivelCafe(maquina.getNivelCafe() - qtdIngrediente/2);
            maquina.setNivelLeite(maquina.getNivelLeite() - qtdIngrediente/2);
        }
        else if (bebida instanceof AguaQuente) {  
            maquina.setNivelAgua(maquina.getNivelAgua() - qtdAgua);
        }
    }   

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
