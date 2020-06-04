package Lesson08;

import javax.swing.*;

public class Frame extends JFrame {

    public Frame()
    {
        setBounds(100, 100, 265, 400);
        setTitle("Ввод цифр");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add( new Map());
        setVisible(true);
    }
}
