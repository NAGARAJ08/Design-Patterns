package Behavioural_patterns.State_pattern;

public class StopState implements State{

	@Override
	public void DoAction(Context context) {
		// TODO Auto-generated method stub
		System.out.println("Player is in stop state");
		context.setState(this);
		
	}
	
	public String toString(){
		return "Stop State";
	}

}
