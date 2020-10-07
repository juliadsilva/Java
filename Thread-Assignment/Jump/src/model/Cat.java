/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Random;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

/**
 *
 * @author Administrador
 */
public class Cat extends JLabel implements Runnable {
    private int id;
    private Random random = new Random();
    private Thread catThread = null;
    private int posX;
    private int posY;
    private ImageIcon catImage;
    private boolean up = true;
    
    public Cat(ImageIcon icon){
        super(icon);
        this.id = Math.abs(random.nextInt());
        this.catImage = icon;
        this.posX = random.nextInt(221);
        this.posY = 365;
        this.catThread = new Thread(this, Integer.toString(id));
        this.catThread.start();
    }
    
    
    public int getId(){
        return this.id;
    }

    @Override
    public void run() {
        
        if(up) posY -= random.nextInt(3) * 10;
        else posY += random.nextInt(3) * 10;
        
        this.setLocation(posX, posY);
        
        if (posY <= 20) this.up = false;
        else if (posY >= 356) this.up = true; 

       
        try {
            Thread.sleep(random.nextInt(5) * 100);
            run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
