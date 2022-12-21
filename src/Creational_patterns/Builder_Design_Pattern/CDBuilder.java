package Creational_patterns.Builder_Design_Pattern;

public class CDBuilder {
	
	public CDType buildSonyCD()
	{
		CDType cds = new CDType();
		cds.addItem(new Sony());
		return cds;
	}
	
	public CDType buildSamasungCD() {
		CDType cds = new CDType();
		cds.addItem(new Samsung());
		return cds;
	}

}
