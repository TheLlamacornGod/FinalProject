package edu.neumont.csc150.finalproject;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class ImageComponent extends JComponent {

	private Image img;
	
	public ImageComponent(String location) {
		
		img = new ImageIcon(this.getClass().getResource(location)).getImage();
		
		this.setSize(img.getWidth(null), img.getHeight(null));
	}

	
	@Override
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}

}