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
public class SocialNetworks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        RedeSocial[] rede_um = new RedeSocial[2];
        RedeSocial[] rede_dois = new RedeSocial[2];

        //Usuario um
        Usuario user_um = new Usuario(rede_um);
        user_um.setNome("Julia");
        user_um.setEmail("julia_daniele@hotmail");

        //Primeira rede social - Facebook
        user_um.redesocial[0] = new Facebook();
        user_um.redesocial[0].numAmigos = 600;
        user_um.redesocial[0].senha = "121314";

        //Segunda rede social - Instagram
        user_um.redesocial[1] = new Instagram();
        user_um.redesocial[1].numAmigos = 980;
        user_um.redesocial[1].senha = "893212";

        //Saida e chamar metodos
        System.out.println("Usuario: " + user_um.getNome());
        System.out.println("----------------------------");

        System.out.println("Facebook: ");
        if (user_um.redesocial[0] instanceof Facebook) {
            Facebook user_facebook = (Facebook) user_um.redesocial[0];
            System.out.println("Numero de Amigos: " + user_facebook.numAmigos);
            user_facebook.fazStreaming();
            user_facebook.compartilha();
            user_facebook.curtirPublicacao();
        }
        System.out.println("----------------------------");
        System.out.println("Instagram: ");
        System.out.println("Numero de Amigos: " + user_um.redesocial[1].numAmigos);
        user_um.redesocial[1].postarVideo();
        user_um.redesocial[1].postarFoto();
        user_um.redesocial[1].postarComentario();
        
        System.out.println("\n*************************************\n");

        //Usuario dois
        Usuario user_dois = new Usuario(rede_dois);
        user_dois.setNome("Lucas");
        user_dois.setEmail("lucas_123@hotmail");

        //Primeira rede social - Google Plus
        user_dois.redesocial[0] = new GooglePlus();
        user_dois.redesocial[0].numAmigos = 80;
        user_dois.redesocial[0].senha = "563190";

        //Segunda rede social - Instagram
        user_dois.redesocial[1] = new Twitter();
        user_dois.redesocial[1].numAmigos = 900;
        user_dois.redesocial[1].senha = "786423";

        //Saida e chamar metodos
        System.out.println("Usuario: " + user_dois.getNome());
        System.out.println("----------------------------");

        System.out.println("Google Plus: ");
        if (user_dois.redesocial[0] instanceof GooglePlus) {
            GooglePlus user_googleplus = (GooglePlus) user_dois.redesocial[0];
            System.out.println("Numero de Amigos: " + user_googleplus.numAmigos);
            user_googleplus.fazStreaming();
            user_googleplus.postarFoto();
            user_googleplus.postarVideo();
        }
        
        System.out.println("----------------------------");
        System.out.println("Twitter: ");
        if (user_dois.redesocial[1] instanceof Twitter) {
            Twitter user_twitter = (Twitter) user_dois.redesocial[1];
            System.out.println("Numero de Amigos: " + user_twitter.numAmigos);
            user_twitter.compartilha();
            user_twitter.postarComentario();
            user_twitter.curtirPublicacao();
        }
    }
}
