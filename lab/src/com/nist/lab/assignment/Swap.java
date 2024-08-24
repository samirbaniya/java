package com.nist.lab.assignment;

public class Swap {
public static void main(String[] args) {
	int a=10;
	int b=33;
	System.out.println("Before swap:");
	System.out.println("a="+a+", b= "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After swap:");
	System.out.println("a="+a+", b= "+b);
}
}
