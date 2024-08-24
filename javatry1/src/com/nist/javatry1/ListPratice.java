package com.nist.javatry1;
import java.util.*;

public class ListPratice {
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<>();
		
		nameList.add("samir");
		nameList.add("Rabin");
		nameList.add(1,"Sita");
		
//		for loop
		for(int i=0; i<nameList.size(); i++) {
			System.out.println(nameList.get(i));
		}
		
//		for each loop
		for(String name :nameList ) {
			System.out.println(name);
		}
		
		ArrayList<Integer> rollList = new ArrayList<>();
		rollList.add(12);
		rollList.add(13);
		
		for(Integer roll:rollList) {
			System.out.println(roll);
		}
		
		ArrayList<Students> studentList = new ArrayList<>();
		
		Students s1 = new Students("ram","Banepa",1000,"male");
		Students s2 = new Students("sita","janakpur",1000,"female");
		
		System.out.println(studentList.get(0));
		System.out.println(studentList.get(1));


		
	}
}
