package Structural_design_patterns.Decoration_pattern;

public class vegfood implements Food{

	@Override
	public String PrepareFood() {
		// TODO Auto-generated method stub
		return "Veg Food";
	}

	@Override
	public double foodprice() {
		// TODO Auto-generated method stub
		return 100.00;
	}

}
