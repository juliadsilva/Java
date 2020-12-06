/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipbutickets;

import java.util.Date;

/**
 *
 * @author Administrador
 */
public class Camarote extends Ingresso {

    private String tamanhoCamiseta;

    public Camarote(String tamanhoCamiseta, float valorIngresso) {
        super(valorIngresso);
        this.tamanhoCamiseta = tamanhoCamiseta;
    }
    
    public void setTamanhoCamiseta(String tamanhoCamiseta) {
        this.tamanhoCamiseta = tamanhoCamiseta;
    }

    @Override
    public void mostraInfos() {

        System.out.println("CAMAROTE");
        super.mostraInfos();
        System.out.println("Tamanho Camiseta: " + tamanhoCamiseta);
    }
}
