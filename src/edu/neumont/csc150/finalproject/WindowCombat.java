package edu.neumont.csc150.finalproject;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class WindowCombat extends JPanel {
	
	private JButton attack, defend, escape;
	
	public WindowCombat(CharacterPlayer player) {
		
		this.setLayout(null);
		
		this.setBackground(Color.BLACK);
		
		attack = new JButton("Attack");
		attack.setSize(100, 50);
		attack.setFont(new Font("SansSerif", 1, 30));
		attack.setForeground(Color.LIGHT_GRAY);
		attack.setContentAreaFilled(false);
		attack.setBorder(null);
		attack.setFocusPainted(false);
		
		this.add(attack);
	}
}
