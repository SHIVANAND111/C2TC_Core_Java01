package applicationpart;

import corejava.BankFactory;
import corejava.CurrentAcc;
import corejava.SavingAcc;

public class MMBankFactory implements BankFactory {

	@Override
	public SavingAcc getNewSavingAcc(int AccNo, String accNm, float accBal, boolean isSalary) {
		SavingAcc SavingAcc=new MMSavingAcc(AccNo, accNm, accBal, isSalary);
		return SavingAcc;
		// TODO Auto-generated method stub
		
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit) {
		
		CurrentAcc CurrentAcc=new MMCurrentAcc(AccNo, accNm, accBal, creditLimit);
		   return CurrentAcc;
		// TODO Auto-generated method stub
	
	}

}
