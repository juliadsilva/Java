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
public abstract class Unidade {

    // Atributos explicitos
    protected String endereco;
    protected String nomeResponsavel;

    // Atributos implicitos
    protected Pizza[] pizzas;

    Unidade() {
        pizzas = new Pizza[3];
    }

    // Metodo 
    public void mostraPizzas() {
        for (int i = 0; i < pizzas.length; i++) {
            if (pizzas[i] != null) {
                pizzas[i].mostraIngredientes();
                System.out.println("Brinde: " + pizzas[i].mostraBrinde());
                System.out.println("Preco: " + pizzas[i].preco);
            }
        }
        System.out.println("********");
    }
}
