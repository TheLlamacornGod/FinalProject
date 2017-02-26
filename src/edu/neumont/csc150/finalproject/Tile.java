package edu.neumont.csc150.finalproject;

import javax.swing.JPanel;

public abstract class Tile extends JPanel {
	
	private ImageComponent background;
	
	public Tile(String location) {
		this.setLayout(null);
		background = new ImageComponent(location);
		background.setLocation(0, 0);
		this.setSize(50, 50);
		this.add(background);
	}
	
}
