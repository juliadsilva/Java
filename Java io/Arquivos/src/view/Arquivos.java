/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ArquivoObjetoController;
import model.Usuario;

/**
 *
 * @author julin
 */
public class Arquivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        //ArquivoController.salvar("Ola mundoooo!");
        //ArquivoController.salvar("C206");
        //ArquivoController.ler(null);
        
        Usuario[] usuarios = new Usuario[2];
        usuarios[0] = new Usuario("julia@", "123456");
        usuarios[1] = new Usuario("joao@", "1544542");
        
        ArquivoObjetoController.salvar(usuarios);
        
        for (Usuario usuario : ArquivoObjetoController.ler()) {
            System.out.println(usuario.getEmail());
            System.out.println(usuario.getSenha());
            System.out.println("-------------------------");      
        }
    }
}
