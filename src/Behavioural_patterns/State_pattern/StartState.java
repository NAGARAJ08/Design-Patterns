package Behavioural_patterns.State_pattern;

public class StartState implements State{

	@Override
	public void DoAction(Context context) {
		// TODO Auto-generated method stub
		System.out.println("Player is in start state");
		context.setState(this);
		
	}
	
	public String toString(){
		return "Start State";
	}

}
