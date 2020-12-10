/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import exception.DocumentoVazioException;
import exception.NomeVazioException;
import java.util.ArrayList;
import java.util.List;
import model.Dentista;

/**
 *
 * @author julia
 */
public class DentistaController {
    
    private static Dentista dentista;
    private static final List <Dentista> dentistas = new ArrayList<>();
    
    public static void salvarDentista(String nome, String documento, String cro, long telefone, String especialidade, int avaliacao){
        
        if (nome.isEmpty()) throw new NomeVazioException();
        else if(documento.isEmpty()) throw new DocumentoVazioException();
        else{
            dentista = new Dentista(nome, documento, cro, telefone, especialidade, avaliacao);
            dentistas.add(dentista);
            ArquivoController.salvarDentista((ArrayList<Dentista>) dentistas);
        }
    }
}
