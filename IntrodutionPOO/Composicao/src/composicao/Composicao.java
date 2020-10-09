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
public class Composicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Criando objeto da composição
        
        Empresa empre1 = new Empresa();
        
        empre1.nome = "Inatel Tecnologics";
        empre1.cnpj = "4624374734767";
        
        //JUMP OF THE CAT 
        empre1.depart1.nome = "ICC";
        empre1.depart1.nFuncionarios = 50;
        
        System.out.println("Nome: " + empre1.nome);
        
        
    }

}
