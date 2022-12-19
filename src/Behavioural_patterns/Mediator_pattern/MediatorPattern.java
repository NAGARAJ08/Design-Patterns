package Behavioural_patterns.Mediator_pattern;

public class MediatorPattern {

	public static void main(String args[]) {
		
		User RBC = new User("RBC");
		User WBC = new User("WBC");
		
		RBC.sendMessage("Hi, WBC!");
		WBC.sendMessage("Hi, RBC!");
	}
}
