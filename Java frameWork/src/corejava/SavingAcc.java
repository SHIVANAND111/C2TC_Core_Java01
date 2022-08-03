package corejava;

public class SavingAcc extends BankAcc{
	
	private boolean isSalary;
	private static final float MINBAL = 0;

	public boolean isSalary() {
		return isSalary;
	}
	public static float MINBAL() {
		return MINBAL;
	}

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary = isSalary;
		
	}



	
@Override
public void withdraw(float accBal) {
	// TODO Auto-generated method stub
	super.withdraw(accBal);
}


@Override
public String toString() {
	return "SavingAcc [isSalary=" + isSalary + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
			+ ", getAccBal()=" + getAccBal() + "]";
}



}



