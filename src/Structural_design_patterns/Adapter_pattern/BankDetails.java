package Structural_design_patterns.Adapter_pattern;

//Adaptee Class
public class BankDetails {

	private String BankName;
	private String accHolderName;
	private long  accNumber;
	
	
	public void setBankName(String BankName){
		this.BankName = BankName;
	}
	public String getBankName()
	{
		return BankName;
	}

	public void setAccHolderName(String accHolderName)
	{
		this.accHolderName = accHolderName;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	
	
	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}
	public long getAccNumber(){
		return accNumber;
	}
	
}
