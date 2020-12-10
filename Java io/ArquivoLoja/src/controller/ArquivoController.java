/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Arquivo;
import model.Equipamento;

/**
 *
 * @author julin
 */
public class ArquivoController {
    
    private static Arquivo arquivo;
    
    public static void salvar(Equipamento[] equipamentos){
        arquivo = new Arquivo();
        arquivo.salvar(equipamentos);
    }   
    
    public static Equipamento[] ler(){
        arquivo = new Arquivo();
        return arquivo.ler();
    }
}