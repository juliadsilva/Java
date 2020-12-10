/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Produto;

/**
 *
 * @author julin
 */
public class Arquivo {
    
    //metodo para salvar no arquivo
    public static void salvarArquivo(ArrayList<Produto> produtos) {
        try {
            try (OutputStream os = new FileOutputStream("arquivo/produtos.txt",true)) {
                ObjectOutputStream osw = new ObjectOutputStream(os);
                osw.writeObject(produtos);
                
                //fechando o arquivo
                os.close();
                osw.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ArrayList<Produto> lerArquivo() {

        ArrayList<Produto> produtos = new ArrayList<>();
        
        FileInputStream fin;
        ObjectInputStream in;
       
        try {
            fin = new FileInputStream("arquivo/produtos.txt");
            in = new ObjectInputStream(fin);

            produtos = (ArrayList<Produto>) in.readObject();

            in.close();
            fin.close();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return produtos;
    }
}
