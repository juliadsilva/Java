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
public class Cafe extends Bebida {
       
    
    public static final int qtdAgua = 10;
    public static final int qtdIngrediente = 20;
    public int qtdAcucar;
    
    public Cafe(int qtdAcucar) {
        super(qtdAcucar, qtdAgua, qtdIngrediente,"Café");
    }
    
    
}
