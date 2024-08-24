package com.nist.bankingsystem;

public class Customer {
	String name,address;
	long accountNumber,contactNumber;
	double balance;
	
	public Customer(String name,String address,
		long accountNumber,long contactNumber,double balance) {
		
		this.name=name;
		this.address=address;
		this.contactNumber=contactNumber;
		this.accountNumber=accountNumber;
		this.balance=balance;
		
	}
	public void deposit(double amount) {
		balance=balance+amount;
	}
	public void withdraw(double amount) {
	balance=balance-amount;
}
}