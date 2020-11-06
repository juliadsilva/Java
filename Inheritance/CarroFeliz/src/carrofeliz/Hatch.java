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
public class Hatch extends Carro{

    private int numPortas;

    public Hatch(int numPortas, double valor, String cor, int ano) {
        super(valor, cor, ano);
        this.numPortas = numPortas;
    }

    @Override
    public void taxa() {
        System.out.println("Hatch tem taxa de compra de 1.5%");
        setValor(getValor() + 1000);
    }

    @Override
    public void mostraInfo() {
        System.out.println("Cor: " + getCor());
        System.out.println("Valor: " + getValor());
        System.out.println("Ano: " + getAno());
        System.out.println("Portas: " + numPortas);
    }

}
