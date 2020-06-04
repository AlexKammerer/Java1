package Lesson08;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Map extends JPanel {
    JTextField button = null;

    public Map() {

        setLayout(null);
        final TextField button = new TextField();
        button.setBounds(10, 10, 235, 25);

        JButton b0 = new JButton("0");
        b0.setBounds(10, 270, 75, 50);

        JButton b1 = new JButton("1");
        b1.setBounds(10, 190, 50, 50);

        JButton b2 = new JButton("2");
        b2.setBounds(60, 190, 50, 50);

        JButton b3 = new JButton("3");
        b3.setBounds(110, 190, 50, 50);

        JButton b4 = new JButton("4");
        b4.setBounds(10, 110, 50, 50);

        JButton b5 = new JButton("5");
        b5.setBounds(60, 110, 50, 50);

        JButton b6 = new JButton("6");
        b6.setBounds(110, 110, 50, 50);

        JButton b7 = new JButton("7");
        b7.setBounds(10, 40, 50, 50);

        JButton b8 = new JButton("8");
        b8.setBounds(60, 40, 50, 50);

        JButton b9 = new JButton("9");
        b9.setBounds(110, 40, 50, 50);

        add(button);
        add(b0);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                button.setText(button.getText() + 1);
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                button.setText(button.getText() + 2);
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                button.setText(button.getText() + 3);
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                button.setText(button.getText() + 4);
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                button.setText(button.getText() + 5);
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                button.setText(button.getText() + 6);
            }
        });

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                button.setText(button.getText() + 7);
            }
        });

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                button.setText(button.getText() + 8);
            }
        });

        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                button.setText(button.getText() + 9);
            }
        });

        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                button.setText(button.getText() + 0);
            }
        });
    }
}
