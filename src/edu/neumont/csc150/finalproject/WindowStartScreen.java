package edu.neumont.csc150.finalproject;

import javax.swing.JPanel;

import java.awt.Font;

import javax.swing.JButton;

public class WindowStartScreen extends JPanel{

	private ImageComponent background;
	private JButton start, credits, exit;
	
	public WindowStartScreen() {
		
		this.setLayout(null);
		
		background = new ImageComponent("Images/StartScreen.jpg");
		background.setLocation(0, 0);
		
		start = new JButton("Start");
		start.setSize(110, 50);
		start.setFont(new Font("SansSerif", 1, 30));
		start.setContentAreaFilled(false);
		start.setLocation((background.getWidth()/2) - (start.getWidth()/2), (background.getHeight()/2) - (start.getHeight()/2));

		credits = new JButton("Credits");
		credits.setSize(140, 50);
		credits.setFont(new Font("SansSerif", 1, 30));
		credits.setContentAreaFilled(false);
		credits.setLocation((background.getWidth()/2) - (credits.getWidth()/2), start.getY() + credits.getHeight());
		
		exit = new JButton("Exit");
		exit.setSize(110, 50);
		exit.setFont(new Font("SansSerif", 1, 30));
		exit.setContentAreaFilled(false);
		exit.setLocation((background.getWidth()/2) - (exit.getWidth()/2), credits.getY() + exit.getHeight());
		
		this.setSize(background.getWidth(), background.getHeight());
		this.add(start);
		this.add(credits);
		this.add(exit);
		this.add(background);
		
		this.setVisible(true);
	}
	
	
}
