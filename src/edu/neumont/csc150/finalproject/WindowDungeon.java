package edu.neumont.csc150.finalproject;

import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class WindowDungeon extends JPanel {
	
	private CharacterPlayer player;
	private Tile[][] tiles;
	private int x = 0, y = 0, level = 1;
	private Random rand = new Random();
	private FrameCombat combat;
	
	public WindowDungeon(FrameGame game) {
		
		this.setLayout(null);
		
		tiles = new Tile[20][20];
		
		player = new CharacterPlayer();
		player.setLocation(100, 0);
		
		this.setSize(1000, 1000);
		this.add(player);
		
		generateMaze(rand.nextInt(3) + 1);
		
		combat = new FrameCombat(player);
		
	}
	
	private void generateMaze(int maze) {
		switch(maze) {
		case 1:
			maze1();
			break;
		case 2:
			maze2();
			break;
		case 3:
			maze3();
			break;
		default:
			maze1();
		}
	}

	private void maze1() {
		for (x = 0; x < 10; x++) {
			for (y = 0; y < 10; y++) {
				tiles[x][y] = new TileFloor();
				tiles[x][y].setLocation(100 * x, 100 * y);
				this.add(tiles[x][y]);
			}
		}
	}
	
	private void maze2() {
		for (x = 0; x < 10; x++) {
			for (y = 0; y < 10; y++) {
				tiles[x][y] = new TileWall();
				tiles[x][y].setLocation(100 * x, 100 * y);
				this.add(tiles[x][y]);
			}
		}
	}
	
	private void maze3() {
		for (x = 0; x < 10; x++) {
			for (y = 0; y < 10; y++) {
				tiles[x][y] = new TileDoor();
				tiles[x][y].setLocation(100 * x, 100 * y);
				this.add(tiles[x][y]);
			}
		}
	}
}
