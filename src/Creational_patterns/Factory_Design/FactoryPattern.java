package Creational_patterns.Factory_Design;

public class FactoryPattern {

	public static void main(String args[])
	{
		ShapeFactory shapeFactory = new ShapeFactory();
		
		shape shape1 = shapeFactory.getshape("circle");
		shape1.draw();
		
		shape shape2 = shapeFactory.getshape("Rectangle");
		shape2.draw();
		
		shape shape3 = shapeFactory.getshape("square");
		shape3.draw();
	}
}
