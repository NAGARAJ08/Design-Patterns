package Structural_design_patterns.Proxy_Pattern;

public class ProxyInternetAccess implements OfficeInternetAccess{

	
	private String employeename;
	private RealInternetAccess realaccess;
	
	public ProxyInternetAccess(String employeename)
	{
		this.employeename = employeename;
	}
	@Override
	public void grantInternetAccess() {
		// TODO Auto-generated method stub
		
		if(getRole(employeename)>4)
		{
			realaccess = new RealInternetAccess(employeename);
		}
		else {
			System.out.println("No Internet access granted. Your job level is below 5");
		}
	}
	
	public int getRole(String emplname)
	{
		return 9;
	}

}
