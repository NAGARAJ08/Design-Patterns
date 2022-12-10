package Creational_patterns.Factory_Design;

public class ShapeFactory {

	public shape getshape(String shapetype)
	{
		if(shapetype==null)
		{
			return null;
		}
		
		if(shapetype.equals("circle")) {
			return new circle();
		}
		else if(shapetype.equals("square")) {
			return new square();
		}
		else if(shapetype.equals("Rectangle")) {
			return new Rectangle();
		}
		
		
		return null;
		
	}
}
