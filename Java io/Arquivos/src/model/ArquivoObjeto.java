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
public class ArquivoObjeto {
    
    private OutputStream os;
    
    public ArquivoObjeto() {
        try {
            os = new FileOutputStream("Objetos.txt",true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //metodo para salvar no arquivo
    public void salvar(Usuario[] usuarios) {
        try {
            ObjectOutputStream osw = new ObjectOutputStream(os);
            osw.writeObject(usuarios);

            //fechando o arquivo
            osw.close();
            os.close();
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Usuario[] ler() {

        FileInputStream fin;
        ObjectInputStream in;
        
        Usuario[] usuarios = new Usuario[100];

        try {
            fin = new FileInputStream("Objetos.txt");
            in = new ObjectInputStream(fin);

            usuarios = (Usuario[]) in.readObject();

            in.close();
            fin.close();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ArquivoObjeto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return usuarios;
    }

}
