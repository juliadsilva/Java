/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.simuvoto.model;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author julin
 */
public class Resultado {
    
    ArrayList<String> votosPaulinho = new ArrayList<>();
    ArrayList<String> votosRogerao = new ArrayList<>();
    ArrayList<String> votosDarth = new ArrayList<>();
    
    public Resultado(){
        System.out.println("Validator instanciado");
    }
    
    public String contarVotos() throws IOException{
        
        Arquivo arquivo = new Arquivo();
        
        votosPaulinho = arquivo.ler("votos/paulinho.txt");
        votosRogerao =  arquivo.ler("votos/rogerao.txt");
        votosDarth =  arquivo.ler("votos/darth.txt");
        
        int nVotosPaulinho = votosPaulinho.size();
        int nVotosRogerao = votosRogerao.size();
        int nVotosDarth = votosDarth.size();
        
        String msg = "Votos Paulinho: " + Integer.toString(nVotosPaulinho) + "\n";
        msg += "Votos Rogerão: " + Integer.toString(nVotosRogerao) + "\n";
        msg += "Votos Darth Verde: " + Integer.toString(nVotosDarth) + "\n";
        
        return msg;
    }
    
}
