package com.nist.lab.assignment;

import java.util.Scanner;

public class SecondLargestNum {
	public static void main(String[] args) {
		Scanner scInt=new Scanner(System.in);
		System.out.println("Enter total numbers from where second largest number is to be found: ");
		int n=scInt.nextInt();
		int a[]=new int[n];
		int i,j;
		System.out.println("Enter numbers: ");
		for(i=0;i<n;i++) {
			a[i]=scInt.nextInt();
		}
		
		for(i=0;i<n;i++) {
			for(j=0;j<n-1;j++) {
				if(a[j]<a[j+1]) {
					int c=a[j];
					a[j]=a[j+1];
					a[j+1]=c;
				}
			}
		}
		
		System.out.println(a[1]+" is the Second Largest Number.");
	}
}
