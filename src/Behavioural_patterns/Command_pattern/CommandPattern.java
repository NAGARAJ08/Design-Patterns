package Behavioural_patterns.Command_pattern;

public class CommandPattern {

	public static void main(String args[]) {
		
		Stock rbcStock = new Stock();
		BuyStock buystockorder = new BuyStock(rbcStock);
		SellStock sellstock = new SellStock(rbcStock);
		
		Broker broker = new Broker();
		
		broker.takeOrder(buystockorder);
		broker.takeOrder(sellstock);
		
		broker.placeorders();
	}
}
