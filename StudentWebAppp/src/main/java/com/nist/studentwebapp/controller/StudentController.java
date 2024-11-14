package com.nist.studentwebapp.controller;

import java.io.*;
import java.sql.*;

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
		RequestDispatcher rd=request.getRequestDispatcher("student_details.jsp");
		rd.forward(request, response);
		
//		doGet(request, response);
	}

}
