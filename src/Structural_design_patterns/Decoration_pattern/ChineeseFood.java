package Structural_design_patterns.Decoration_pattern;

public class ChineeseFood extends FoodDecorator{  
	  public ChineeseFood(Food newFood)    {  
	        super(newFood);  
	  }  
	    public String PrepareFood(){  
	        return super.PrepareFood() +" With Fried Rice and Manchurian  ";   
	    }  
	    public double foodprice()   {  
	        return super.foodprice()+65.0;  
	        }  
	}  