package Behavioural_patterns.Template_Pattern;

public abstract class Game {

	abstract void initialize();
	abstract void start();
	abstract void end();
	
	
	//final : because the subclasses cannot override this method
	public final void play()
	{
		//initialize the game
		initialize();
		
		//start the game
		start();
		
		//end the game
		end();
	}
}
