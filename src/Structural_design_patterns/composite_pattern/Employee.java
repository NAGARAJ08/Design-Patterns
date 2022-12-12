package Structural_design_patterns.composite_pattern;

public interface Employee {

	public int getId();
	public String getName();
	public double getSalary();
	public void print();
	public void add(Employee employee);
	public void remove(Employee employee);
	public Employee getChildid(int i);
	
}
