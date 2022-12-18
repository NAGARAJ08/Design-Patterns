package Behavioural_patterns.State_pattern;

public class StatePattern {

	public static void main(String args[]) {
		
		Context context = new Context();
		
		StartState startstate = new StartState();
		startstate.DoAction(context);
		
		System.out.println(context.getState().toString());
		
		StopState stopstate = new StopState();
		stopstate.DoAction(context);
		
		System.out.println(context.getState().toString());
	}
}
