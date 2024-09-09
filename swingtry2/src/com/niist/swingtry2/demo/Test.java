package com.niist.swingtry2.demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Test {
public static void main(String[] args) {
	JFrame jframe = new JFrame();
	jframe.setSize(400,400);
	jframe.setResizable(false);
	jframe.setLayout(null);
	jframe.setTitle("Calculator");
	
	
	JLabel l1 = new JLabel("First Number:");
	l1.setBounds(10,10,100,30);
	jframe.add(l1);
	
	JTextField t1 = new JTextField();
	t1.setBounds(120,10,100,30);
	jframe.add(t1);
	
	JLabel l2 = new JLabel("Second Number:");
	l2.setBounds(10,60,100,30);
	jframe.add(l2);
	
	JTextField t2 =new JTextField();
	t2.setBounds(120, 60, 100, 30);
	jframe.add(t2);
	
	JLabel l3 = new JLabel("Total:");
	l3.setBounds(10, 110, 100, 30);
	jframe.add(l3);
	
	JTextField t3 = new JTextField();
	t3.setBounds(120, 110, 100, 30);
	t3.setEditable(false);
	jframe.add(t3);
	
	JButton button = new JButton("Add");
	button.setBounds(120, 160, 100, 30);
	jframe.add(button);
	
	ActionListener obj = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Pressed");
			String num = t1.getText();//"20"
			String num1 = t2.getText();//"10"
			int a = Integer.parseInt(num);//20
			int b = Integer.parseInt(num1);//10
			int c=a+b;//30
			String result = String.valueOf(c);//"30"
			t3.setText(result);
			
			
		}
	};
	button.addActionListener(obj);
	
	JButton clearbtn = new JButton("Clear");
	clearbtn.setBounds(230, 160, 100, 30);
	jframe.add(clearbtn);
	
	ActionListener obj1 = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
	};
	clearbtn.addActionListener(obj1);
	
	jframe.setVisible(true);
}
}
