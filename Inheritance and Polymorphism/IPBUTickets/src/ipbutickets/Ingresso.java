/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipbutickets;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author Administrador Classe Mãe
 */
public class Ingresso {

    private static long numberGenerator;
    private long numero;
    protected float valorIngresso;
    protected static float taxaCartao;
    protected Date dataHoraCompra;

    //Contrutor para colocar implementações
    Ingresso() {
        //Gerando o numero do incresso
        numberGenerator++;
        numero = numberGenerator;

        //Setando a taxa do cartao
        taxaCartao = 5;

        //Objeto date
        dataHoraCompra = new Date();
    }

    public float calculaTotalIngresso() {
        return valorIngresso + taxaCartao;
    }

    public void mostraInfos() {

        System.out.println("Numero: " + numero);
        System.out.println("Valor: " + valorIngresso);
        System.out.println("Data: " + dataHoraCompra);
    }
}
