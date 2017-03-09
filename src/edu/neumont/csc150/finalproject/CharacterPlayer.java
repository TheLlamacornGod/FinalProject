package edu.neumont.csc150.finalproject;

import java.util.ArrayList;

public class CharacterPlayer extends Character {
	
	private Armor playerArmor;
	private Weapon playerWeapon;
	private ArrayList<Item> inventory;
	private int health, attack, defense;

	public CharacterPlayer() {
		
		super("Images/CharacterPlayer.png");
		
		this.setOpaque(false);
		
		
		inventory = new ArrayList<>();
		
	}
	
	public void ConsumeConsumable(Potion potion) {
		
	}
	
	public void movePlayer(int x, int y) {
		this.setLocation(this.getX() + x, this.getY() + y);
	}

}
