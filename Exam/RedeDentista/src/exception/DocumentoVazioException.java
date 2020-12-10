/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author julia
 */
public class DocumentoVazioException extends RuntimeException{

    public DocumentoVazioException() {
        System.err.println("Campo documento vazio");      
    }  
}
