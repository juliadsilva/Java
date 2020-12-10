package listarraycofrinho;


import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import listarraycofrinho.Moeda;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julin
 */
public class Cofrinho {
    
    ArrayList<Moeda> moedas = new ArrayList(); 
    
    public void addMoeda(Moeda moeda){
        moedas.add(moeda);
    }   
    
    public double getValorTotal(){
        double total = 0;
        for (int i = 0; i < moedas.size(); i++) {
            total = total + moedas.get(i).getValor();
        }
        return total;
    }
    
    public int getQuantidadeMoedas(){
        return moedas.size();
    }
    
    public Moeda getMoedaMaiorValor(){
        return Collections.max(moedas);
    }
    
    public void ordenaMoedas(){
        Collections.sort(moedas);
    }
}
