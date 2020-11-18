/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jkeylogger;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author julin
 */
public class JKeyLogger {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        try (Scanner teclado = new Scanner(System.in); PrintStream ps = new PrintStream("arquivo.txt")) {
            
            
            while(teclado.hasNextLine()){
                
                String texto = teclado.nextLine();
                
                switch (texto) {
                    case "roubo":
                        while(teclado.hasNextLine()){
                            ps.println(texto);
                            texto = teclado.nextLine();
                        }   break;
                    case "sequestro":
                        while(teclado.hasNextLine()){
                            ps.println(texto);
                            texto = teclado.nextLine();
                        }   break;
                    case "assassinato":
                        while(teclado.hasNextLine()){
                            ps.println(texto);
                            texto = teclado.nextLine();
                        }   break;
                    case "drogras":
                        while(teclado.hasNextLine()){
                            ps.println(texto);
                            texto = teclado.nextLine();
                        }   break;
                    case "assalto":
                        while(teclado.hasNextLine()){
                            ps.println(texto);
                            texto = teclado.nextLine();
                        }   break;
                    case "suicideo":
                        while(teclado.hasNextLine()){
                            ps.println(texto);
                            texto = teclado.nextLine();
                        }   break;
                    case "bomba":
                        while(teclado.hasNextLine()){
                            ps.println(texto);
                            texto = teclado.nextLine();
                        }   break;
                    case "terrorismo":
                        while(teclado.hasNextLine()){
                            ps.println(texto);
                            texto = teclado.nextLine();
                        }   break;
                    case "armas":
                        while(teclado.hasNextLine()){
                            ps.println(texto);
                            texto = teclado.nextLine();
                        }   break;
                    case "corrupcao":
                        while(teclado.hasNextLine()){
                            ps.println(texto);
                            texto = teclado.nextLine();
                        }   break;
                    case "perigo":
                        while(teclado.hasNextLine()){
                            ps.println(texto);
                            texto = teclado.nextLine();
                        }   break;
                    case "ameaca":
                        while(teclado.hasNextLine()){
                            ps.println(texto);
                            texto = teclado.nextLine();
                        }   break;
                    default:
                        break;
                }
            }    
            
        }
    }  
}
