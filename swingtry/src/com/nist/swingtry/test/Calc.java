package com.nist.swingtry.test;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calc{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600, 500);
        frame.setVisible(true);
        frame.setTitle("Calculator");
        frame.setLayout(null);

        JLabel l1 = new JLabel("First Number");
        l1.setBounds(10, 10, 100, 50);
        frame.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(120, 10, 100, 50);
        frame.add(t1);

        JLabel l2 = new JLabel("Second Number");
        l2.setBounds(10, 70, 100, 50);
        frame.add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(120, 70, 100, 50);
        frame.add(t2);

        JButton button = new JButton("Add");
        button.setBounds(20, 190, 100, 50);
        frame.add(button);
        
        JLabel l3 = new JLabel("Result");
        l3.setBounds(10, 130, 100, 50);
        frame.add(l3);

        JTextField t3 = new JTextField();
        t3.setBounds(120, 130, 100, 50);
        frame.add(t3);
    }
}

