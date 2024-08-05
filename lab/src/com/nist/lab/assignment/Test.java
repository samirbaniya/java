package com.nist.lab.assignment;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	System.out.println("Enter any two numbers: ");
	Scanner scInt=new Scanner(System.in);
	int a=scInt.nextInt();
	int b=scInt.nextInt();
	int c=a+b;
	
	System.out.println("Sum is "+c);
}
}
