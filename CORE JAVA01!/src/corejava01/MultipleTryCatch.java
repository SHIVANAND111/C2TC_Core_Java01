package corejava01;

import java.util.Scanner;

public class MultipleTryCatch {
	public static void main(String[] args) 
	// TODO Auto-generated method stub
	{  
	try {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("enter the value of a and b");
		a = sc.nextInt();
		b = sc.nextInt();
		int data = a / b; // may throw exception
		System.out.println("data value is " + data);
	} catch (ArithmeticException ae) {
		System.out.println(ae);
	}
	System.out.println("rest of the code...");




	String str=null;

	try 
	{
		System.out.println(str.toUpperCase());
	}
	catch(NullPointerException n)
	{
		System.out.println("null cant casted ");
	}
	System.out.println("rest of the code...");
}


	}





