/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

/**
 *
 * @author julia
 */
public class Empresa {
    
    String nome;
    String cnpj;
    
    //Composição
    Departamento depart1 = new Departamento();
    
}
