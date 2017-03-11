package edu.neumont.csc150.finalproject.group21;

import javax.swing.JPanel;

public abstract class Item extends JPanel {
	
	private ImageComponent item;
	
	public Item(String location) {
		
		this.setLayout(null);
		
		item = new ImageComponent(location);
		this.setOpaque(false);
		this.setSize(100, 100);
		item.setLocation(0, 0);
		
		this.add(item);
	}
	
	
}
