package edu.neumont.csc150.finalproject.group21;

public abstract class Equipment extends Item implements Equip {
	
	private boolean equiped = false;
	
	public Equipment(String location) {
		super(location);
	}
	
	public void setEquiped(boolean equiped) {
		this.equiped = equiped;
	}
	
}
