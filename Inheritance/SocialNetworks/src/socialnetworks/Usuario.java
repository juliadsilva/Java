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
public class Usuario {
    
    private String nome;
    private String email;
    
    RedeSocial[] redesocial;

    public Usuario(RedeSocial[] redesocial) {
        this.redesocial = redesocial;
    }    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
