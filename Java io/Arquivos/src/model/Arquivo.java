/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julin
 */
public class Arquivo {
    
    private OutputStream os;
    
    public String linha = null;
    
    public Arquivo() {
        try {
            os = new FileOutputStream("Exemplo.txt",true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void salvar(String texto){
        try {
            //Salvando
            OutputStream os = new FileOutputStream("Exemplo.txt",true);
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
     
            bw.write(texto);
            bw.newLine();
            
            //Fechando
            bw.close();
            os.close();
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public void ler(String linha){
        //Lendo Arquivo
        FileInputStream fis;
        InputStreamReader isr;
        BufferedReader br;
        
        try {
            fis = new FileInputStream("Exemplo.txt");
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            
            linha = br.readLine();
            while(linha != null){
                System.out.println(linha);
                linha = br.readLine();
            }
            
            //Fechando Arquivo
            br.close();
            fis.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
