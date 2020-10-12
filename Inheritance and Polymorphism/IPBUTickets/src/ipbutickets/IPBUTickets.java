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

        //Instanciando um ingresso de cada tipo
        Camarote ingum = new Camarote();
        Vip ingdois = new Vip();
        Kid ingtres = new Kid();

        //Ingresso Camarote
        ingum.valorIngresso = 1500;
        ingum.setTamanhoCamiseta("M");
        ingum.calculaTotalIngresso();
        carrinho.addIngresso(ingum);

        //Ingresso Vip
        ingdois.valorIngresso = 600;
        ingdois.setTamanhoAbada("P");
        carrinho.addIngresso(ingdois);

        //Ingresso Kid
        ingtres.valorIngresso = 600;
        ingtres.setDocResponsal("1234567");
        ingtres.setTamanhoAbada("G");
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
