package com.nist.studentmanagementsystem.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class StudentList extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentList frame = new StudentList();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 46, 414, 171);
		contentPane.add(table);
		
		String columnName [] = {"Id", "First Name", "Last Name" , "Address" , "Contact", "Gender"};
		JScrollPane jScrollPane  = new JScrollPane(table);
		jScrollPane.setBounds(10, 46, 414, 171);
		contentPane.add(jScrollPane);
		
		DefaultTableModel defaultTableModel = new DefaultTableModel(columnName,0);
		table.setModel(defaultTableModel);
		
		
		JLabel lblNewLabel = new JLabel("Search");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(181, 11, 62, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(243, 11, 99, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
	
	public void getLoadValueInTable() {
		
	}
}
