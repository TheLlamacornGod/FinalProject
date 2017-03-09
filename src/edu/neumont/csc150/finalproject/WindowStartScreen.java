package edu.neumont.csc150.finalproject;

import javax.swing.JPanel;

public class WindowStartScreen extends JPanel {

	private ImageComponent background;
	private MenuButtons start, credits, exit;
	
	public WindowStartScreen(FrameGame game) {
		
		this.setLayout(null);
		
		background = new ImageComponent("Images/StartScreen.png");
		background.setLocation(0, 0);
		
		start = new MenuButtons(game, 3, "Start");
		start.setSize(110, 50);
		start.setLocation((background.getWidth()/3) - (start.getWidth()/2), 800);

//		credits = new MenuButtons(game, 4, "Credits");
//		credits.setSize(140, 50);
//		credits.setLocation((background.getWidth()/2) - (credits.getWidth()/2), start.getY() + credits.getHeight());
		
		exit = new MenuButtons(game, 0, "Exit");
		exit.setSize(110, 50);
		exit.setLocation((background.getWidth()/2) + (exit.getWidth()), 800);
		
		this.setSize(background.getWidth(), background.getHeight() + 50);
		this.add(start);
//		this.add(credits);
		this.add(exit);
		this.add(background);
	}
	
}
