package corejava;

public class StringBufferDemo {
	public static void main(String []args)
	{
	StringBuffer r= new StringBuffer("Learn Java");
	System.out.println(r);
	System.out.println("Length"+r.length());
	System.out.println("capacity  is "+r.capacity());
	System.out.println(r.charAt(3));

	StringBuffer r1=new StringBuffer("Technoserve");
	System.out.println(r1);
	System.out.println(r1.reverse());

	StringBuffer s=new StringBuffer("C++ training ");
	System.out.println(s);
	s.replace(0,4," Java ");
	System.out.println(s);

	StringBuilder t=new StringBuilder("java coding");
	System.out.println(t);
	System.out.println(t.reverse());

	}
	}




