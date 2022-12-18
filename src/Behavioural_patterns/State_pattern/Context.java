package Behavioural_patterns.State_pattern;

public class Context {

	private State state;
	
	public Context() {
		state = null;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	
	public State getState() {
		return state;
	}
}
