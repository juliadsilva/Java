/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.Cadastroview;

/**
 *
 * @author julia
 */
public class RedeDentista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        try {            
            File arquivo = new File("arquivo");
            arquivo.mkdirs();
            
            File dentista = new File(arquivo,"dentistas.txt");
            dentista.createNewFile();
            
            new Cadastroview().setVisible(true);
            
        } catch (IOException ex) {
            Logger.getLogger(RedeDentista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
