/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac_pizzahut;

/**
 *
 * @author Administrador
 */
public class AC_PizzaHut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Criando as pizza
        Brasileira br = new Brasileira();
        Pepperoni pp = new Pepperoni();
        Supreme su = new Supreme(); 
        
        br.preco = 20;
        pp.preco = 15;
        su.preco = 25;                
        
        // Criando as unidades
        BH bh = new BH();
        bh.pizzas[0] = su;
        bh.pizzas[1] = pp;
        bh.endereco = "Rua da Independencia, 77, Centro";
        bh.nomeResponsavel = "Joao Vitor"; 
        
        RJ rj = new RJ();
        rj.pizzas[0] = pp;
        rj.pizzas[1] = br;
        rj.endereco = "Rua Copacabana, 110, Copacabana";
        rj.nomeResponsavel = "Tainara"; 
        
        SP sp = new SP();
        sp.pizzas[0] = br;
        sp.pizzas[1] = pp;
        sp.pizzas[2] = su;
        sp.endereco = "Av Paulista, 777, Centro";
        sp.nomeResponsavel = "Itamar Augusto";
        
        // Chamando os metodos 
        bh.mostraPizzas();
        rj.mostraPizzas();
        sp.mostraPizzas();
    }  
}
