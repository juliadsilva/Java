/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julia
 */
public class Arquivo { 
   
    public void salvarArquivo(List<Dentista> dentistas) {
        
        OutputStream os;
        ObjectOutputStream osw;
        
        try {
         
            os = new FileOutputStream("arquivo/dentistas.txt", true);
            osw = new ObjectOutputStream(os);
            
            osw.writeObject(dentistas);
                        
            osw.close();
            os.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public List<Dentista> lerArquivo() {

        FileInputStream fin;
        ObjectInputStream in;
        ArrayList<Dentista> dentistas = new ArrayList<>();

        try {
            
            fin = new FileInputStream("arquivo/dentistas.txt");
            in = new ObjectInputStream(fin);

            dentistas = (ArrayList<Dentista>) in.readObject();
           
            in.close();
            fin.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return dentistas;
    }

}


