package com.nist.lab.assignment;

import java.util.Scanner;

public class DataPack {
	Scanner scInt=new Scanner(System.in);
	Scanner scString=new Scanner(System.in);

	public void ntc() {
		System.out.println("Enter *1415# for ntc datapack: ");
		String userInput=scString.nextLine();
		
		if(userInput.equals("*1415#")) {
			ntcDataPack();
		}
		else {
			System.out.println("Invalid Choice.");
			ntc();
		}
	}
	
	public void ntcDataPack() {
		System.out.println("1)Prepaid Packs\n2)Unltd Night Packs"
				+ "\n3)Voice\n4)4G\n5)Unlimited ");
		int userInput=scInt.nextInt();
		if(userInput==1) {
			PrepaidPacks();
		}
		else if(userInput==2) {
			UnltdNightPacks();
		}
		else if(userInput==3) {
			Voice();
		}
		else if(userInput==4) {
			for4G();
		}
		else if(userInput==5) {
			Unlimited();
		}
		else {
			System.out.println("Invalid Choice.");
		}
	}
	
	public void PrepaidPacks() {
		System.out.println("Prepaid Packs\n1)Sajilo Prepaid\n2)Combo"
				+ " Packs");
		int userInput=scInt.nextInt();
		if(userInput==1) {
			SajiloPrepaid();
		}
		else if(userInput==2) {
			ComboPacks();
		}
		else {
			System.out.println("Invalid Choice.");
		}
	}
	
	public void SajiloPrepaid() {
		System.out.println("1)Utd-Combo@Rs699\n2)Utd-Combo@Rs799\n3)Utd-Combo@Rs999\n4)Utd-Combo@Rs1499\n5)Exec-Combo@Rs1999");
		int userInput=scInt.nextInt();
		if(userInput==1) {
			System.out.println("You have choosen Utd-Combo@Rs699.");
		}
		else if(userInput==2) {
			System.out.println("You have choosen Utd-Combo@Rs799");
		}
		else if(userInput==3) {
			System.out.println("You have choosen Utd-Combo@Rs999");
		}
		else if(userInput==4) {
			System.out.println("You have choosen Utd-Combo@Rs1499");
		}
		else if(userInput==5) {
			System.out.println("You have choosen Exec-Combo@Rs1999");
		}
		else {
			System.out.println("Invalid Choice.");
		}
	}
	
	public void ComboPacks() {
		System.out.println("Combo:Voice:AllNet:28D\n1)200Min+2GB@"
				+ "Rs199\n2)300Min+4GB+20SMS-NT@Rs299\n3)500"
				+ "Min+8GB+100SMS-ALLNet@Rs499");
		int userInput=scInt.nextInt();
		if(userInput==1) {
			System.out.println("You have choosen 200Min+2GB@Rs199.");
		}
		else if(userInput==2) {
			System.out.println("You have choosen 300Min+4GB+20SMS-NT@Rs299");
		}
		else if(userInput==3) {
			System.out.println("You have choosen 500Min+8GB+100SMS-ALLNet@Rs499");
		}
		else {
			System.out.println("Invalid Choice.");
		}
	}
	
	public void UnltdNightPacks() {
		System.out.println("1)Unt-Data-5Mbps+Unt-Call-NT-NT@Rs59(10pm-6am)"
				+ "\n2)Unt-Call-NT-NT@Rs15(11pm-6am)");
		int userInput=scInt.nextInt();
		if(userInput==1) {
			System.out.println("You have choosen Unt-Data-5Mbps+Unt-Call-NT-NT@Rs59(10pm-6am).");
		}
		else if(userInput==2) {
			System.out.println("You have choosen Unt-Call-NT-NT@Rs15(11pm-6am)");
		}
		else {
			System.out.println("Invalid Choice.");
		}
	}
	
	public void Voice() {
		System.out.println("1)NT-NT-Network"
				+ "\n2)All-Network");
		int userInput=scInt.nextInt();
		if(userInput==1) {
			NTToNT();
		}
		else if(userInput==2) {
			AllNetwork();
		}
		else {
			System.out.println("Invalid Choice.");
		}
	}
	
	public void NTToNT() {
		System.out.println("1)30Min@Rs18-1D"
				+ "\n2)150Min@Rs59-1D\n3)299Min@Rs159-28D\n4)555Min@Rs269-28D");
		int userInput=scInt.nextInt();
		if(userInput==1) {
			System.out.println("You have choosen 30Min@Rs18-1D.");
		}
		else if(userInput==2) {
			System.out.println("You have choosen 150Min@Rs59-1D.");
		}
		else if(userInput==3) {
			System.out.println("You have choosen 299Min@Rs159-28D.");
		}
		else if(userInput==4) {
			System.out.println("You have choosen 555Min@Rs269-28D.");
		}
		else {
			System.out.println("Invalid Choice.");
		}
	}
	
	public void AllNetwork() {
		System.out.println("1)30Min@Rs20-1D"
				+ "\n2)150Min@Rs69-1D\n3)299Min@Rs169-28D\n4)555Min@Rs279-28D");
		int userInput=scInt.nextInt();
		if(userInput==1) {
			System.out.println("You have choosen 30Min@Rs20-1D.");
		}
		else if(userInput==2) {
			System.out.println("You have choosen 150Min@Rs69-1D.");
		}
		else if(userInput==3) {
			System.out.println("You have choosen 299Min@Rs169-28D.");
		}
		else if(userInput==4) {
			System.out.println("You have choosen 555Min@Rs279-28D.");
		}
		else {
			System.out.println("Invalid Choice.");
		}
	}
	
	public void for4G() {
		System.out.println("1)1GB@Rs29-1D"
				+ "\n2)3GB@Rs99-1D\n3)5GB@Rs109-7D\n4)12GB@Rs199-7D");
		int userInput=scInt.nextInt();
		if(userInput==1) {
			System.out.println("You have choosen 1GB@Rs29-1D.");
		}
		else if(userInput==2) {
			System.out.println("You have choosen 3GB@Rs99-1D.");
		}
		else if(userInput==3) {
			System.out.println("You have choosen 5GB@Rs109-7D.");
		}
		else if(userInput==4) {
			System.out.println("You have choosen 12GB@Rs199-7D.");
		}
		else {
			System.out.println("Invalid Choice.");
		}
	}
	
	public void Unlimited() {
		System.out.println("1)Voice+Data@Rs 24-1HR"
				+ "\n2)Data@Rs35-2HRS\n3)5Mbps@Rs89-1D\n4)5Mbps@Rs999-28D");
		int userInput=scInt.nextInt();
		if(userInput==1) {
			System.out.println("You have choosen Voice+Data@Rs 24-1HR.");
		}
		else if(userInput==2) {
			System.out.println("You have choosen Data@Rs35-2HRS.");
		}
		else if(userInput==3) {
			System.out.println("You have choosen 5Mbps@Rs89-1D.");
		}
		else if(userInput==4) {
			System.out.println("You have choosen 5Mbps@Rs999-28D.");
		}
		else {
			System.out.println("Invalid Choice.");
		}
	}
	
	public static void main(String[] args) {
		DataPack datapack=new DataPack();
		datapack.ntc();
	}
	
}
