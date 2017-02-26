package edu.neumont.csc150.finalproject;

import javax.swing.JFrame;

public class Game extends JFrame{
	
	private WindowStartScreen startScreen;
	private WindowDungeon gameDungeon;
	
	public Game() {
		
		this.setLayout(null);
		
		startScreen = new WindowStartScreen();
		
	}
}
