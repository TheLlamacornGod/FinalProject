package edu.neumont.csc150.finalproject.group21;

import java.util.ArrayList;

import javax.swing.JPanel;

public abstract class Character extends JPanel {
	
	private ImageComponent characterImage;
	
	public Character(String location) {
		
		this.setLayout(null);
		
		characterImage = new ImageComponent(location);
		characterImage.setLocation(0, 0);
		
		this.setSize(100, 100);
		this.add(characterImage);
		
	}
	
}
 