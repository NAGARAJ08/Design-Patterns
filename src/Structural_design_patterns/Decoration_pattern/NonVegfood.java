package Structural_design_patterns.Decoration_pattern;

public class NonVegfood extends FoodDecorator{

	public NonVegfood(Food newFood) {
		super(newFood);
		// TODO Auto-generated constructor stub
	}
	
	public String PrepareFood() {
		return super.PrepareFood()+" With Roasted Chiken and Chiken Curry  "; 
		
	}

	public double foodprice() {
		return super.foodprice()+175.0;
	}
	
}
