/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listarraycofrinho;

/**
 *
 * @author julin
 */
public class Moeda implements Comparable<Moeda>{
    
    private float valor;

    Moeda(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    @Override
    public int compareTo(Moeda o) {
        if(valor < o.valor)
            return -1;
        else if(valor > o.valor)
            return 1;
       
        return 0;
    }
}
