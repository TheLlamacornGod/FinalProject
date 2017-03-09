package edu.neumont.csc150.finalproject;

public class Sword extends Equipment implements Equip {
	
	//Use polymorphism to equip weapons & armor

	private int attackChance;
	
	public Sword(String location) {
		super(location);
		
//		if location {
//		
//		}
	}

	@Override
	public void Equip(Equip e) {
		
	}
	
	public int getAttackChance() {
		return attackChance;
	}

}
