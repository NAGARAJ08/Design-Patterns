package Creational_patterns.Builder_Design_Pattern;

public class BuilderPattern {

	public static void main(String args[]) {
		
		CDBuilder cdBuilder = new CDBuilder();
		CDType cdType1 = cdBuilder.buildSonyCD();
		cdType1.showItems();
		
		CDType cdType2 = cdBuilder.buildSamasungCD();
		cdType2.showItems();
	}
}
