/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Arquivo;
import model.Dentista;

/**
 *
 * @author julia
 */
public class ArquivoController {
    
    private static Arquivo arquivo;
    
    public static void salvarDentista(ArrayList<Dentista> dentistas){ 
        arquivo = new Arquivo();
        arquivo.salvarArquivo(dentistas);
    }
    
    public static List<Dentista> listarDentistas(){
        arquivo = new Arquivo();
        return arquivo.lerArquivo();
    } 
}
