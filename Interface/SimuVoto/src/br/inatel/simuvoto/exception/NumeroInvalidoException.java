/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.simuvoto.exception;

/**
 *
 * @author julin
 */
public class NumeroInvalidoException extends RuntimeException {
    public NumeroInvalidoException() {
       System.err.println("Numero Inválido!");
    }
}
