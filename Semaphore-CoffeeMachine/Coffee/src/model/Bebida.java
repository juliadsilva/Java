/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author julin
 */
public abstract class Bebida{
    
    int qtdAcucar;
    int qtdAgua;
    int qtdIngrediente;
    String name;

    public Bebida(int qtdAcucar, int qtdAgua, int qtdIngrediente, String name) {
        this.qtdAcucar = qtdAcucar;
        this.qtdAgua = qtdAgua;
        this.qtdIngrediente = qtdIngrediente;
        this.name = name;
    }

    public int getQtdAcucar() {
        return qtdAcucar;
    }

    public int getQtdAgua() {
        return qtdAgua;
    }

    public int getQtdIngrediente() {
        return qtdIngrediente;
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
 
}
