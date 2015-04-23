package controller;

import framework.component.AccountTypeFactory;

public class SimpleBankTypeFactory {

	public static AccountTypeFactory getBankTypeFactory()
	{
		return new BankTypeFactory();
	}
}
