/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayempresa;

/**
 *
 * @author julia
 */
public class ArrayEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Contato c1 = new Contato("Julia", "jd@inatel.br", "359999999", "22/04/96");
        Contato c2 = new Contato("Gustavo", "gustavo@inatel.br", "3598647472", "05/06/98");
        
        Empresa empresa = new Empresa("123456789", "Rua A");
        empresa.contatos = new Contato[5];
        
        empresa.contatos[0] = c1;
        empresa.contatos[1] = c2;
        
        empresa.exibirInfos();
        
        
    }
    
}
