package com.nist.studentwebapp.controller;

public class Student {
	int id;
	String name,address,gender;
	long contact;
	
	Student(int id,String name,String address,String gender,long contact){
		this.id=id;
		this.name=name;
		this.address=address;
		this.gender=gender;
		this.contact=contact;
	}
}
