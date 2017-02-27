package edu.neumont.csc150.finalproject;

import javax.swing.JPanel;

public class Item extends JPanel{
	
	private ImageComponent item;
	
	public Item(String location) {
		
		this.setLayout(null);
		
		item = new ImageComponent(location);
		item.setLocation(0, 0);
		
		this.add(item);
	}
	
	
}
