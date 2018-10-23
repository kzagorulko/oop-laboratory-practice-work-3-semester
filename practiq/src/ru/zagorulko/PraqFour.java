package ru.zagorulko;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraqFour extends JFrame {
    JButton acmilan = new JButton("AC Milan");
    JButton realmadrid = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: 0x0");
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    Label winner = new Label("Winner: DRAW");
    private int realPoints = 0, milanPoints = 0;
    PraqFour() {
        super("Soccer table");
        setLayout(new FlowLayout());
        setSize(300,100);
        add(acmilan);
        add(realmadrid);
        add(result);
        add(lastScorer);
        add(winner);
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
    }
}
