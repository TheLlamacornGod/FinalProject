package edu.neumont.csc150.finalproject;

public class TileDoor extends Tile {
	
	public TileDoor() {
		
		super("Images/TileDoorLocked.png");
		
	}

	
	public void unlockDoor() {

		this.removeAll();

		changeImage("Images/TileDoorUnlocked.png");
	}
	
	
}
