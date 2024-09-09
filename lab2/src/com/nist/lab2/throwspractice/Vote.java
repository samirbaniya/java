package com.nist.lab2.throwspractice;

public class Vote {
	public static void main(String[] args) throws InvalidAgeException {
		int age=3;
		if(age>=18) {
			System.out.println("User can vote");
		}else {
			InvalidAgeException obj = new InvalidAgeException("User with age "+age+" cannot vote");
			throw obj;
			
			//throw new InvalidAgeException("User cannot vote")
		}
	}

}
