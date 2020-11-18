/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emails;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author RenZo
 */
public class Emails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        // VARIAVEL QUE GUARDARA A OPCAO
        int opcao = 0, gec = 0, geb = 0, gep = 0, get = 0, ges = 0, gea = 0;

        while (true) {

            // SOLICITANDO A OPCAO AO USUARIO
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "1-Contar Emails / 2-Pesquisar Email"));

            if (opcao == 1) {
                // APONTANDO PARA O ARQUIVO
                InputStream is = new FileInputStream("emails.txt");
                // TRANSFORMANDO OS BYTES EM CHARS
                InputStreamReader isr = new InputStreamReader(is);
                // TRANSFORMANDO OS CARACTERES EM PALAVRAS
                BufferedReader br = new BufferedReader(isr);
                
                // LENDO A PRIMEIRA LINHA
                String s = br.readLine();
                
                while(s != null)
                {
                    if(s.contains("@ges"))
                    {
                        ges++;
                    }else if(s.contains("@gec"))
                    {
                        gec++;
                    }else if(s.contains("@get"))
                    {
                        get++;
                    }else if(s.contains("@geb"))
                    {
                        geb++;
                    }else if(s.contains("@gep"))
                    {
                        gep++;
                    }else if(s.contains("@gea"))
                    {
                        gea++;
                    }
                    
                    // FAZ A LEITURA DA PROXIMA LINHA DO ARQUIVO
                    s = br.readLine();
                    
                }
                
                JOptionPane.showMessageDialog(null, 
                        "GEA: "+gea+" GES:"+ges+" GEC:"+gec+
                                " GET:"+get+" GEB:"+geb+" GEP:"+gep);
                
                gec = 0;geb =0;get = 0;gea =0;ges = 0;gep =0;
                is.close();
                isr.close();
                br.close();
                
            } else if (opcao == 2) {
                
                String email = JOptionPane.showInputDialog(
                        "Qual email procura?");
                boolean achou = false;
                
                // APONTANDO PARA O ARQUIVO
                InputStream is = new FileInputStream("emails.txt");
                // TRANSFORMANDO OS BYTES EM CHARS
                InputStreamReader isr = new InputStreamReader(is);
                // TRANSFORMANDO OS CARACTERES EM PALAVRAS
                BufferedReader br = new BufferedReader(isr);
                
                // LENDO A PRIMEIRA LINHA
                String s = br.readLine();
                
                while(s != null)
                {
                    if(s.equalsIgnoreCase(email))
                    {
                        achou = true;
                        break;
                    }
                    
                    s = br.readLine();
                }
                
                if(achou)
                {
                    JOptionPane.showMessageDialog(null, 
                            "EMAIL ENCONTRADO!");
                }else
                {
                    JOptionPane.showMessageDialog(null, 
                            "EMAIL NAO ENCONTRADO!");
                }
                
                is.close();
                isr.close();
                br.close();
                
            } else {
                break;
            }
        }

    }

}
