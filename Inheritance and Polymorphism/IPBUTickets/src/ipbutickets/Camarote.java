/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipbutickets;

/**
 *
 * @author Administrador
 */
public class Camarote extends Ingresso {

    protected String tamanhoCamiseta;

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
