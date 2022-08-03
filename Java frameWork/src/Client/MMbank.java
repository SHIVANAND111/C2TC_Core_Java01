package Client;

import applicationpart.MMBankFactory;
import applicationpart.MMCurrentAcc;
import applicationpart.MMSavingAcc;

public class MMbank {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//saving account creation
		MMBankFactory obj=new MMBankFactory();
		MMSavingAcc SHIVANAND=(MMSavingAcc) obj.getNewSavingAcc(124, "SHIVANAND", 600.0f, true);
		SHIVANAND.withdraw(SHIVANAND.getAccBal());
		
		//current account creation
		MMCurrentAcc SHIVA=(MMCurrentAcc) obj.getNewCurrentAcc(121,"SHIVA",800.0f,20.0f);
		SHIVA.withdraw(SHIVA.getAccBal());
	}

}
