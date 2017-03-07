package edu.neumont.csc150.finalproject;

import javax.swing.JPanel;
import javax.swing.Timer;

public class WindowDungeon extends JPanel {
	
	private CharacterPlayer player;
	private Tile[][] tiles;
	private Timer timer;
	private int x = 0, y = 0;
	
	public WindowDungeon(FrameGame game) {
		
		this.setLayout(null);
		
		tiles = new Tile[20][20];
		
		player = new CharacterPlayer();
		player.setLocation(50, 0);
		
		this.setSize(1000, 1000);
		this.add(player);
		setTiles();
		
	}
	
	private void setTiles() {
		for (x = 0; x < 20; x++) {
			for (y = 0; y < 20; y++) {
				tiles[x][y] = new TileWall();
				tiles[x][y].setLocation(50 * x, 50 * y);
				this.add(tiles[x][y]);
			}
		}
	}
}
