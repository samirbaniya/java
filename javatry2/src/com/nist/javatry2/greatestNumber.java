package com.nist.javatry2;

import java.util.Scanner;

public class greatestNumber {
	public static void main(String[] args) {
		Scanner scInt=new Scanner(System.in);
		System.out.println("Enter any three numbers: "); 
		int a=scInt.nextInt();
		int b=scInt.nextInt();
		int c=scInt.nextInt();
		int greatest;
		int smallest;
		int middle;
		//greatest number
		if(a>=b&&a>=c) {
			greatest=a;
		}
		else if(b>=c) {
			greatest=b;
		}
		else {
			greatest=c;
		}
		
		
		
		//for smallest number
		if(a<=b&&a<=c) {
			smallest=a;
		}
		else if(b<=c) {
			smallest=b;
		}
		else {
			smallest=c;
		}
		
		//for middle number
		if(a!=greatest&&a!=smallest) {
			middle=a;
		}
		else if(b!=greatest&&b!=smallest) {
			middle=b;
		}
		else {
			middle=c;
		}
		
		System.out.println(smallest+"is Smallest Number.");
		System.out.println(middle+"is Middle Number.");
		System.out.println(greatest+"is Greatest Number.");
	}
}