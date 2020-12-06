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
public class Brasileira extends Pizza {

    @Override
    public void mostraIngredientes() {
        System.out.println("---- BRASILEIRA ----");
        System.out.println("Mussarela, Requeijão, Presunto e Azeitona");
    }

    @Override
    public String mostraBrinde() {
        return "Chaveiro";
    }
}
