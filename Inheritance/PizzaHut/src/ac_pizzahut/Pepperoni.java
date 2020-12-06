/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac_pizzahut;

/**
 *
 * @author Administrador
 */
public class Pepperoni extends Pizza {
   
    @Override
    public void mostraIngredientes(){
        System.out.println("---- PEPPERONI ----");
        System.out.println("Pepperoni e Mussarela");   
    }
    
    @Override
    public String mostraBrinde(){
        return "Caneta";
    }    
}

