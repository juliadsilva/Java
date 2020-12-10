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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julin
 */
public class Arquivo {
    
    private OutputStream os;
    
    public Arquivo() {
        try {
            os = new FileOutputStream("equipamentos.txt",true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //metodo para salvar no arquivo
    public void salvar(Equipamento[] equipametos) {
        try {
            ObjectOutputStream osw = new ObjectOutputStream(os);
            osw.writeObject(equipametos);

            //fechando o arquivo
            osw.close();
            os.close();
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Equipamento[] ler() {

        Equipamento[] equipametos = new Equipamento[100];
        
        FileInputStream fin;
        ObjectInputStream in;
       
        try {
            fin = new FileInputStream("equipamentos.txt");
            in = new ObjectInputStream(fin);

            equipametos = (Equipamento[]) in.readObject();

            in.close();
            fin.close();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return equipametos;
    }
}
