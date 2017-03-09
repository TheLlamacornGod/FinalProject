package edu.neumont.csc150.finalproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.KeyStroke;
import javax.swing.Timer;

public class CharacterPlayer extends Character implements KeyListener {
	
	private Armor playerArmor;
	private Weapon playerWeapon;
	private ArrayList<Item> inventory;
	private int health, attack, defense, counter, dx = 1, dy = 1;
	private static final int counterLimit = 100;
	private Timer timer;


	public CharacterPlayer() {
		
		super("Images/CharacterPlayer.png");
		
		this.setOpaque(false);
		
//		this.getInputMap().put(KeyStroke.getKeyStroke("VK_UP"), "typed");
//		this.getActionMap().put("typed", );
		
		
		
		inventory = new ArrayList<>();
		
		timer = new Timer(10, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				movePlayer();
				counter++;
				if (counter >= counterLimit) {
					timer.stop();
					counter = 0;
				}
			}
		});
		
	}
	
	public void ConsumeConsumable(Potion potion) {
		
	}
	
	public void movePlayer() {
		
		this.setLocation(this.getX() + dx, this.getY() + dy);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("ahhhhh");
		if (!timer.isRunning()) {
			
			int keyCode = e.getKeyCode();
			if(keyCode == KeyEvent.VK_UP) {
				dx = 0;
				dy = -1;
			} else if (keyCode == KeyEvent.VK_DOWN) {
				dx = 0;
				dy = 1;
			} else if (keyCode == KeyEvent.VK_LEFT) {
				dx = -1;
				dy = 0;
			} else if (keyCode == KeyEvent.VK_RIGHT) {
				dx = 1;
				dy = 0;
			}
			
			timer.start();
		}

	}
}
