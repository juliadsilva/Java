/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.simuvoto.model;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julin
 */
public class Arquivo {
    
    public void salvar(String cpf, int nCandidato){
                
        OutputStream os = null;
        try {
            String file = getFileName(nCandidato);
            os = new FileOutputStream(file, true);
            OutputStreamWriter osw = new OutputStreamWriter(os);
            try (BufferedWriter bw = new BufferedWriter(osw)) {
                bw.write(cpf);
                bw.newLine();
            } catch (IOException ex) {
                Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                os.close();
            } catch (IOException ex) {
                Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
    }
    
    private  String getFileName(int nCandidato){
        String fileName = "";
        switch(nCandidato){
            case 77:
                fileName = "votos/paulinho.txt";
                break;
            case 51:
                fileName = "votos/rogerao.txt";
                break;
            case 43:
                fileName = "votos/darth.txt";
                break;               
        }
        return fileName;
    }
    
    public ArrayList<String> ler(String fileName) throws FileNotFoundException, IOException{
        ArrayList<String> votos = new ArrayList<>();
        InputStream is = new FileInputStream(fileName);
        InputStreamReader isr = new InputStreamReader(is);
        try (BufferedReader br = new BufferedReader(isr)) {
            String s = br.readLine();
            while(s != null){
                votos.add(s);
                s = br.readLine();  
            }
        }
        return votos;
    }
}
