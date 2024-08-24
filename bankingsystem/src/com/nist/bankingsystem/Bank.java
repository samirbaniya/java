package com.nist.bankingsystem;

import java.util.*;

public class Bank {
	Scanner scInt=new Scanner(System.in);
	Scanner scDouble=new Scanner(System.in);
	Scanner scString=new Scanner(System.in);
	Scanner scLong=new Scanner(System.in);
	
	ArrayList<Customer> customerList=new ArrayList<>();
	
	long accountNumber=100;
	
	public void menu() {
		System.out.println("Welcome to Our Bank\n"
				+ "1.Create Account\n"
				+ "2.View Details\n"
				+ "3.Deposit\n"
				+ "4.Withdraw");
		
		int userChoice=scInt.nextInt();
		if(userChoice==1) {
			createAccount();
		}else if(userChoice==2) {
			viewDetails();
		}else if(userChoice==3) {
			deposit();
		}else if(userChoice==4) {
			withdraw();
		}
		
		menu();
	}
	
	public void createAccount() {
		System.out.println("Enter your Name ");
		String name=scString.nextLine();
		
		System.out.println("Enter your Address ");
		String address=scString.nextLine();
		
		System.out.println("Enter your Contact Number ");
		Long contact=scLong.nextLong();
		
		accountNumber++;
		
		Customer c1=new Customer(name, address, accountNumber, contact, 0.0);
				
		customerList.add(c1);
		
		System.out.println("Account successfully created. Your account number is "+accountNumber);
	}
	
	public void viewDetails() {
		System.out.println("Enter your Account Number");
		long accNo=scLong.nextLong();
		boolean found=false;
		for(Customer c: customerList) {
		
			if(accNo==c.accountNumber) {
				found=true;
				System.out.println("Customer Details");
				System.out.println("================");
				System.out.println("Name is "+c.name);
				System.out.println("Address is "+c.address);
				System.out.println("Contact is "+c.contactNumber);
				System.out.println("Account Number is "+c.accountNumber);
				System.out.println("Current Balance is "+c.balance);
				System.out.println("================");	
				break;
			}
					
		}
		if(found==false) {
			System.out.println("Your account number is not in the list.Please create your account");
		}
	}
	
	public void deposit() {
		System.out.println("Enter your account number");
		long accNo=scLong.nextLong();
		boolean found=false;
		for(Customer c: customerList) {
			if(accNo==c.accountNumber) {
				found=true;
				System.out.println("Enter the amount you want to deposit");
				double amount=scDouble.nextDouble();
				if(amount>0) {
					c.deposit(amount);
					System.out.println("Amount Successfully Deposited");
				}else {
					System.out.println("Zero or negative value can't be deposited...");
				}
			
			}
		}
		if(found==false) {
			System.out.println("Your account number is not in the list.Please create your account");
		}
	}
	public void withdraw() {
		System.out.println("Enter your account number");
		long accNo=scLong.nextLong();
		boolean found=false;
		for(Customer c: customerList) {
			if(accNo==c.accountNumber) {
				found=true;
				System.out.println("Enter the amount you want to withdraw");
				double amount=scDouble.nextDouble();
				if(amount>0) {
					if(c.balance>=amount) {
						c.withdraw(amount);
						System.out.println("Amount Successfully Withdrawn");
					}else {
						System.out.println("Insufficient balance.");
					}
					
				}else {
					System.out.println("Zero or negative value can't be withdrawn...");
				}
				
				}
		}
		if(found==false) {
			System.out.println("Your account number is not in the list.Please create your account");
		}
	}
	public static void main(String[] args) {
		Bank bank=new Bank();
		bank.menu();
	}
}
