/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_array;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Exception_Array {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Entre com um informação: ");
            String[] vetor = sc.nextLine().split(" ");
            int index = sc.nextInt();
            System.out.println(vetor[index]);
        } catch (ArrayIndexOutOfBoundsException c){
            c.printStackTrace();
            JOptionPane.showMessageDialog(null, "Posição Invaliida", "Erro", 3);
        } catch (InputMismatchExceptione e){
            System.out.println("Entrada Invalida");
        } finally {
            System.out.println("Fim do Programa");
        }

    }
    
}
