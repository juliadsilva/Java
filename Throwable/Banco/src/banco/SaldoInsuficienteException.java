/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Administrador
 */
public class SaldoInsuficienteException extends RuntimeException {
    
    public SaldoInsuficienteException(String msg){
       super(msg);
    }   
}
