/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducaoarray;

/**
 *
 * @author julia
 */
public class IntroducaoArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] idades;
        
        
        //Criando o array em si
        idades = new int[10];
        
        //Guardando um valor no array
        idades[5] = 50;
        
        System.out.println(idades[5]);
        
        //Criando um array de referencia de objetos
        Conta [] contas = new Conta [10];
        
        Conta c1 = new Conta();
        c1.numero = 7777;
        
        //Atribuindo a referencia do objeto ao array
        contas[0] = c1;
        
        //Mostrando as infos deste objeto
        System.out.println(contas[0].numero);
        System.out.println(contas[1].numero); //ERRO
        
        
    }
    
}
