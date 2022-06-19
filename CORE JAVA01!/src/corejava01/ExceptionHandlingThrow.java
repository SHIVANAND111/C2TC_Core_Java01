package corejava01;
import java.util.Scanner;
public class ExceptionHandlingThrow {
	static void validate(int age)
	{
	if(age<60)
	throw new ArithmeticException("not valid");
	else
	System.out.println("welcome to senior citizen");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please eneter the age");
		int age=sc.nextInt();
		try
		{
	validate(age);
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		finally
		{
	System.out.println("rest of the code...");
	}
	System.out.println("main method ended");
	}
	

}
