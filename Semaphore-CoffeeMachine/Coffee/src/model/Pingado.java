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
public class Pingado extends Bebida {
       
    
    public static final int qtdAgua = 5;
    public static final int qtdIngrediente = 40;
    private int qtdAcucar;
    
    public Pingado (int qtdAcucar) {
        super(qtdAcucar, qtdAgua, qtdIngrediente, "Café com Leite");
    }
    
}
