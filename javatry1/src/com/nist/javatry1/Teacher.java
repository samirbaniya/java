package com.nist.javatry1;

public class Teacher {
	String name,address;
	double salary;
	public Teacher() {
	System.out.println("deafault costructir");
	
	}
public Teacher (String n,String a,double s) 
{
	name=n;
	address=a;
	salary=s;
	
	
}
public static void main(String[]args) {
	Teacher obj=new Teacher();
	Teacher obj1=new Teacher("samir","dhaneshwor",10);
	System.out.println("name is " + obj.name);
	System.out.println("name is " + obj1.name);
	System.out.println(obj);
	 
	
}
}
