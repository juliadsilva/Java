/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author julin
 */
public class Smartfone extends Equipamento {
    
    private String imei;
    private double custo;

    public Smartfone(String imei, double custo, String marca, String modelo, String matricula) {
        super(marca, modelo, matricula);
        this.imei = imei;
        this.custo = custo;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("IMEI: " + imei);
        System.out.println("Custo: " + custo);
    }
}
