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
public class Chocolate extends Bebida  {
    
    public static final int qtdAgua = 0;
    public static final int qtdIngrediente = 30;
    private int qtdAcucar;
    
    public Chocolate (int qtdAcucar) {
        super(qtdAcucar, qtdAgua, qtdIngrediente,"Chocolate");
    }
    
}
