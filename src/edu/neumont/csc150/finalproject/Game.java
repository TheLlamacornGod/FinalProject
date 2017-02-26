package edu.neumont.csc150.finalproject;

import javax.swing.JFrame;

public class Game extends JFrame{
	
	private WindowStartScreen startScreen;
	private WindowDungeon gameDungeon;
	private WindowCredits creditsWindow;
	
	public Game() {
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		startScreen = new WindowStartScreen(this);
		startScreen.setLocation(0, 0);
		
		this.setSize(startScreen.getSize());
		this.setMinimumSize(startScreen.getSize());
		this.setLocationRelativeTo(null);
		this.setContentPane(startScreen);
		
		this.setVisible(true);
	}
	
	public void buttonPressed(int button) {
		switch (button) {
		case 0:
			this.dispose();
			break;
		case 1:
			this.setContentPane(gameDungeon);
			break;
		case 2:
			this.setContentPane(creditsWindow);
			break;
		case 3:
			this.setContentPane(startScreen);
		default:
			System.out.println("Invalid value was passed into buttonPressed.");
			break;
		}
	}
}
