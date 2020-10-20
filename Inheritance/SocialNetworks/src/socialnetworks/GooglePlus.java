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

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no GooglePlus!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no GooglePlus!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentou uma publicação no GooglePlus!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma vídeo conferência no GooglePlus!");
    }

    @Override
    public void compartilha() {
        System.out.println("Compartilhou um publicação no GooglePlus!");
    }
   
}
    
