package applicationpart;

import corejava.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);

	}
	public void withdraw(float accBal)
	{
		System.out.println("MY dear current account user,your accbal is:"+getAccBal()+"creditLimit"+ getCreditLimit());
	}

}