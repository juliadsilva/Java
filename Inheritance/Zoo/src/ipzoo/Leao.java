/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipzoo;

/**
 *
 * @author Administrador
 */
public class Leao extends Animal{
    
    private float tamanhoJuba;

    public float getTamanhoJuba() {
        return tamanhoJuba;
    }

    public void setTamanhoJuba(float tamanhoJuba) {
        this.tamanhoJuba = tamanhoJuba;
    }
    
    @Override
    public void fazBarulho(){
        
        System.out.println("Grraur Grraur Grraur!");
        
    }
    
}
