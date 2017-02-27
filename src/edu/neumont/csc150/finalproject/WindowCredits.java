package edu.neumont.csc150.finalproject;

import javax.swing.JPanel;
import javax.swing.Timer;

public class WindowCredits extends JPanel{
	
	private Timer timer;
	private ImageComponent credits;
	private Game game;
	
	public WindowCredits(Game game) {
		
		this.game = game;
		
		this.setLayout(null);
		
		credits = new ImageComponent("Images/Credits.jpg");
		credits.setLocation(0, 0);
		
		this.add(credits);
	}
	
	
	
}