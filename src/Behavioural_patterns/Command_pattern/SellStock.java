package Behavioural_patterns.Command_pattern;

public class SellStock implements Order{

	private Stock rbcStock;
	
	public SellStock(Stock rbcStock) {
		this.rbcStock = rbcStock;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		rbcStock.sell();
	}

}
