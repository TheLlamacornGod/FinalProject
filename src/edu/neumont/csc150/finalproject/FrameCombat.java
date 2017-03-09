package edu.neumont.csc150.finalproject;

import javax.swing.JFrame;

public class FrameCombat extends JFrame {
	
	private WindowCombat combat;
	
	public FrameCombat(CharacterPlayer player) {
		
		this.setLayout(null);
		
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		
		combat = new WindowCombat(player);
		combat.setLocation(0, 0);
		
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		this.setContentPane(combat);
		
		this.setVisible(true);
		this.setSize(1000, 500);
	}
	
	public void buttonPressed(int button) {
		
	}
}
