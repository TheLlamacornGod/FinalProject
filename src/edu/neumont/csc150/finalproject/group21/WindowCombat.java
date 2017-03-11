package edu.neumont.csc150.finalproject.group21;

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
		attack.setSize(150, 50);
		attack.setLocation(50, 50);
		
		defend = new MenuButtons(frame, 1, "Defend");
		defend.setSize(150, 50);
		defend.setLocation(50, 150);
		
		escape = new MenuButtons(frame, 2, "Escape");
		escape.setSize(150, 50);
		escape.setLocation(50,250);
		
		potion = new MenuButtons(frame, 3, "Potion");
		potion.setSize(150, 50);
		potion.setLocation(50, 350);
		
		
		this.add(attack);
		this.add(defend);
		this.add(escape);
		this.add(potion);
	}
}
