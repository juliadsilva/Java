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
public class Vip extends Ingresso {

    protected String tamanhoAbada;

    public void setTamanhoAbada(String tamanhoAbada) {
        this.tamanhoAbada = tamanhoAbada;
    }

    @Override
    public void mostraInfos() {

        System.out.println("VIP");
        super.mostraInfos();
        System.out.println("Tamanho Abada: " + tamanhoAbada);
    }
}
