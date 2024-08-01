package com.nist.javatry2;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args){
		System.out.println("Enter any two numbers");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		
		System.out.println("Sum of two numbers is "+c);
}
}
