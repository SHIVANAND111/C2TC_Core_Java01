package corejava01;
public class TryCatch {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		{
	
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

	
