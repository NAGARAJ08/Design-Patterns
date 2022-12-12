package Structural_design_patterns.composite_pattern;

public class compositepattern {

	public static void main(String args[])
	{
		 
        Employee emp1=new cashier(11,"EMP1", 60000.0);  
        Employee emp2=new cashier(12,"EMP2", 75000.0);  
        Employee emp3=new Accountant(13,"EMP3", 90000.0);   
        Employee manager1=new BankManager(10,"MNG1",400000.0);
        
        manager1.add(emp1);
        manager1.add(emp2);
        manager1.add(emp3);
        manager1.print();
        
	}
}
