package com.nist.swingtry3.demo;

import java.sql.PreparedStatement;

public class Test {
public void saveStudentData(String name,String address,long contact,String gender) {
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
	}catch(Exception e){
		System.out.println(e);
	}
}
public static void main(String[] args) {
	Test test = new Test();
	test.saveStudentData("Raj", "Bhaktapur", 9849945632l, "Male");
}
}
