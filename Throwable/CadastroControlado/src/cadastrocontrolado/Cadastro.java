/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrocontrolado;

import java.util.ArrayList;

/**
 *
 * @author julin
 */
public class Cadastro {
    
    //String codigosValidos[] = new String[100];
    //String codigosInvalidos[] = new String[100];
    
    //Array - Coleção que cresce dinamicamente
    ArrayList codigosValidos = new ArrayList();
    ArrayList codigosInvalidos = new ArrayList();
    
    public void addCodigo(String codigo)
    {
        if((codigo.startsWith("mp-") || 
            codigo.startsWith("dp-") || 
            codigo.startsWith("bp-"))
            && codigo.length() == 7){
           codigosValidos.add(codigo);
        }
        else{
            codigosInvalidos.add(codigo);
            try{
                throw new CodigoDesconhecidoException();
            }catch(RuntimeException e){
                System.out.println("Excecao de Codigo Desconhecido Detectada!");
            }
        }
    }
    
    public void mostraCodigos(){
        System.out.println("Codigo Validos");
        for (int i = 0; i < codigosValidos.size(); i++) {
            System.out.println(codigosValidos.get(i));
        }
        System.out.println("Codigo Invalidos");
        for (int i = 0; i < codigosInvalidos.size(); i++) {
            System.out.println(codigosInvalidos.get(i));
        }
    }
}
