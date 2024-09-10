package com.nist.swingtry.test;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.sql.PreparedStatement;

	import javax.swing.*;



	public class Student2 {
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
		
		JLabel l2=new JLabel("Address:");
		l2.setBounds(10,70,100,50);
		frame.add(l2);
		
		JTextField t2=new JTextField();
		t2.setBounds(120, 70, 100, 50);
		frame.add(t2);
		
		JLabel l3=new JLabel("Contact:");
		l3.setBounds(10, 130, 100, 50);
		frame.add(l3);
		
		JTextField t3=new JTextField();
		t3.setBounds(120,130,100,50);
		frame.add(t3);
		
		JLabel l4=new JLabel("Gender:");
		l4.setBounds(10,190,100,50);
		frame.add(l4);
		
		JTextField t4=new JTextField();
		t4.setBounds(120,190,100,50);
		frame.add(t4);
		
		JButton button =new JButton("Submit");
		button.setBounds(20,250,100,50);
		frame.add(button);
		
		ActionListener readData = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = t1.getText();
				String address = t2.getText();
				long contact = Long.valueOf(t3.getText());
				String gender = t4.getText();
				PreparedStatement ps=null;
				
				String sql = "Insert into student(name,address,contact,gender)values(?,?,?,?)";
				try {
				ps = DatabaseConnection.getConnection().prepareStatement(sql);
				ps.setString(1, name);
				ps.setString(2, address);
				ps.setLong(3, contact);
				ps.setString(4, gender);
				ps.executeUpdate();
				System.out.println("Successfully saved");
				}catch(Exception ex){
					System.out.println(ex);
				}
			}
			
		};
		button.addActionListener(readData);
		
		
		frame.setVisible(true);
	}
	}

