package edu.neumont.csc150.finalproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;

public class CharacterPlayer extends Character {
	
	private Shield playerShield;
	private Sword playerSword;
	private ArrayList<Item> inventory;
	private int health, attack, defense, counter, dx = 1, dy = 1;
	private static final int counterLimit = 100;
	private Timer timer;
	private InputMap im;
	private ActionMap am;


	public CharacterPlayer() {
		
		super("Images/CharacterPlayer.png");
		
		this.setOpaque(false);
		
		am = this.getActionMap();
		im = this.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);

		
		im.put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0), "UP");
		am.put("UP", new ArrowAction("UP"));
		
		im.put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0), "DOWN");
		am.put("DOWN", new ArrowAction("DOWN"));
		
		im.put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0), "LEFT");
		am.put("LEFT", new ArrowAction("LEFT"));
		
		im.put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0), "RIGHT");
		am.put("RIGHT", new ArrowAction("RIGHT"));
		
		playerSword = new Sword("Images/SwordStart.png");
		
		inventory = new ArrayList<>();
		
		timer = new Timer(10, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				movePlayer();
				counter++;
				if (counter >= counterLimit) {
					timer.stop();
					counter = 0;
				}
			}
		});
	}
	
	public void ConsumeConsumable(Potion potion) {
		
	}
	
	public void movePlayer() {		
		this.setLocation(this.getX() + dx, this.getY() + dy);
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
	        		dx = -1;
	        		dy = 0;
	        	} else if (cmd.equalsIgnoreCase("RIGHT")) {
	        		dx = 1;
	        		dy = 0;
	        	} else if (cmd.equalsIgnoreCase("UP")) {
	        		dx = 0;
	        		dy = -1;
	        	} else if (cmd.equalsIgnoreCase("DOWN")) {
	        		dx = 0;
	        		dy = 1;
	        	}
	        	timer.start();	        	
	        }
	    }
	}
}
