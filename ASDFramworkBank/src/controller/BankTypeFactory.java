package controller;

import framework.component.*;

public class BankTypeFactory extends AccountTypeFactory {

	@Override
	public String[] getAccountTypes() {
		// TODO Auto-generated method stub
		return new String[]{"saving","checking"};
		
	}

	@Override
	public AccountType getAccountType(String typeName) {
		
		if(typeName.equals("saving"))
		{
			return new SavingType("saving",8,1000,-100);
		}
		else 
		{
			return new CheckingType("checking",4,500,0);
		}
	}


}
