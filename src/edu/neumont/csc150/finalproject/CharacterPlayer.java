package edu.neumont.csc150.finalproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;

public class CharacterPlayer extends Character {
	
	private Shield playerShield;
	private Sword playerSword;
	private ArrayList<Item> inventory;
	private int health, attack, defense, counter, dx, dy;
	


	public CharacterPlayer() {
		
		super("Images/CharacterPlayer.png");
		
		this.setOpaque(false);
		
		playerSword = new Sword("Images/SwordStart.png");
		
		inventory = new ArrayList<>();
		
	}
	
	public void ConsumeConsumable(Potion potion) {
		
	}
	
	public void addKey(Key key){
		inventory.add(key);
	}
	
	public void removeKey(Key key) {
		this.remove(key);
	}
	
	public ArrayList<Item> getInventory() {
		return inventory;
	}
	
	public void setMoveDirection(int dx, int dy) {
		this.dx = dx;
		this.dy = dy;
	}
	
	public void movePlayer() {		
		this.setLocation(this.getX() + dx, this.getY() + dy);
	}
	

}
