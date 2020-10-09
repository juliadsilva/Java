/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacao;

/**
 *
 * @author julia
 */
public class Agregacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Objeto parte
        Atleta atle1 = new Atleta("Pedro", 18, "Atacante");
        
        //Objeto todo
        Time time1 = new Time("Sao Paulo", "Joao Carlos");
        
       //Agragação
       time1.atleta = atle1;
       System.out.println(time1.atleta.nome);
       
        
        
        
        
    }
    
}
