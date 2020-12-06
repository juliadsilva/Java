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
public class BH extends Unidade{
       
    @Override
    public void mostraPizzas(){
        System.out.println("Unidade BH");
        System.out.println("Endereco: " + endereco);
        System.out.println("Responsavel: " + nomeResponsavel);
        super.mostraPizzas();
    }  
}
