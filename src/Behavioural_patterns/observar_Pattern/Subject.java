package Behavioural_patterns.observar_Pattern;

import java.util.ArrayList;
import java.util.List;



//one to many relationship b/w objects

//Subject, Observer and Client.
public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	
	private int state;
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	public void attach(Observer observer) {
		observers.add(observer);
		
	}
	public void notifyAllObservers() {
		// TODO Auto-generated method stub
		for(Observer observer:observers) {
			observer.update();
		}
	}
	
	

}
