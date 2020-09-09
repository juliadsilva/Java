/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayexemplo02;

/**
 *
 * @author julia
 */
public class ArrayExemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] codigos = {100, 200, 300, 400, 500, 600, 700, 800, 900};
        
        System.out.println("Cogigo na posição 02: " + codigos[1]);
        
        for(int codigo : codigos)
            System.out.println("Codigos: " + codigo);
                
    }
        
}
