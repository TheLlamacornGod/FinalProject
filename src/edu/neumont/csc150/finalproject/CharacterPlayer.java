package edu.neumont.csc150.finalproject;

import java.util.ArrayList;

public class CharacterPlayer extends Character {
	
	private Armor playerArmor;
	private Weapon playerWeapon;
	private ArrayList<Item> inventory;

	public CharacterPlayer(String location) {
		
		super("Images/CharacterPlayer");
		
		playerArmor = new Armor("Images/StartArmor.jpg");
		playerWeapon = new Weapon("Images/StartWeapon.jpg");
		
		
		inventory = new ArrayList<>();
		
	}
	
	public void addToInventory(Item item) {
		if (item != null) {
			inventory.add(item);
		}
	}
	
	public void EquipEquipment(Equipment equipment) {
		
	}
	
	public void ConsumeConsumable(Potion potion) {
		
	}

}
