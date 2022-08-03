package corejava01;

public class DepositThread extends Thread {
	public static void main (String []args)
	{
		
	AClass obj;
	int amt;
	String msg;
	
	
	public DepositThread(AClass obj, int amt,String msg) {	
		this.obj = obj;
		this.amt = amt;
		this.msg=msg;
	}

	@Override
	public void run() {
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		}
		//System.out.println("First");
		obj.deposit(amt);
}
