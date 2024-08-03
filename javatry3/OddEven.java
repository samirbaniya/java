import java.util.Scanner;
public class OddEven {
public static void main(String[] args) {
	System.out.println("Enter a number: ");
	Scanner scInt=new Scanner(System.in);
	int a=scInt.nextInt();
	
	String result=(a%2==1)?"Odd":"Even";
	System.out.print(result);
}
}