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
public class Kid extends Vip {

    protected String docResponsavel;

    public Kid(String docResponsavel, String tamanhoAbada, float valorIngresso) {
        super(tamanhoAbada, valorIngresso);
        this.docResponsavel = docResponsavel;
    }

    
    public void setDocResponsal(String docResponsavel) {
        this.docResponsavel = docResponsavel;
    }

    @Override
    public void mostraInfos() {

        System.out.println("KIDS");
        super.mostraInfos();
        System.out.println("Documentos responsavel: " + docResponsavel);
    }
}
