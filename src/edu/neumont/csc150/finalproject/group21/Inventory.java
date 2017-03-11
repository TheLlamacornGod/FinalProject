package edu.neumont.csc150.finalproject.group21;

import java.util.ArrayList;

import javax.swing.JPanel;

public class Inventory extends JPanel {
	
	private ArrayList<Item> inventory;
	
	public Inventory(ArrayList<Item> inventory) {
		this.inventory = inventory; 
	}
	
}
