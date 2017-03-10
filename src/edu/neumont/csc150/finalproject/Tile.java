package edu.neumont.csc150.finalproject;

import javax.swing.JPanel;

public abstract class Tile extends JPanel {
	
	private ImageComponent background;
	private int coordinateX, coordinateY;
	
	public Tile(String location) {
		
		this.setLayout(null);
		
		
		background = new ImageComponent(location);
		background.setLocation(0, 0);
		
		this.setSize(100, 100);
		this.add(background);
	}
	
	public void changeImage(String location) {
		
		this.remove(background);
		
		background = new ImageComponent(location);
		background.setLocation(0, 0);
		
		this.add(background);
	}
	
}
