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
public class Pato extends Animal{
    
    private float tamanhoBico;

    public float getTamanhoBico() {
        return tamanhoBico;
    }

    public void setTamanhoBico(float tamanhoBico) {
        this.tamanhoBico = tamanhoBico;
    }
    
    @Override
    public void fazBarulho(){
        
        System.out.println("QUA QUA QUA!");
        
    }
    
}
