package com.nist.javatry1;

public class Student {
String name,address;
long contact;

public void sleep() {
	System.out.println("Student is sleeping.....");
}
public static void main(String[] args) {
	Student obj =new Student();
	obj.name="Ram";
	obj.address="Banepa";
	Student obj1=new Student();
	
	obj1.name="Shyam";
	 System.out.println();
}
}
