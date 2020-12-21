/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.meaw.exception;

/**
 *
 * @author julia e rafaela
 */

public class EmailInvalidoException extends RuntimeException{

    public EmailInvalidoException() {
        System.err.println("Email invalido");      
    }  
}
