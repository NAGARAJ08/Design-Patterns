package Behavioural_patterns.Template_Pattern;

public class Chess extends Game{

	@Override
	void initialize() {
		// TODO Auto-generated method stub
		System.out.println("Chess Game is Being initialized! ");
	}

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Game Started. Welcome to in the chess game!"); 
	}

	@Override
	void end() {
		// TODO Auto-generated method stub
        System.out.println("Game Finished!");  

	}

}
