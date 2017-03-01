package edu.neumont.csc150.finalproject;

public class Weapon extends Item implements Equip {
	
	//Use polymorphism to equip weapons & armor
	
	public Weapon(String location) {
		super(location);
	}

	@Override
	public void Equip(Equip e) {
		
	}

}
