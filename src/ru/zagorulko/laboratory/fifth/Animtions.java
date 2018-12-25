package ru.zagorulko.laboratory.fifth;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Animtions extends JFrame {
    public static void main(String[] args) throws IOException {
        String[] filename = new String[5];

        filename[0] = "/home/user/projects/index.jpeg";
        filename[1] = "/home/user/projects/index1.jpeg";
        filename[2] = "/home/user/projects/index2.jpeg";
        filename[3] = "/home/user/projects/index3.jpeg";
        filename[4] = "/home/user/projects/index4.jpeg";
        BufferedImage[] image = new BufferedImage[5];
        for (int i =0;i<5;i++){
            System.out.println(filename[i]);
                image[i] = ImageIO.read(new File(filename[i]));
        }
        Image menu = new Image(image);
    }
}
