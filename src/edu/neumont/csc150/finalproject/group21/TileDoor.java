package edu.neumont.csc150.finalproject.group21;

public class TileDoor extends Tile {
	
	public TileDoor() {
		
		super("Images/TileDoorLocked.png");
		
	}

	
	public void unlockDoor() {

		this.removeAll();

		changeImage("Images/TileDoorUnlocked.png");
	}
	
	
}
