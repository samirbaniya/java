package com.nist.swingtry3.demo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test1 {
	PreparedStatement ps=null;

	public void deleteData(int id) {
		String sql ="Delete from student where id=?";
		try {
			ps = DatabaseConnection.getConnection().prepareStatement(sql);
			ps.setInt(1,id);
			ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		} 
	}
public void getData() {
	String sql = "Select * from student";
	try {
	ps = DatabaseConnection.getConnection().prepareStatement(sql);
	ResultSet rs=ps.executeQuery();
	while(rs.next()) {
		System.out.println(rs.getInt("id")+ 
				" "+ rs.getString("name")+
				" "+rs.getString("address")+
				" "+rs.getLong("contact")+
				" "+rs.getString("gender"));
	}
	
	
	}catch(Exception e) {
		System.out.println(e);
	}
	
}
public void updateData(int id,String name,String address,long contact,String gender) {
	String sql="Update student set name=?,address=?,contact=?,gender=? where id=?";
	try {
		ps = DatabaseConnection.getConnection().prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, address);
		ps.setLong(3, contact);
		ps.setString(4, gender);
		ps.setInt(5, id);
		ps.executeUpdate();
		
	}catch(Exception e) {
		System.out.println(e);
	} 
	 
}
public void searchByName(String name) {
	String sql="Select * from student where name like ?";
	try {
		ps= DatabaseConnection.getConnection().prepareStatement(sql);
		ps.setString(1, "%"+name+"%");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt("id")+ 
					" "+ rs.getString("name")+
					" "+rs.getString("address")+
					" "+rs.getLong("contact")+
					" "+rs.getString("gender"));
		}
	}catch(Exception e) {
	System.out.println(e);
	}
}
public static void main(String[] args) {
	Test1 test=new Test1();
//	test.getData();
//	test.deleteData(10);
//	test.getData();
//	test.updateData(2, "ram kumar yadav", "Bhojpur", 11222, "Male");
	test.searchByName("ajay");
}
}
