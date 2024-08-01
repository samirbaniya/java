package com.nist.javatry2;
import java.util.Scanner;

public class Person {


	    public static void main(String[] args) {
	        Scanner scInt = new Scanner(System.in);
	        Scanner scString = new Scanner(System.in);
	        Scanner scLong = new Scanner(System.in);

	        System.out.println("Enter your name:");
	        String name = scString.nextLine();

	        System.out.println("Enter your address:");
	        String address = scString.nextLine();

	        System.out.println("Enter your age:");
	        int age = scInt.nextInt();

	        System.out.println("Enter your phone number:");
	        long phoneNumber = scLong.nextLong();

	        System.out.println("Name is " + name + ", Address is " 
	        + address + ", Age is " + age + ", Phone number is " + phoneNumber);
	    }
	}

