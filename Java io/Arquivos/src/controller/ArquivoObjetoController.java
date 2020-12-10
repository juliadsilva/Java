/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.ArquivoObjeto;
import model.Usuario;

/**
 *
 * @author julin
 */
public class ArquivoObjetoController {
   
    private static ArquivoObjeto arquivoObjeto;
    
    public static void salvar(Usuario[] usuarios){
        arquivoObjeto = new ArquivoObjeto();
        arquivoObjeto.salvar(usuarios);
    }   
    
    public static Usuario[] ler(){
        arquivoObjeto = new ArquivoObjeto();
        return arquivoObjeto.ler();
    }
}
