package edu.neumont.csc150.finalproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;

public class WindowDungeon extends JPanel {
	
	private CharacterPlayer player;
	private Tile[][] tiles;
	private int x = 0, y = 0, level = 1, counter, playerX, playerY;
	private Random rand = new Random();
	private FrameCombat combat;
	private static final int counterLimit = 100;
	private Timer timer;
	private InputMap im;
	private ActionMap am;
	
	public WindowDungeon(FrameGame game) {
		
		this.setLayout(null);
		
		tiles = new Tile[10][10];
		
		player = new CharacterPlayer();
		player.setLocation(0, 400);
		playerX = player.getX()/100;
		playerY = player.getY()/100;
		
		this.setSize(1000, 1000);
		this.add(player);
		
//		generateMaze(rand.nextInt(3) + 1);
		generateMaze(2);
		
		combat = new FrameCombat(player);
		
		am = player.getActionMap();
		im = player.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);

		
		im.put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0), "UP");
		am.put("UP", new ArrowAction("UP"));
		
		im.put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0), "DOWN");
		am.put("DOWN", new ArrowAction("DOWN"));
		
		im.put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0), "LEFT");
		am.put("LEFT", new ArrowAction("LEFT"));
		
		im.put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0), "RIGHT");
		am.put("RIGHT", new ArrowAction("RIGHT"));
		
		timer = new Timer(10, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				player.movePlayer();
				counter++;
				if (counter >= counterLimit) {
					timer.stop();
					counter = 0;
					player.setMoveDirection(0, 0);
				}
			}
		});
	}
	
	public class ArrowAction extends AbstractAction {

	    private String cmd;

	    public ArrowAction(String cmd) {
	        this.cmd = cmd;
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if (!timer.isRunning()) {
	        	if (cmd.equalsIgnoreCase("LEFT")) {
	        		if (tiles[playerX - 1][playerY] instanceof TileFloor) {
	        			player.setMoveDirection(-1, 0);
	        			playerX--;
	        		}
	        	} else if (cmd.equalsIgnoreCase("RIGHT")) {
	        		if (tiles[playerX + 1][playerY] instanceof TileFloor) {
	        			player.setMoveDirection(1, 0);
	        			playerX++;
	        		}
	        	} else if (cmd.equalsIgnoreCase("UP")) {
	        		if (tiles[playerX][playerY - 1] instanceof TileFloor) {
	        			player.setMoveDirection(0, -1);
	        			playerY--;
	        		}
	        	} else if (cmd.equalsIgnoreCase("DOWN")) {
	        		if (tiles[playerX][playerY + 1] instanceof TileFloor) {
	        			player.setMoveDirection(0, 1);
	        			playerY++;
	        		}
	        	}
	        	timer.start();	        	
	        }
	    }
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
		int x = 1, y = 4;
		boolean path = false;
		
		tiles[0][4] = new TileFloor();
		tiles[0][4].setLocation(0, 400);
		this.add(tiles[0][4]);
		((TileFloor)tiles[0][4]).changeFloor(5);
		
		tiles[9][4] = new TileDoor();
		tiles[9][4].setLocation(900, 400);
		this.add(tiles[9][4]);
		
		do
		{
			tiles[x][y] = new TileFloor();
			tiles[x][y].setLocation(100 * x, 100 * y);
			this.add(tiles[x][y]);
			
			if (x == 8 && y == 4) {
				path = true;
			}
			
			if (rand.nextBoolean()) {
				if (x == 8) {
					x--;
				} else if (x <= 1) {
					x++;
				} else if (rand.nextInt(100) + 1 >= 25){
					x++;
				} else {
					x--;
				}
			} else {
				if (y == 8) {
					y--;
				} else if (y == 1) {
					y++;
				} else if (rand.nextInt(100) + 1 >= 50) {
					y++;
				} else {
					y--;
				}
			}
			
		} while (!path);
		
		for (x = 0; x < 10; x++) {
			for (y = 0; y < 10; y++) {
				if (tiles[x][y] == null) {
					tiles[x][y] = new TileWall();
					tiles[x][y].setLocation(100 * x, 100 * y);
					this.add(tiles[x][y]);					
				}
			}
		}
		
		reimageTiles();
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
	
	public void reimageTiles() {
		
		int changes = 0;
		for (x = 1; x < 10; x++) {
			
			for (y = 1; y < 10; y++) {
				
				if (tiles[x][y] instanceof TileFloor) {
										
					if (tiles[x + 1][y] instanceof TileWall) {					//RightWall
						
						if (tiles[x - 1][y] instanceof TileWall) {					//RLeftWall
							
							if (tiles[x][y + 1] instanceof TileWall) {					//RLBottomWall
								
								((TileFloor)tiles[x][y]).changeFloor(11);					//RLB
								changes++;
								
							} else if (tiles[x][y - 1] instanceof TileWall) {			//RLTopWall
								
								((TileFloor)tiles[x][y]).changeFloor(14);					//RLT
								changes++;
								
							} else {													//RLeftWall
								
								((TileFloor)tiles[x][y]).changeFloor(6);					//RL
								changes++;
								
							}
							
						} else if (tiles[x][y - 1] instanceof TileWall) {			//RTopWall
							

							if (tiles[x][y + 1] instanceof TileWall) {					//RTBottomWall
								
								((TileFloor)tiles[x][y]).changeFloor(13);					//RTB
								changes++;
								
							} else {													//RTopWall
								
								((TileFloor)tiles[x][y]).changeFloor(9);					//RT
								changes++;
								
							}
							
						} else if (tiles[x][y + 1] instanceof TileWall) {			//RBottomWall
						
							((TileFloor)tiles[x][y]).changeFloor(8);					//RB
							changes++;
							
						} else {													//RightWall
							
							((TileFloor)tiles[x][y]).changeFloor(3);					//R
							changes++;
							
						}
						
					} else if (tiles[x - 1][y] instanceof TileWall) {			//LeftWall
						
						if (tiles[x][y + 1] instanceof TileWall) {					//LBottomWall
							
							if (tiles[x][y - 1] instanceof TileWall) {					//LBTopWall
								
								((TileFloor)tiles[x][y]).changeFloor(12);					//LBT
								changes++;
								
							} else {													//LBottomWall
								
								((TileFloor)tiles[x][y]).changeFloor(5);					//LB
								changes++;
								
							}
							
						} else if (tiles[x][y - 1] instanceof TileWall) {			//LTopWall
							
							((TileFloor)tiles[x][y]).changeFloor(7);					//LT
							changes++;
							
						} else {													//LeftWall
							
							((TileFloor)tiles[x][y]).changeFloor(2);					//L
							changes++;
							
						}
						
					} else if (tiles[x][y + 1] instanceof TileWall)	{			//BottomWall
						
						if (tiles[x][y - 1] instanceof TileWall) {					//BTopWall
							
							((TileFloor)tiles[x][y]).changeFloor(10);					//BT
							changes++;
							
						} else {													//BWall
							
							((TileFloor)tiles[x][y]).changeFloor(1);				//B
							changes++;
							
						}
						
					} else if (tiles[x][y - 1] instanceof TileWall) {				//
						
						((TileFloor)tiles[x][y]).changeFloor(4);
						changes++;
						
					} else {
						
						((TileFloor)tiles[x][y]).changeFloor(15);
						changes++;
						
					}
						
				} else if (tiles[x][y] instanceof TileWall) {
					
				}
			}
		}
		System.out.println(changes);
	}
}
