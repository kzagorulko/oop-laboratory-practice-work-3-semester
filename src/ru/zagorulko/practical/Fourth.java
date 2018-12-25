package ru.zagorulko.practical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fourth extends JFrame {
    JButton acmilan = new JButton("AC Milan");
    JButton realmadrid = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: 0x0", SwingConstants.CENTER);
    JLabel lastScorer = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
    JLabel winner = new JLabel("Winner: DRAW", SwingConstants.CENTER);
    private int realPoints = 0, milanPoints = 0;
    Fourth() {
        super("Soccer table");
        //setLayout(new FlowLayout());
        setBounds(300,300,300,150);
        JPanel panel = new JPanel();
        panel.setBounds(300,300,300,300);
        panel.setLayout(null);
        setResizable(false);
        panel.add(acmilan);
        acmilan.setBounds(0,0,150,30);
        panel.add(realmadrid);
        realmadrid.setBounds(150,0,150,30);
        panel.add(result);
        result.setBounds(0,30,300,30);
        panel.add(lastScorer);
        lastScorer.setBounds(0,60,300,30);
        panel.add(winner);
        winner.setBounds(0, 90, 300, 30);
        acmilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lastScorer.setText("AC Milan");
                milanPoints++;
                result.setText("Result: " + milanPoints + "x" + realPoints);
                if(milanPoints > realPoints) {
                    winner.setText("Winner: AC Milan");
                } else if(milanPoints < realPoints) {
                    winner.setText("Winner: Real Madrid");
                } else {
                    winner.setText("Winner: DRAW");
                }
            }
        });
        realmadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lastScorer.setText("Real Madrid");
                realPoints++;
                result.setText("Result: " + milanPoints + "x" + realPoints);
                if(milanPoints > realPoints) {
                    winner.setText("Winner: AC Milan");
                } else if(milanPoints < realPoints) {
                    winner.setText("Winner: Real Madrid");
                } else {
                    winner.setText("Winner: DRAW");
                }
            }
        });
        this.add(panel);
    }

    public static void main(String[] args) {
        new Fourth().setVisible(true);
    }
}
