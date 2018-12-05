package ru.zagorulko.lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThirdE extends JFrame{
    JTextArea textArea = new JTextArea("Third lab");
    JMenuBar bar = new JMenuBar();

    JMenu menu1 = new JMenu("Цвет");
    JMenu menu2 = new JMenu("Шрифт");

    JMenuItem menuItem_1_1 = new JMenuItem("Красный");
    JMenuItem menuItem_1_2 = new JMenuItem("Синий");
    JMenuItem menuItem_1_3 = new JMenuItem("Чёрный");

    JMenuItem menuItem_2_1 = new JMenuItem("Liberation Serif");
    JMenuItem menuItem_2_2 = new JMenuItem("Purisa");
    JMenuItem menuItem_2_3 = new JMenuItem("FreeSans");

    ThirdE() {
        super("Третье задание");

        bar.add(menu1);
        bar.add(menu2);
        menu1.add(menuItem_1_1);
        menu1.add(menuItem_1_2);
        menu1.add(menuItem_1_3);
        menu2.add(menuItem_2_1);
        menu2.add(menuItem_2_2);
        menu2.add(menuItem_2_3);


        setVisible(true);
        setBounds(300,300,300,300);
        JPanel panel = new JPanel();
        setJMenuBar(bar);
        panel.setBounds(300,300, 300, 300);
        panel.setLayout(null);
        panel.add(textArea);
        textArea.setBounds(0,0, 300, 300);
        menuItem_1_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textArea.setForeground(Color.RED);
            }
        });
        menuItem_1_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textArea.setForeground(Color.BLUE);
            }
        });
        menuItem_1_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textArea.setForeground(Color.BLACK);
            }
        });
        menuItem_2_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textArea.setFont(new Font("Liberation Serif", 400, 14));
            }
        });
        menuItem_2_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textArea.setFont(new Font("Purisa", 400, 14));
            }
        });
        menuItem_2_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textArea.setFont(new Font("FreeSans", 400, 14));
            }
        });
        this.add(panel);
    }

    public static void main(String[] args) {
        ThirdE e = new ThirdE();
    }
}
