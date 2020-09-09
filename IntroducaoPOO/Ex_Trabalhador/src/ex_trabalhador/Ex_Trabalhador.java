/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_trabalhador;

/**
 *
 * @author julia
 */
public class Ex_Trabalhador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Trabalhador t1 = new Trabalhador ("Pedro", "Mecanico", 1565, "MG-17543980", "23/09/1980");
        Trabalhador t2 = new Trabalhador ("Felipe", "Vendedor", 2289, "MG-16723546", "04/01/1971");
             
        t1.mostraFuncionario();
        System.out.println("Salario anual: " + t1.calculaGanhoAnual());
        t1.recebeAumento(500);
        System.out.println("Salario: " + t1.salario + "\n");
        
        t2.mostraFuncionario();
        System.out.println("Salario anual: " + t2.calculaGanhoAnual()); 
        t2.recebeAumento(800);
        System.out.println("Salario: " + t2.salario + "\n");
        
    }
    
}
