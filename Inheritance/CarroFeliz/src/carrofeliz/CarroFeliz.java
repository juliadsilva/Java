/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrofeliz;

/**
 *
 * @author Administrador
 */
public class CarroFeliz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Carro suv = new SUV("4x4", 35000, "Preto", 2010);
        Carro sedan = new Sedan(40, 55000, "Vermelho", 2012);

        suv.mostraInfo();
        suv.taxa();
        System.out.println("--------------");
        sedan.mostraInfo();
        sedan.taxa();
    }

}
