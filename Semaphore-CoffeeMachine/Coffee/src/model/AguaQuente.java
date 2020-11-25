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
public class AguaQuente extends Bebida {
      
    public static final int qtdAgua = 20;
    public static final int qtdIngrediente = 0;
    private  static final int qtdAcucar = 0;
    
    public AguaQuente() {
        super(qtdAcucar, qtdAgua, qtdIngrediente, "Água Quente");
    }
    
}
