package Structural_design_patterns.Proxy_Pattern;

public class RealInternetAccess implements OfficeInternetAccess{

	private String employeename;
	
	public RealInternetAccess(String empname)
	{
		this.employeename =empname;
	}
	
	@Override
	public void grantInternetAccess() {
		// TODO Auto-generated method stub
	
		System.out.println("Internet Access granted for employee: "+ employeename);
	}
	
	
}
