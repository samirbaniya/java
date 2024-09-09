package com.nist.lab2.throwspractice;

import java.io.File; 
import java.io.FileWriter;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws Exception {
		File file= new File("C://Users//Dell//Desktop//csit//hello.txt");
		if(file.createNewFile()==true) {
			System.out.println("file successfully created");
		}else {
			System.out.println("file already exist");
		}
		
		FileWriter fw=new FileWriter(file,true);
		fw.write("\n hello faculties");
		fw.close();
		
		Scanner sc= new Scanner(file);
		while(sc.hasNext()) {
			String value=sc.nextLine();
			System.out.println(value);
		}
		sc.close();
	}

}
