package Structural_design_patterns.Adapter_pattern;

public class clientAdapter {

	public static void main(String args[])
	{
		CreditCard targerinterface = new BankCustomer();
		targerinterface.giveBankDetails();
		System.out.println(targerinterface.getCreditCard());
	}
}
