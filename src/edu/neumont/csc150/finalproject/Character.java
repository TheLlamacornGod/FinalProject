package edu.neumont.csc150.finalproject;

import java.util.ArrayList;

import javax.swing.JPanel;

public abstract class Character extends JPanel {
	
	private ImageComponent characterImage;
	
	public Character(String location) {
		
		this.setLayout(null);
		
		characterImage = new ImageComponent(location);
		characterImage.setLocation(0, 0);
		
		this.add(characterImage);
		
	}
	
}
 