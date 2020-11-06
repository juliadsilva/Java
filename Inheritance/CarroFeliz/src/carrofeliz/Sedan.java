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
public class Sedan extends Carro{
    
    private int portaMala;

    public Sedan(int portaMala, double valor, String cor, int ano) {
        super(valor, cor, ano);
        this.portaMala = portaMala;
    }

    @Override
    public void taxa() {
       System.out.println("Sedan tem taxa de compra de 1.0%");
       setValor(getValor() + 2000);
    }

    @Override
    public void mostraInfo() {
        System.out.println("Cor: " + getCor());
        System.out.println("Valor: " + getValor());
        System.out.println("Ano: " + getAno());
        System.out.println("Porta Mala: " + portaMala);
    }
    
    
    
}
