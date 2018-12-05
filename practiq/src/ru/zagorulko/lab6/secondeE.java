package ru.zagorulko.lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class secondeE extends JFrame {

    secondeE() {
        super("Kek");
        Font f = new Font("Engravers MT", Font.BOLD, 23);
        Container container = getContentPane();
        JLabel south = new JLabel("SOUTH", SwingConstants.CENTER);
        //text.setFont(f);
        JLabel north = new JLabel("NORTH", SwingConstants.CENTER);
        JLabel east = new JLabel("EAST", SwingConstants.CENTER);
        JLabel west = new JLabel("WEST", SwingConstants.CENTER);
        JLabel center = new JLabel("CENTER", SwingConstants.CENTER);
        container.add(north, BorderLayout.NORTH);
        container.add(south, BorderLayout.SOUTH);
        container.add(east, BorderLayout.EAST);
        container.add(west, BorderLayout.WEST);
        container.add(center, BorderLayout.CENTER);
        south.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать Абха");
            }
        });
        north.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать в Мурманск");
            }
        });
        east.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать в Дахране");
            }
        });
        west.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать в Джидда");
            }
        });
        center.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать в цетнтр");
            }
        });
        Dimension sSize = Toolkit.getDefaultToolkit ().getScreenSize ();
        setSize(sSize);
        setVisible(true);
    }
    public void mouseEntered(MouseEvent event){}
    public void mouseExited(MouseEvent event){}
    public void mousePressed(MouseEvent event){}
    public void mouseReleased(MouseEvent event){}
    public void mouseClicked(MouseEvent event) {}

    public static void main(String[] args) {
        secondeE s = new secondeE();
    }

}

