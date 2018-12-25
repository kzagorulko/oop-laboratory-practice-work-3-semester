package ru.zagorulko.laboratory.fifth;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class lab5 extends JFrame {


    public lab5() throws HeadlessException {
        super("Кружочки и прямоугольнички");
        setSize(600,600);
        JPanel panel = new JPanel();
        setVisible(true);
    }

    public void paint(Graphics graphics) {
        JPanel panel = new JPanel();
        setBackground(Color.white);
        setBounds(300, 300, 600, 600);
        panel.setBounds(300, 300, 600, 600);
        graphics.setColor(Color.red);
        for (int i = 0; i < 20; i++) {
            Random rand = new Random();
            float r = rand.nextFloat();
            float g = rand.nextFloat();
            float b = rand.nextFloat();

            int x = rand.nextInt(panel.getWidth());
            int y = rand.nextInt(panel.getHeight());
            boolean shape = rand.nextBoolean();
            if (shape) {
                int[] lens = new int[4];
                lens[0] = x;
                lens[1] = y-20;
                lens[2] = panel.getHeight() - x;
                lens[3] = panel.getWidth() - y;
                Arrays.sort(lens);

                int radius = lens[0]; //rand.nextInt(Math.abs(lens[0]));
                Circle circle = new Circle(new Color(r, g, b), x, y, radius);
                graphics.setPaintMode();
                graphics.setColor(circle.getColor());
                graphics.fillOval(x,y,lens[0],lens[0]);
                System.out.print(i + " ");
                System.out.println(circle);
            }
            else {
                Rectangle rectangle = new Rectangle(new Color(r, g, b), x, y,
                        rand.nextInt(panel.getWidth() - x), rand.nextInt(panel.getHeight() - y));
                graphics.setColor(rectangle.getColor());
                graphics.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
                System.out.print(i + " ");
                System.out.println(rectangle);
            }
        }
    }

    public static void main(String[] args) {
        lab5 l = new lab5();
    }
}
