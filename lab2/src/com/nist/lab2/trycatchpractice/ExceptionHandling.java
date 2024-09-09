package com.nist.lab2.trycatchpractice;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter any two numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			int c=a+b;
			System.out.println("Sum of two numbers is "+c);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			sc.close();
			System.out.println("Finally block called");
		}
		
		System.out.println("Rest of the code ..........");
		
	}
}
