/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac_pizzahut;

/**
 *
 * @author Administrador
 * Classe Abstrata nao pode ter objatos instanciados
 */
public abstract class Pizza {
    
    protected float preco; 
    
    // Metodo abstrado
    // Nao possui implementacao
    // Forca as filhas a realizarem override neles
    public abstract void mostraIngredientes();
    
    public abstract String mostraBrinde();
    
}
