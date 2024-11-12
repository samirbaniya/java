package com.nist.studentmanagementsystem.service;

import java.util.ArrayList;

import com.nist.studentmanagementsystem.model.Student;

public interface StudentService {
	public void saveStudent(Student student);
	public ArrayList<Student> getStudentList();	
}
