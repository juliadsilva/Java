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
                
                if(texto.contains("roubo")){
                    while(teclado.hasNextLine()){
                        ps.println(texto);
                        texto = teclado.nextLine();
                    }
                }
                else if(texto.contains("sequestro")){
                    while(teclado.hasNextLine()){
                        ps.println(texto);
                        texto = teclado.nextLine();
                    }
                }
                else if(texto.contains("assassinato")){
                    while(teclado.hasNextLine()){
                        ps.println(texto);
                        texto = teclado.nextLine();
                    }
                }
                else if(texto.contains("drogas")){
                    while(teclado.hasNextLine()){
                        ps.println(texto);
                        texto = teclado.nextLine();
                    }
                }
                else if(texto.contains("assalto")){
                    while(teclado.hasNextLine()){
                        ps.println(texto);
                        texto = teclado.nextLine();
                    }
                }
                else if(texto.contains("suicideo")){
                    while(teclado.hasNextLine()){
                        ps.println(texto);
                        texto = teclado.nextLine();
                    }
                }
                else if(texto.contains("bomba")){
                    while(teclado.hasNextLine()){
                        ps.println(texto);
                        texto = teclado.nextLine();
                    }
                }
                else if(texto.contains("terrorismo")){
                    while(teclado.hasNextLine()){
                        ps.println(texto);
                        texto = teclado.nextLine();
                    }
                }
                else if(texto.contains("armas")){
                    while(teclado.hasNextLine()){
                        ps.println(texto);
                        texto = teclado.nextLine();
                    }
                }
                else if(texto.contains("corrupcao")){
                    while(teclado.hasNextLine()){
                        ps.println(texto);
                        texto = teclado.nextLine();
                    }
                }
                else if(texto.contains("perigo")){
                    while(teclado.hasNextLine()){
                        ps.println(texto);
                        texto = teclado.nextLine();
                    }
                }
                else if(texto.contains("ameaca")){
                    while(teclado.hasNextLine()){
                        ps.println(texto);
                        texto = teclado.nextLine();
                    }
                }
            }           
        }
    }  
}
