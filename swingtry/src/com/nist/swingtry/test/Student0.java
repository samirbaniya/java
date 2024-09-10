
	package com.nist.swingtry.test;

	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;

	public class Student0 {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setSize(500,500);
		frame.setResizable(false);
		frame.setTitle("Student Form");
		frame.setLayout(null);

		
		JLabel l1=new JLabel("Name:");
		l1.setBounds(10,10,100,50);
		frame.add(l1);
		
		JTextField t1=new JTextField();
		t1.setBounds(120,10,100,50);
		frame.add(t1);
		
		JLabel l2=new JLabel("Roll No.:");
		l2.setBounds(10,70,100,50);
		frame.add(l2);
		
		JTextField t2=new JTextField();
		t2.setBounds(120, 70, 100, 50);
		frame.add(t2);
		
		JLabel l3=new JLabel("Address:");
		l3.setBounds(10, 130, 100, 50);
		frame.add(l3);
		
		JTextField t3=new JTextField();
		t3.setBounds(120,130,100,50);
		frame.add(t3);
		
		JLabel l4=new JLabel("Age:");
		l4.setBounds(10,190,100,50);
		frame.add(l4);
		
		JTextField t4=new JTextField();
		t4.setBounds(120,190,100,50);
		frame.add(t4);
		
		JLabel l5=new JLabel("Gender:");
		l5.setBounds(10,250,100,50);
		frame.add(l5);
		
		JTextField t5=new JTextField();
		t5.setBounds(120,250,100,50);
		frame.add(t5);
		
		JButton button =new JButton("Submit");
		button.setBounds(20,310,100,50);
		frame.add(button);
		
		ActionListener readData = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = t1.getText();
				String roll = t2.getText();
				String address = t3.getText();
				String age = t4.getText();
				String gender = t5.getText();
				if(!name.equals("")
						&&!name.equals("")
						&&!roll.equals("")
						&&!address.equals("")
						&&!age.equals("")
						&&!name.equals("")) {
					
				try {
				File file= new File("C://Users//Dell//Desktop//csit//hello.txt");
				if(file.createNewFile()==true) {
					System.out.println("file successfully created");
				}else {
					System.out.println("file already exist");
				}
				
				FileWriter fw=new FileWriter(file,true);
				fw.write("Name is "+name);
				fw.write("\nRoll No.:"+roll);
				fw.write("\nAddress:"+address);
				fw.write("\nAge:"+age);
				fw.write("\nGender:"+gender+"\n \n");
				fw.close();
				
				Scanner sc= new Scanner(file);
				while(sc.hasNext()) {
					String value=sc.nextLine();
					System.out.println(value);
				}
				sc.close();
				}catch(Exception exc) {
					System.out.println(exc);
				}
				}
			}
		};
		button.addActionListener(readData);
		
		
		frame.setVisible(true);
	}
	}

