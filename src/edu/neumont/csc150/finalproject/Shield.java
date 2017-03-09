package edu.neumont.csc150.finalproject;

public class Shield extends Equipment implements Equip {
	
	//Use polymorphism to equip weapons & armor
	
	private int defenseChance;

	public Shield(String location) {
		super(location);
		
//		if location {
//			
//		}
	}

	@Override
	public void Equip(Equip e) {
		
	}
	
	public int getDefenseChance() {
		return defenseChance;
	}

}
