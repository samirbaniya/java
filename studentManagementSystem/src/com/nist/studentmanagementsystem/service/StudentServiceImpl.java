package com.nist.studentmanagementsystem.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.nist.studentmanagementsystem.dtabaseconnection.DatabaseConnection;
import com.nist.studentmanagementsystem.model.Student;

public class StudentServiceImpl implements StudentService {
	PreparedStatement ps = null;

	@Override
	public void saveStudent(Student student) {
		String sql = "Insert into students(first_name,last_name,address,gender,contact)values(?,?,?,?,?)";
		
		try {
			ps = DatabaseConnection.getConnection().prepareStatement(sql);
			ps.setString(1,student.getFirstName());
			ps.setString(2, student.getLastName());
			ps.setString(3,student.getAddress());
			ps.setString(4, student.getGender());
			ps.setLong(5, student.getContactNumber());
			ps.executeUpdate();
			
		}catch(Exception err) {
			System.out.println(err);
		}		
	}

	@Override
	public ArrayList<Student> getStudentList() {
		ArrayList<Student> studentList = new ArrayList<Student>();
		String sql ="select * from students";
		try {
			ps = DatabaseConnection.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Student student = new Student();
				student.setId(rs.getInt("id"));
				student.setFirstName(rs.getString("first_name"));
				student.setLastName(rs.getString("last_name"));
				student.setAddress(rs.getString("address"));
				student.setContactNumber(rs.getLong("contact"));
				student.setGender(rs.getString("gender"));
				studentList.add(student);
			}
			
			
			}catch(Exception e) {
				System.out.println(e);
			}
//		pratices gareko
//		sum();
//		int a = diff();
//		System.out.println(a);
//		ArrayList<Integer> b =  getRowList();
//		ArrayList<Student> student = getStudent();
		
		
		
		return studentList;
	}
	
//	public void sum() {
//		
//	}
//	
//	public int diff() {
//		return 100;
//	}
//	
//	public ArrayList<Integer> getRowList(){
//		ArrayList<Integer> rollList = new ArrayList<Integer>();
//		rollList.add(1);
//		rollList.add(2);
//		
//		return rollList;
//	}
//	
//	public ArrayList<Student> getStudent() {
//		ArrayList<Student> studentList = new ArrayList<Student>();
//		
//		
//		Student student = new Student();
//		student.setFirstName("Samir");
//		student.setLastName("Baniya");
//		studentList.add(student);
//		
//		
//		Student student1 = new Student();
//		student1.setFirstName("Aashish");
//		student1.setLastName("Tm");
//		studentList.add(student1);
//		
//		return studentList;
//	}
	
	
	

}
