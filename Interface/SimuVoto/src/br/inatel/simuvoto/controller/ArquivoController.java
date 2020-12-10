/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.simuvoto.controller;

import br.inatel.simuvoto.model.Urna;
import br.inatel.simuvoto.model.Resultado;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julin
 */
public class ArquivoController {
    
    private static Urna urna;
    private static Resultado resultado;
    
    public static void validaVoto(String cpf, int nCandidato){
        try {
            urna = new Urna();
            urna.validar(cpf, nCandidato);
        } catch (IOException ex) {
            Logger.getLogger(ArquivoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
   
    
    public static String lerVotos() throws IOException{
        resultado = new Resultado();
        return resultado.contarVotos();
    }     
}
