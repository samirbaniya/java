package com.nist.studentwebapp.databaseconnections;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
public static Connection getConnection() throws Exception{
	Class.forName("com.mysql.cj.jdbc.Driver");
	return DriverManager.getConnection("jdbc:mysql://localhost/csitseventh","root","");
}
}
