/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author julin
 */
public class Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Entre com um informação");
            String[] vetor = sc.nextLine().split(" ");
            int index = sc.nextInt();
            System.out.println(vetor[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Posição Invalida");
            JOptionPane.showMessageDialog(null, "Posicção Invalida", "ERRO", JOptionPane.ERROR_MESSAGE);
        }catch(InputMismatchException e){
            System.out.println("Entrada Invalida");
            JOptionPane.showMessageDialog(null, "Entrada Invalida", "ERRO", JOptionPane.ERROR_MESSAGE);
        }finally{
            System.out.println("Fim do Programa");
            sc.close();
        }    
    }
}
