package edu.neumont.csc150.finalproject;

public class TileFloor extends Tile {

	public TileFloor() {
		super("Images/TileFloorStairs.png");
	}
	
	@Override
	public void setCoordinates(int coordinateX, int coordinateY) {
		if (coordinateX > 0 && coordinateX < 20) {
//			this.coordinateX = coordinateX;
//			if ((coordinateX >= 8 && coordinateX <= 11) && (coordinateY > 2 && coordinateY < 17)) {
//				this.coordinateY = coordinateY;
//			} else if ((coordinateX < 7 || coordinateX > 13) && (coordinateY > 1 && coordinateY < 17)) {
//				this.coordinateY = coordinateY;
//			}
		}
	}
	
	public void changeFloor(int floor) {
		switch(floor) {
		case 1:
			changeImage("Images/TileFloor1LightBottom.png");
			break;
		case 2:
			changeImage("Images/TileFloor1LightLeft.png");
			break;
		case 3:
			changeImage("Images/TileFloor1LightRight.png");
			break;
		case 4:
			changeImage("Images/TileFloor1LightTop.png");
			break;
		case 5:
			changeImage("Images/TileFloor2LightsLeftBottom.png");
			break;
		case 6:
			changeImage("Images/TileFloor2LightsLeftRight.png");
			break;
		case 7:
			changeImage("Images/TileFloor2LightsLeftTop.png");
			break;
		case 8:
			changeImage("Images/TileFloor2LightsRightBottom.png");
			break;
		case 9:
			changeImage("Images/TileFloor2LightsRightTop.png");
			break;
		case 10:
			changeImage("Images/TileFloor2LightsTopBottom.png");
			break;
		case 11:
			changeImage("Images/TileFloor3LightsBottom.png");
			break;
		case 12:
			changeImage("Images/TileFloor3LightsLeft.png");
			break;
		case 13:
			changeImage("Images/TileFloor3LightsRight.png");
			break;
		case 14:
			changeImage("Images/TileFloor3LightsTop.png");
			break;
		case 15:
			changeImage("Images/TileFloor3LightsLeft.png");
			break;
		default:
			changeImage("Images/TileFloorStairs.png");
		}
	}
	
}
