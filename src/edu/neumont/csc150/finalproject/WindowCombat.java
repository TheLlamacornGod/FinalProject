package edu.neumont.csc150.finalproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowCombat extends JPanel {
	
	private MenuButtons attack, defend, escape, potion;
	
	public WindowCombat(CharacterPlayer player, JFrame frame) {
		
		this.setLayout(null);
		
		this.setBackground(Color.BLACK);
		
		attack = new MenuButtons(frame, 0, "Attack");
		
		defend = new MenuButtons(frame, 1, "Defend");
		
		escape = new MenuButtons(frame, 2, "Escape");
		
		potion = new MenuButtons(frame, 3, "Start");
		
		
		this.add(attack);
		this.add(escape);
	}
}
