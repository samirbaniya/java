package com.nist.studentmanagementsystem.view;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.nist.studentmanagementsystem.model.Student;
import com.nist.studentmanagementsystem.service.StudentService;
import com.nist.studentmanagementsystem.service.StudentServiceImpl;

import javax.swing.JTable;

public class StudentDataTable extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDataTable frame = new StudentDataTable();
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
	public StudentDataTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		String[] colNames = {"ID","FirstName","LastName","Contact","Address","Gender"};
		
		
		
		table = new JTable();
		table.setBounds(10, 11, 490, 282);
		contentPane.add(table);
		
		DefaultTableModel tableModel = new DefaultTableModel(colNames,0);
		table.setModel(tableModel);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10,11,582,172);
		contentPane.add(scrollPane);
		loadDataInTable();
	}
	
	public void loadDataInTable() {
		StudentService studentService = new StudentServiceImpl();
		ArrayList<Student> studentList = studentService.getStudentList();
		
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
		tableModel.setRowCount(0);
		
		for(Student student:studentList) {
			tableModel.addRow(new Object[] {student.getId(),student.getFirstName(),student.getLastName(),student.getContactNumber(),student.getAddress(),student.getGender()});
		}
	}
}
