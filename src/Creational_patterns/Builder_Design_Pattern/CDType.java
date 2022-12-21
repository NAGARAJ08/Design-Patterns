package Creational_patterns.Builder_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class CDType {

	private List<Packing> items = new ArrayList<Packing>();
	
	public void addItem(Packing packs) {
		items.add(packs);
	}
	public void getCost() {
		for(Packing packs:items) {
			packs.price();
		}
	}
	
	public void showItems() {
		
		for(Packing packing:items)
		{
			System.out.println("CD name: "+packing.pack()+ ", Price : "+packing.price());
		  
		}
	}
}