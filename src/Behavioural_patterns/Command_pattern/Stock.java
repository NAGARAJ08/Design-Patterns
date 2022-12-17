package Behavioural_patterns.Command_pattern;


//this is a request class
public class Stock {

	private String name= "RBC";
	private int quantity =  10;
	
	
	public void buy() {
		 System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
	}
	
	public void sell() {
		 System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] sold");
	}
}
