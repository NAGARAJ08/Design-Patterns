package Structural_design_patterns.Proxy_Pattern;

public class ProxyClient {

	public static void main(String args[])
	{
		OfficeInternetAccess access = new ProxyInternetAccess("Tony Stark");
		access.grantInternetAccess();
	}
}
