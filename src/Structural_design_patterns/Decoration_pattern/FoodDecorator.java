package Structural_design_patterns.Decoration_pattern;

public abstract class FoodDecorator implements Food{

	private Food newFood;
	
	public FoodDecorator(Food newFood) {
		
		this.newFood=newFood;
	}
	
	@Override
	public String PrepareFood() {
		// TODO Auto-generated method stub
		return newFood.PrepareFood();
	}

	@Override
	public double foodprice() {
		// TODO Auto-generated method stub
		return newFood.foodprice();
	}

}
