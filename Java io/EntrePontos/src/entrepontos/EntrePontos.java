/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrepontos;

import javax.swing.JOptionPane;

/**
 *
 * @author julin
 */
public class EntrePontos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float x1, y1, x2,y2;
        float deltax,deltay;
        double distancia;
        float pontMedioX, pontMedioY;
        
        //Valores do primeiro ponto
        x1 = Float.parseFloat(JOptionPane.showInputDialog("x1?"));
        y1 = Float.parseFloat(JOptionPane.showInputDialog("y1?"));
        
        //Valores do segundo ponto 
        x2 = Float.parseFloat(JOptionPane.showInputDialog("x2?"));
        y2 = Float.parseFloat(JOptionPane.showInputDialog("y2?"));
        
        System.out.println("x1: " + x1);
        
        // Calculos dos deltas
        deltax = x2-x1;
        deltay = y2-y1;
        
        System.out.println("Delta x: " + deltax);
        System.out.println("Delta y: " + deltay);
        
        // Calculo da distancia
        // Aplicando pitagoras
        distancia = Math.pow(deltax, 2) + Math.pow(deltay, 2);
        //distancia = Math.hypot(deltax, deltay);
        
        distancia = Math.sqrt(distancia);
        
        JOptionPane.showMessageDialog(null, "Distancia: " + distancia);
        
        // Calculo do ponto medio
        pontMedioX =  Math.round((x1 + x2)/2);
        pontMedioY =  Math.round((y1 + y2)/2);
        
        JOptionPane.showMessageDialog(null, "Ponto Media = ( " + pontMedioX + "," + pontMedioY + " )");
    }
    
}
