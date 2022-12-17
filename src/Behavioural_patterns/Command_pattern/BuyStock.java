package Behavioural_patterns.Command_pattern;

//this is concrete command classes
public class BuyStock  implements Order{

	private Stock rbcStock;
	
	public BuyStock(Stock rbcStock) {
		this.rbcStock = rbcStock;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		rbcStock.buy();
	}

}
