package corejava;

public class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal;
	
	
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}


	public int getAccNo() {
		return accNo;
	}


	

	public String getAccNm() {
		return accNm;
	}


	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}


	public float getAccBal() {
		return accBal;
	}


	public void withdraw(float accBal) {
	}

	public void deposite(float accBal) {
	}


	
	

}

