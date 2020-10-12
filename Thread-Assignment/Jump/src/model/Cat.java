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
 * @author Julia
 * https://github.com/juliadsilva
 */

public class Cat extends JLabel implements Runnable {
       
    private Random random = new Random();
    private Thread catThread = null;
    
    private String name; 
    private int posX;
    private int posY;
    private ImageIcon catImage;
    private boolean up = true;

    public Cat(ImageIcon icon) {

        super(icon);
        this.name = createName();
        this.catImage = icon;
        this.posX = random.nextInt(290);
        this.posY = 400;
        this.catThread = new Thread(this);
        this.catThread.start();      
    }

    private String createName() {

        String catnames[] = {"Bartô", "Spock", "Edwiges", "Minerva", "Han Solo", "Amora", "Lasanha", "Tequila", "Paçoca", "Yoshi"};
        String auxname;
        return auxname = catnames[0 + random.nextInt(9)];
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void run() {
        
        if (up) {
            System.out.println("Subindo");
            posY -= random.nextInt(3) * 30;
        } else {
            System.out.println("Descendo");
            posY += random.nextInt(3) * 30;
        }

        this.setLocation(posX, posY);

        if (posY <= 30) {
            this.up = false;
        } else if (posY >= 356) {
            this.up = true;
        }

        try {
            Thread.sleep(random.nextInt(5) * 100);
            run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
