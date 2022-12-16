package Behavioural_patterns.chain_of_Responsibility;

public class FileLogger extends AbstractLogger{

	public FileLogger(int level){
		this.level = level;
	}
	@Override
	protected void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("File::Logger: "+message);
	}

}
