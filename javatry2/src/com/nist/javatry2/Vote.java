package com.nist.javatry2;

import java.util.Scanner;

public class Vote {
	public static void main(String[] args) {
		Scanner scInt=new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age=scInt.nextInt();
		
		String result=(age>=18)?"You can Vote.":"You cannot vote.";
		System.out.print(result);
	}
}
