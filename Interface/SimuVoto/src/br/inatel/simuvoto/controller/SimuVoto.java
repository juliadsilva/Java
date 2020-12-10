/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.simuvoto.controller;

import br.inatel.simuvoto.view.Votarview;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author julin
 */
public class SimuVoto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try {
      
      File votos = new File("votos");
      votos.mkdirs();
      
      File paulinhoFile = new File(votos,"paulinho.txt");
      File rogeraoFile = new File(votos,"rogerao.txt");
      File darthFile = new File(votos,"darth.txt");
      
      if (paulinhoFile.createNewFile()) {
        System.out.println("Criando arquivo do Paulinho");
      } else {
        System.out.println("Aquivo do Paulinho ja existe");
      }
      
      if (rogeraoFile.createNewFile()) {
        System.out.println("Criando arquivo do Rogerão");
      } else {
        System.out.println("Aquivo do Rogerão ja existe");
      }
      
      if (darthFile.createNewFile()) {
        System.out.println("Criando arquivo do Darth Verde");
      } else {
        System.out.println("Aquivo do Darth Verde ja existe");
      }
      new Votarview().setVisible(true);
      
    } catch (IOException e) {
       JOptionPane.showMessageDialog(null, "Problema com arquivo", "Problema com arquivo", JOptionPane.ERROR_MESSAGE);
    }
        
    }   
}
