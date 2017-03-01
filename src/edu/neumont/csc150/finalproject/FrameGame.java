package edu.neumont.csc150.finalproject;

import javax.swing.JFrame;

public class FrameGame extends JFrame {
	
	private WindowStartScreen startScreen;
	private WindowDungeon dungeon;
	private WindowCredits creditsWindow;
	private WindowCharacterCreation characterCreator;
	private CharacterPlayer player;
	
	// Possible game name : "Fight or Flight Knight"
	
	public FrameGame() {
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		startScreen = new WindowStartScreen(this);
		startScreen.setLocation(0, 0);
		
		this.setSize(startScreen.getSize());
		this.setResizable(false);
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
			this.setContentPane(characterCreator);
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
