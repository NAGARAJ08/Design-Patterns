package Behavioural_patterns.Command_pattern;

import java.util.ArrayList;
import java.util.List;

public class Broker {

	private List<Order> orderlist = new ArrayList<Order>();
	
	public void takeOrder(Order order) {
		orderlist.add(order);
	}
	
	public void placeorders() {
		
		for(Order order : orderlist) {
			
			order.execute();
		}
		orderlist.clear();
	}
}
