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
public class SUV extends Carro implements Controle {
    
    private String tracao;

    public SUV(String tracao, double valor, String cor, int ano) {
        super(valor, cor, ano);
        this.tracao = tracao;
    }

    @Override
    public void taxa() {
        System.out.println("SUV tem taxa de compra de 1.5%");
        setValor(getValor() + 3000);
    }

    @Override
    public void mostraInfo() {
        System.out.println("Cor: " + getCor());
        System.out.println("Valor: " + getValor());
        System.out.println("Ano: " + getAno());
        System.out.println("Tracao: " + tracao);
    }
   
}
