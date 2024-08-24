package com.nist.javatry1;

import java.util.Scanner;

public class DataPack {
	Scanner scInt=new Scanner(System.in);
	Scanner scString=new Scanner(System.in);

	public void NTC() {
		System.out.println("Enter *1415# for NTC datapack: ");
		String userChoice=scString.nextLine();
		
		if(userChoice.equals("*1415#")) {
			NTCDataPack();
		}
		else {
			System.out.println("Your choice is Invalid.");
		}
	}
	
	public void NTCDataPack() {
		System.out.println("1)Prepaid Packs\n2)Unltd Night Packs...........");
		int userChoice=scInt.nextInt();
		if(userChoice==1) {
			PrepaidPacks();
		}
		else if(userChoice==2) {
			UnltdNightPacks();
		}
//		.
//		.
//		.
//		.
//		.
//		.
//		.
//		.
//		.
//		.
		else {
			System.out.println("Your choice is Invalid.");
		}
	}
	
	public void PrepaidPacks() {
		System.out.println("1)Sajilo Prepaid\n2)Combo Packs");
		int userChoice=scInt.nextInt();
		if(userChoice==1) {
			SajiloPrepaid();
		}
		else if(userChoice==2) {
			ComboPacks();
		}
		else {
			System.out.println("Your choice is Invalid.");
		}
	}
	
	public void SajiloPrepaid() {
		System.out.println("1)Utd-Combo@Rs699\n2)Utd-Combo@Rs799..........");
		int userChoice=scInt.nextInt();
		if(userChoice==1) {
			System.out.println("You Have Choosed Utd-Combo@Rs699.");
		}
		else if(userChoice==2) {
			System.out.println("You Have Choosed Utd-Combo@Rs799");
		}
//		.
//		.
//		.
//		.
//		.
//		.
//		.
//		.
//		.
//		.
		else {
			System.out.println("You Have Choosed Invalid Choice.");
		}
	}
	
	public void ComboPacks() {
		System.out.println("Combo:Voice:AllNet:28D\n"
				+ "1)200Min+2GB@Rs199\n2)300Min+4GB+20SMS-NT@Rs299\n...........");
		int userChoice=scInt.nextInt();
		if(userChoice==1) {
			System.out.println("You Have Choosed 200Min+2GB@Rs199.");
		}
		else if(userChoice==2) {
			System.out.println("You Have Choosed 300Min+4GB+20SMS-NT@Rs299");
		}
//		.
//		.
//		.
//		.
//		.
//		.
//		.
//		.
//		.
//		.
		else {
			System.out.println("You Have Choosed Invalid Choice.");
		}
	}
	
	public void UnltdNightPacks() {
		System.out.println("1)Unt-Data-5Mbps+Unt-Call-NT-NT@Rs59(10pm-6am)"
				+ "\n2)Unt-Call-NT-NT@Rs15(11pm-6am)");
		int userChoice=scInt.nextInt();
		if(userChoice==1) {
			System.out.println("You Have Choosed Unt-Data-5Mbps+Unt-Call-NT-NT@Rs59(10pm-6am).");
		}
		else if(userChoice==2) {
			System.out.println("You Have Choosed Unt-Call-NT-NT@Rs15(11pm-6am)");
		}
		else {
			System.out.println("You Have Choosed Invalid Choice.");
		}
	}
	
//	.
//	.
//	.
//	.
//	.
//	.
//	.
//	.
//	.
//	.
	
	public static void main(String[] args) {
		DataPack dt=new DataPack();
		dt.NTC();
	}
	
}
