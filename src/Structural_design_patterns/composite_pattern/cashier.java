package Structural_design_patterns.composite_pattern;

public class cashier implements Employee{

	private int id;
	private String name;
	private double salary;
	
	public cashier(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary= salary;
		
	}
	
	
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
		// TODO Auto-generated method stub
		 System.out.println("==========================");  
         System.out.println("Id ="+getId());  
         System.out.println("Name ="+getName());  
         System.out.println("Salary ="+getSalary());  
         System.out.println("==========================");  
	}

	@Override
	public void add(Employee employee) {
		//this is leaf so no applicable
		
	}

	@Override
	public void remove(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getChildid(int i) {
		// this is leaf so no applicable
		return null;
	}
	

}
