package com.nist.javatry2;
import java.util.Scanner;
public class Greaterandsmaller {
public static void main(String[] args) {
	Scanner scInt=new Scanner(System.in);
	System.out.println("Enter any two numbers: ");
	
	int a=scInt.nextInt();
	int b=scInt.nextInt();
	
	String result=(a>b)?a+" is Greater and "+b+" is Smaller":b+" is Greater and "+a+" is Smaller";
	System.out.print(result);
}
}
