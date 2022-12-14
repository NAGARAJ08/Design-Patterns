package Structural_design_patterns.Decoration_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecoratorPattern {

	private static int choice;
	
	public static void main(String args[]) throws NumberFormatException, IOException  {
	
		 do{        
		        System.out.print("========= Food Menu ============ \n");  
		        System.out.print("            1. Vegetarian Food.   \n");  
		        System.out.print("            2. Non-Vegetarian Food.\n");  
		        System.out.print("            3. Chineese Food.         \n");  
		        System.out.print("            4. Exit                        \n");  
		        System.out.print("Enter your choice: ");  
		        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));   
		        choice=Integer.parseInt(br.readLine());
		        
		        switch(choice) {
		        
		        case 1:{
		        		
		        	vegfood vf = new vegfood();
		        	System.out.println(vf.PrepareFood());
		        	System.out.println(vf.foodprice());
		        }
		        break;
		        
		        case 2:{
		        	
		        	Food f1 = new NonVegfood((Food)new vegfood());
		        	System.out.println(f1.PrepareFood());
		        	System.out.println(f1.foodprice());
		        }
		        break;
		        
		        case 3:{
		        	
		        	Food f2 = new ChineeseFood((Food)new vegfood());
		        	System.out.println(f2.PrepareFood());
		        	System.out.println(f2.foodprice());
		        }
		        break;
		        	
		        default:{
		        	
		        	System.out.println("Other than these no food available");
		        }
		        return;
		    }
	}while(choice!=4);
	
	}
	
}
