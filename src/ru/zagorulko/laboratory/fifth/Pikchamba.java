package ru.zagorulko.laboratory.fifth;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Pikchamba extends JFrame {
    BufferedImage image;

    public Pikchamba(BufferedImage image) throws HeadlessException {
        this.image = image;
        setSize(image.getWidth(), image.getHeight()+20);
        setBackground(Color.white);
        setVisible((true));
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 30, this);
    }

    public static void main(String[] args) {
        String filename = args[0];
        BufferedImage buff = null;
        try {
            buff = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Pikchamba p = new Pikchamba(buff);
    }
}
