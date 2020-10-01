/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascalculadora;

/**
 *
 * @author julia
 */
public class Calculadora {
    
    private static final double PI = 3.14;
    
    public static double circunferencia (double raio){
        return 2.0 * PI * raio;
    }
    
    public static double volume (double raio){
        return (4.0 * PI * Math.pow(raio, 3)) / 3.0;
        
    }

    public static double getPI() {
        return PI;
    }

    
    
    
}
