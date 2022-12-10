package Structural_design_patterns.Facade_pattern;

public class ShopKeeper {

	private MobileShop iphone;
	private MobileShop samsung;
	private MobileShop oneplus;
	
	
	public ShopKeeper()
	{
		iphone = new iphone();
		samsung = new samsung();
		oneplus = new oneplus();
	}
	
	public void iphoneSale()
	{
		iphone.modelno();
		iphone.price();
	}
	public void samsung()
	{
		samsung.modelno();
		samsung.price();
	}
	
	public void oneplus()
	{
		oneplus.modelno();
		oneplus.price();
	}
}
