package edu.neumont.csc150.finalproject;

public class TileDoor extends Tile {
	
	private boolean locked;
	
	public TileDoor() {
		
		super("Images/TileDoorLocked.png");
		
		locked = true;
	}

	
	public void unlockDoor(Key key) {
		if (key != null) {
			changeImage("Images/TileDoorUnlocked.png");
		}
	}
	
	
}
