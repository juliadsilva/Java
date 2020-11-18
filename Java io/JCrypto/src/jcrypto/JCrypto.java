/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jcrypto;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author julin
 */
public class JCrypto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String palavra = JOptionPane.showInputDialog("Entre com uma palavra: ");
        
        int chave = Integer.parseInt(JOptionPane.showInputDialog("Entre com uma chave criptografica: "));
        
        char[] palavraNova = new char[palavra.length()];
        
        //Processo de Criptografia
        for (int i = 0; i < palavra.length(); i++) {
            int decimal = palavra.charAt(i);
            decimal = decimal - chave;
            palavraNova[i] = (char) decimal;
        }
        
        //Preparando para guardar no arquivo
        
        OutputStream os = new FileOutputStream("cripto.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        
        bw.write(new String(palavraNova));
        
        bw.close();
 
    }
}
