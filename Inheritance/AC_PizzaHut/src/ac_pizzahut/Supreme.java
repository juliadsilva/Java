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
public class Supreme extends Pizza {

    @Override
    public void mostraIngredientes(){
        System.out.println("---- SUPREME ----");
        System.out.println("Mussarela, Cebola, Pimentão e Azeitona");   
    }
    
    @Override
    public String mostraBrinde(){
        return "Caneca";
    }    
}
