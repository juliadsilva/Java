/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayexemplo;

/**
 *
 * @author julia
 */
public class ArrayExemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Array por referencia
        Conta[] contas = new Conta[5];
        
        Conta c1 = new Conta("João Pedro", 1500);
        Conta c2 = new Conta("Renzo", 1800);
        System.out.println("---------");
        
        contas [0] = c1;
        contas [1] = c2;
        
        System.out.println("Nome: " + contas[0].nome);
        System.out.println("Saldo: " + contas[0].saldo);
        
        for (int i = 0; i < contas.length; i++) {
            System.out.println("Contas: " + contas[i]);
            System.out.println("---------");
        }
        
        for (int i=0; i < contas.length; i++){
            if(contas[i] != null){
                System.out.println("Nome: " + contas[i].nome);
                System.out.println("Saldo: " + contas[i].saldo);
                System.out.println("---------");
            }
        }
        
        
    }
    
}
    

