package edu.neumont.csc150.finalproject;

public class TileWall extends Tile {

	public TileWall() {
		super("Images/TileWallBetween.png");
	}
	
	public void changeWall(int floor) {
		switch(floor) {
		case 1:
			changeImage("Images/TileWallBottom.png");
			break;
		case 2:
			changeImage("Images/TileWallCornerInsideLeftBottom.png");
			break;
		case 3:
			changeImage("Images/TileWallCornerInsideLeftTop.png");
			break;
		case 4:
			changeImage("Images/TileWallCornerInsideRightBottom.png");
			break;
		case 5:
			changeImage("Images/TileWallCornerInsideRightTop.png");
			break;
		case 6:
			changeImage("Images/TileWallCornerOutsideLeftBottom.png");
			break;
		case 7:
			changeImage("Images/TileWallCornerOutsideLeftTop.png");
			break;
		case 8:
			changeImage("Images/TileWallCornerOutsideRightBottom.png");
			break;
		case 9:
			changeImage("Images/TileWallCornerOutsideRightTop.png");
			break;
		case 10:
			changeImage("Images/TileWallLeft.png");
			break;
		case 11:
			changeImage("Images/TileWallRight.png");
			break;
		case 12:
			changeImage("Images/TileWallTop.png");
			break;
		default:
			changeImage("Images/TileWallBetween.png");
		}
	}
}
