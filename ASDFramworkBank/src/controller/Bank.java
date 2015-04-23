package controller;

import view.BankGui;
import framework.component.FinanceSystem;
import framework.model.DefaultModel;
import framework.model.IModel;
import framework.view.AGui;
import framework.view.DefaultGui;

public class Bank {
	
	public static void main(String[] Args)
	{
		FinanceSystem finance=new FinanceSystem();
		
		IModel model=new DefaultModel();
		
		AGui gui=new BankGui("Bank App", finance);
		
		finance.setModel(model);
		
		finance.setGui(gui);
		

		System.out.println("");
		


		
		
		
	}

}
