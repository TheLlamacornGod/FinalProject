package edu.neumont.csc150.finalproject;

import javax.swing.JFrame;

public class Game extends JFrame{
	
	private WindowStartScreen startScreen;
	private WindowDungeon gameDungeon;
	
	public Game() {
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		startScreen = new WindowStartScreen();
		startScreen.setLocation(0, 0);
		
		this.setSize(startScreen.getSize());
		this.setContentPane(startScreen);
		
		this.setVisible(true);
	}
}
