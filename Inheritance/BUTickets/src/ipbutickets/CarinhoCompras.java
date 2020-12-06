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
public class CarinhoCompras {

    private String loginCliente;
    private float totalCompra;
    private int i;

    private Ingresso[] ingressos = new Ingresso[1000];

    public String getLoginCliente() {
        return loginCliente;
    }

    public void setLoginCliente(String loginCliente) {
        this.loginCliente = loginCliente;
    }

    public float getTotalCompra() {
        return totalCompra;
    }

    public Ingresso[] getIngressos() {
        return ingressos;
    }

    public void setIngressos(Ingresso[] ingressos) {
        this.ingressos = ingressos;
    }

    public void addIngresso(Ingresso ingresso) {
        ingressos[i] = ingresso;
        totalCompra = totalCompra + ingressos[i].calculaTotalIngresso();
        i++;
    }

    public void mostraDetlhes() {
        //Varrendo vetor de ingressos
        System.out.println("Nome: " + loginCliente);

        for (int i = 0; i < ingressos.length; i++) {

            if (ingressos[i] != null) {
                System.out.println("------------------------------------");
                ingressos[i].mostraInfos();
            }
        }
    }
}
