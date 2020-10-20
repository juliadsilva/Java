/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialnetworks;

/**
 *
 * @author Administrador
 */
public class Twitter extends RedeSocial implements Compartilhamento {

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Twitter!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Twitter!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentou uma publicação no Twitter!");
    }

    @Override
    public void compartilha() {
        System.out.println("Compartilhou um publicação no Twitter!");
    }
    
    
}
