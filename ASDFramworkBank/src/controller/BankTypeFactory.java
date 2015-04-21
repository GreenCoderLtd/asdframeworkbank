package controller;

import framework.component.Type;
import framework.component.TypeFactory;

public class BankTypeFactory extends TypeFactory {

	@Override
	public String[] getTypes() {
		// TODO Auto-generated method stub
		return new String[]{"saving","checking"};
		
	}

	@Override
	public Type getType(String typeName) {
		
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
