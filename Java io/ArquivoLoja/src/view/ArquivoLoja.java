/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ArquivoController;
import model.Equipamento;
import model.Notebook;
import model.Smartfone;

/**
 *
 * @author julin
 */
public class ArquivoLoja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Equipamento[] equipamentos = new Equipamento[2];
        equipamentos[0] = new Notebook(001, "Notbook Dell", "Inspirn", "123");
        equipamentos[1] = new Smartfone("RQWER", 2000,"Iphone", "XR", "321");
        
        ArquivoController.salvar(equipamentos);
        
        for(Equipamento equipamento : ArquivoController.ler()){
            equipamento.mostraInfo();
            System.out.println("-------------");
        }     
    } 
}
