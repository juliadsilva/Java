/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligonos;

/**
 *
 * @author julia
 */
public class PoligonoRegular {

    private int n; //numero de lados
    private float c;//comprimento
    private float areaPoligono; //guarda a area do poligono

    private float calculaPerimetro() {
        return c * n;
    }

    private float calculaApotema() {
        return (float) (c / (2 * Math.tan(Math.toRadians(180 / n))));
    }

    public void calculaArea(int nlados, float clados) {

        n = nlados;
        c = clados;
        
        areaPoligono = (calculaPerimetro() * calculaApotema())/2;

    }

    public float getAreaPoligono() {
        return areaPoligono;
    }

}
