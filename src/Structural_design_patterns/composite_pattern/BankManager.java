package Structural_design_patterns.composite_pattern;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BankManager implements Employee{

	private int id;
	private String name;
	private double salary;
	
	public BankManager(int id,String name,double salary) 
	{  
	      this.id=id;      
	      this.name = name;  
	      this.salary = salary;  
	}  
	
	List<Employee>employees = new ArrayList<Employee>();
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	public void print() {
		System.out.println("==========================");  
	      System.out.println("Id ="+getId());  
	      System.out.println("Name ="+getName());  
	      System.out.println("Salary ="+getSalary());  
	      System.out.println("==========================");  
	        
	      Iterator<Employee> it = employees.iterator();  
	        
	          while(it.hasNext())  {  
	            Employee employee = it.next();  
	            employee.print();  
	         }  
		
	}

	@Override
	public void add(Employee employee) {
		// TODO Auto-generated method stub
		employees.add(employee);
		
	}

	@Override
	public void remove(Employee employee) {
		// TODO Auto-generated method stub
		employees.remove(employee);
		
	}

	@Override
	public Employee getChildid(int i) {
		// TODO Auto-generated method stub
		return employees.get(i);
	}

	
}
