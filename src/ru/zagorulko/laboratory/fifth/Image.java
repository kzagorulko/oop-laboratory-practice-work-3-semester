package ru.zagorulko.laboratory.fifth;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.concurrent.TimeUnit;

public class Image extends JFrame {
    protected BufferedImage[] image;

    public Image (BufferedImage[] img){

        super ("Страны Африки");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.image = img;
        setSize(img[0].getWidth(),img[0].getHeight()+30);

        setBackground(Color.WHITE);
        setVisible(true);
    }
    public void paint (Graphics g) {
        super.printComponents(g);
        int m=1;
        while (m<5){
            int i=0;
            for (i=0; i<5; i++) {
                g.drawImage(image[i], 0, 30, this);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            m++;
        }
    }
}
