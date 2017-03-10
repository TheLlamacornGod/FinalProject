package edu.neumont.csc150.finalproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

public class MenuButtons extends JButton {
	
	private int size = 30;
	private boolean increase = true;
	private Timer timer;
	
	public MenuButtons(JFrame frame, int actionValue, String text) {

		super(text);		
		
		this.setFont(new Font("SansSerif", 1, 30));
		this.setForeground(Color.LIGHT_GRAY);
		this.setContentAreaFilled(false);
		this.setBorder(null);
		this.setFocusPainted(false);
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
				MenuButtons.this.setForeground(Color.BLACK);
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				
				MenuButtons.this.setForeground(Color.WHITE);
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				
				MenuButtons.this.setForeground(Color.LIGHT_GRAY);
				
				timer.stop();
				
				size = 30;
				increase = true;
				MenuButtons.this.setFont(new Font("SansSerif", 1, 30));
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				
				MenuButtons.this.setForeground(Color.RED.darker());
				
				timer = new Timer(90, new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if (increase && size < 40) {
							size++;
							MenuButtons.this.setFont(new Font("SansSerif", 1, size));
						} else if (!increase && size > 30) {
							size--;
							MenuButtons.this.setFont(new Font("SansSerif", 1, size));
						} else {							
							if (increase) {
								increase = false;
							} else if (!increase) {
								increase = true;
							}
						}
					}
				});
				timer.start();
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (frame instanceof FrameGame) {
					FrameGame game = (FrameGame)frame; 
					game.buttonPressed(actionValue);					
				} else if (frame instanceof FrameCombat) {
					FrameCombat combat = (FrameCombat)frame; 
					combat.buttonPressed(actionValue);
				}
			}
		});
	}
}
