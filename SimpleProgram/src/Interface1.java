interface A
{
	void show();

}
interface B
{
	void disp();
}

public class Interface1
	implements A,B
	{
		@Override
		public void show()
		{
			System.out.println("welcome to technoserve");
		}
		@Override
		public void disp()
		{
			System.out.println("learn java coding");
		}

	public static void main(String[]args)
	{
		

	Interface1 f=new Interface1();
	f.show();
	f.disp();

	}
	}
