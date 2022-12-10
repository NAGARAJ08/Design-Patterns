package Structural_design_patterns.Adapter_pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class BankCustomer extends BankDetails implements CreditCard{

	@Override
	public void giveBankDetails() {
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter the Account Holder Name:");
			String customername = br.readLine();
			System.out.println("\n");
			
			System.out.println("Enter the account Number");
			long accno = Long.parseLong(br.readLine());
			System.out.println("\n");
			
			System.out.println("Enter the Bank name:");
			String bankname = br.readLine();
			
			setAccHolderName(customername);
			setAccNumber(accno);
			setBankName(bankname);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public String getCreditCard() {
		
		long accno=getAccNumber();
		String accholdername = getAccHolderName();
		String bname = getBankName();
		
		
		return ("The Account number "+accno+" of "+accholdername+" in "+bname+ "bank is valid and authenticated for issuing the credit card. ");  
	}

	
}
