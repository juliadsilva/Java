/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrocontrolado;

/**
 *
 * @author julin
 */
public class CadastroControlado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cadastro cad = new Cadastro();
        
        cad.addCodigo("bp-6789");
        cad.addCodigo("mp-fd45");
        cad.addCodigo("xp-fd4500");
        cad.addCodigo("de-fd01");
        cad.addCodigo("dp-9876");
        cad.addCodigo("bp-9xx76");
      
        cad.mostraCodigos();  
    }
}
