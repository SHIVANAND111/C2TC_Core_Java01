package corejava01;

public class NestedCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
			String a="SHIVANAND";
			System.out.println(a.toLowerCase());
		}
		
		
		catch(NullPointerException n)
		{
			System.out.println("null value cant converted");
		}
		System.out.println("Main method ended");
	}}


