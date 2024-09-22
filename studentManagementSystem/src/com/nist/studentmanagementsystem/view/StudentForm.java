package com.nist.studentmanagementsystem.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.nist.studentmanagementsystem.dtabaseconnection.DatabaseConnection;
import com.nist.studentmanagementsystem.model.Student;
import com.nist.studentmanagementsystem.service.StudentService;
import com.nist.studentmanagementsystem.service.StudentServiceImpl;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class StudentForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField firstNameTextField;
	private JTextField lastNameTextField;
	private JTextField addressTextField;
	private JTextField contactTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentForm frame = new StudentForm();
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
	public StudentForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name\r\n:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(47, 26, 90, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLastName.setBounds(47, 61, 90, 36);
		contentPane.add(lblLastName);
		
		JLabel lblGender = new JLabel("Gender\r\n:");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGender.setBounds(47, 98, 90, 36);
		contentPane.add(lblGender);
		
		firstNameTextField = new JTextField();
		firstNameTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		firstNameTextField.setBounds(147, 33, 124, 22);
		contentPane.add(firstNameTextField);
		firstNameTextField.setColumns(10);
		
		lastNameTextField = new JTextField();
		lastNameTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lastNameTextField.setColumns(10);
		lastNameTextField.setBounds(147, 68, 124, 22);
		contentPane.add(lastNameTextField);
		
		JComboBox genderComboBox = new JComboBox();
		genderComboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		genderComboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Others"}));
		genderComboBox.setBounds(147, 105, 124, 22);
		contentPane.add(genderComboBox);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = firstNameTextField.getText();
				String lastName = lastNameTextField.getText();
				String address = addressTextField.getText();
				long contact = Long.parseLong(contactTextField.getText());
				String gender = (String) genderComboBox.getSelectedItem();
				
				Student student= new Student();
				student.setFirstName(name);
				student.setLastName(lastName);
				student.setAddress(address);
				student.setContactNumber(contact);
				student.setGender(gender);
				
				StudentService studentService=new StudentServiceImpl();
				studentService.saveStudent(student);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(147, 211, 124, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblAddress = new JLabel("Address\r\n:");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAddress.setBounds(47, 131, 90, 36);
		contentPane.add(lblAddress);
		
		addressTextField = new JTextField();
		addressTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		addressTextField.setColumns(10);
		addressTextField.setBounds(147, 141, 124, 22);
		contentPane.add(addressTextField);
		
		JLabel lblContact = new JLabel("Contact\r\n:");
		lblContact.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblContact.setBounds(47, 165, 90, 36);
		contentPane.add(lblContact);
		
		contactTextField = new JTextField();
		contactTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contactTextField.setColumns(10);
		contactTextField.setBounds(147, 174, 124, 22);
		contentPane.add(contactTextField);
	}
}
