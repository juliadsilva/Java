/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcmania;

/**
 *
 * @author julia
 */
public class Computador {

    String marca;
    float preco;
    
    //Associação
    MemoriaUsb memoriausb;

    //Composição
    SistemaOperacional so = new SistemaOperacional();

    HardwareBasico[] hardwares = new HardwareBasico[3];
      
    
    public void addMemoriaUSB(MemoriaUsb m) {

        this.memoriausb = m;

    }

    public void mostraPCConfigs() {

        System.out.println("Marca: " + marca);
        System.out.printf("Preço: R$ %.2f \n", preco);
        System.out.println("Hardwares Básico: " );
        System.out.println("- " + hardwares[0].nome + " (" + hardwares[0].capacidade + " Mhz)");
        System.out.println("- " + hardwares[1].capacidade + "Gb de " + hardwares[1].nome);
        System.out.println("- " + hardwares[2].capacidade + "Gb de " + hardwares[2].nome);
        System.out.println("Sistema Operacional: " + so.nome + " (" + so.tipo + " bits)");
        System.out.println("Memoria USB: " + memoriausb.nome + " de " + memoriausb.capacidade + "Gb");
        System.out.println("----------------------------------------------------------");

    }
}
