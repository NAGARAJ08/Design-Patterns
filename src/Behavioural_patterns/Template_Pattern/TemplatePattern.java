package Behavioural_patterns.Template_Pattern;

public class TemplatePattern {

	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws InstantiationException,IllegalAccessException,ClassNotFoundException{
		
		Game game = new Chess();
		game.play();
		System.out.println();
		game = new football();
		game.play();
	}
}
