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
	
	JButton addbtn = new JButton("+");
	addbtn.setBounds(10, 160, 100, 30);
	jframe.add(addbtn);
	

	
	ActionListener add = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
//			System.out.println("Pressed");
			String num1 = t1.getText();//"20"
			String num2 = t2.getText();//"10"
			int a = Integer.parseInt(num1);//20
			int b = Integer.parseInt(num2);//10
			int c = a + b;//30
			String result = String.valueOf(c);//"30"
			t3.setText(result);
			
			
		}
	};
	addbtn.addActionListener(add);
	
	JButton subbtn = new JButton("-");
	subbtn.setBounds(120, 160, 100, 30);
	jframe.add(subbtn);
	
	ActionListener sub = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String num1 = t1.getText();
			String num2 = t2.getText();
			int a = Integer.parseInt(num1);
			int b = Integer.parseInt(num2);
			int c = a - b;
			String result = String.valueOf(c);
			t3.setText(result);
			
		}
	};
	subbtn.addActionListener(sub);
	
	
	
	JButton divbtn = new JButton("/");
	divbtn.setBounds(10, 200, 100, 30);
	jframe.add(divbtn);
	
	ActionListener div = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String num1 = t1.getText();
			String num2 = t2.getText();
			float a = Float.parseFloat(num1);
			float b = Float.parseFloat(num2);
			float c = a/b;
			String result = String.valueOf(c);
			t3.setText(result);
		}
	};
	divbtn.addActionListener(div);
	
	JButton productbtn = new JButton("x");
	productbtn.setBounds(120, 200, 100, 30);
	jframe.add(productbtn);
	
	ActionListener product = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String num1 = t1.getText();
			String num2 = t2.getText();
			int a = Integer.parseInt(num1);
			int b = Integer.parseInt(num2);
			int c = a * b;
			String result = String.valueOf(c);
			t3.setText(result);
		}
	};
	productbtn.addActionListener(product);
	
	JButton clearbtn = new JButton("Clear");
	clearbtn.setBounds(70, 240, 100, 30);
	jframe.add(clearbtn);
	
	ActionListener clear = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
	};
	clearbtn.addActionListener(clear);
	
	jframe.setVisible(true);
}
}
