package com.nist.studentwebapp.controller;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.nist.studentwebapp.databaseconnections.DatabaseConnection;


@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		long contact=Long.parseLong(request.getParameter("contact"));
		String gender=request.getParameter("gender");
		
		PreparedStatement ps = null;
		
		String sql = "Insert into student(name,address,contact,gender)values(?,?,?,?)";

		try {
			ps = DatabaseConnection.getConnection().prepareStatement(sql);
			ps.setString(1,name);
			ps.setString(2, address);
			ps.setLong(3,contact);
			ps.setString(4, gender);
			ps.executeUpdate();
			
		}catch(Exception err) {
			System.out.println(err);
		}	
		
		
		String sql1 = "Select * from student";
		ArrayList<Student>studentList=new ArrayList<>();
		try {
		ps = DatabaseConnection.getConnection().prepareStatement(sql1);
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			int id=rs.getInt("id");
			String name1=rs.getString("name");
			String address1=rs.getString("address");
			Long contact1=rs.getLong("contact");
			String gender1=rs.getString("gender");
			
			Student student = new Student(id,name1,address1,gender1,contact1);
			studentList.add(student);
			
		}
		
		
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("id \t name /t address /t contact /t gender");
		for(Student std: studentList) {
			System.out.println(std.id+"\t"+std.name);
		}
		
		
		
		RequestDispatcher rd=request.getRequestDispatcher("student_details.jsp");
		rd.forward(request, response);
		
		
		
		
	}

}
