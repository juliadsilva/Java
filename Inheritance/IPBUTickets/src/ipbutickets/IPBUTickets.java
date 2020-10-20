/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipbutickets;

/**
 *
 * @author Administrador
 */
public class IPBUTickets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        float totalCompra;

        CarinhoCompras carrinho = new CarinhoCompras();
        carrinho.setLoginCliente("Julia");
            
        Ingresso ingresso = new Ingresso(1500);
        
        //Instanciando um ingresso de cada tipo
        Ingresso ingum = new Camarote("M", 1500);
        Ingresso ingdois = new Vip("P", 600);
        Ingresso ingtres = new Kid("1234567", "P", 600);

        //Adiconando ingressos no carrinho
        carrinho.addIngresso(ingum);
        carrinho.addIngresso(ingdois);
        carrinho.addIngresso(ingtres);

        carrinho.mostraDetlhes();
        totalCompra = carrinho.getTotalCompra();

        for (int i = 0; i < carrinho.getIngressos().length; i++) {
            if (carrinho.getIngressos()[i] instanceof Kid) {
                totalCompra = carrinho.getTotalCompra() / 2;
            }
        }

        System.out.println("----------------------------------");
        System.out.println("Total da Compra: " + totalCompra);
    }
}
