package Structural_design_patterns.Facade_pattern;

public class samsung implements MobileShop{

	@Override
	public void modelno() {
		System.out.println("");
		System.out.println("Samsung Galaxy F90");
		
	}

	@Override
	public void price() {
		
		System.out.println("RS: 90,000");
		System.out.println("");
		
	}
	
}
