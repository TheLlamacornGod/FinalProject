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
	
	public int getCoordinateX() {
		return coordinateX;
	}
	
	public int getCoordinateY() {
		return coordinateY;
	}
	
	public void setCoordinates(int coordinateX, int coordinateY) {
		
	}
	
	public void changeImage(String location) {
		background = new ImageComponent(location);
		this.repaint();
	}
	
}
