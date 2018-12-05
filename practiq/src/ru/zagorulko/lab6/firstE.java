package ru.zagorulko.lab6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class firstE extends JFrame{
    JButton button = new JButton("Проверить");
    private int hiddenNumber;
    private int numberOfAttempts;
    JTextField textField = new JTextField("");

    firstE(){
        super("Угадай чилсо");
        Random rand = new Random();
        hiddenNumber = rand.nextInt(21);
        setTitle("Угадай число: " + hiddenNumber);
        numberOfAttempts = 3;
        setVisible(true);
        setBounds(300,300,300,150);
        JPanel panel = new JPanel();
        panel.setBounds(300,300,300,150);
        panel.setLayout(null);
        //setResizable(false);
        panel.add(button);
        button.setBounds(50,65,200,50);
        panel.add(textField);
        textField.setBounds(100,20, 100,30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int number;
                try {
                    number = Integer.parseInt(textField.getText());
                } catch (NumberFormatException f) {
                    number = -1;
                }
                if (numberOfAttempts > 0) {
                    if (number == hiddenNumber) {
                        JOptionPane.showMessageDialog(null, "Вы угадали число!");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Вы не угадали число! Осталось попыток: " + --numberOfAttempts);
                    }
                } else {
                    JOptionPane.showMessageDialog(null,
                            "У вас не осталось попыток. Загаданное число - " + hiddenNumber);
                }
            }
        });


        this.add(panel);
    }

    public static void main(String[] args) {
        firstE a = new firstE();

    }
}
