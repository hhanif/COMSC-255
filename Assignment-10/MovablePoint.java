// File: MovablePoint.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
public class MovablePoint implements Movable{
	int x;
	int y;
	int xSpeed;
	int ySpeed;     // package access

	public MovablePoint(int x, int xSpeed, int ySpeed) { 
		this.x = x;
		this.y = x;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	@Override
	   public void moveUp() {
	      y -= ySpeed;   // y-axis pointing down for 2D graphics
	   }
	@Override
	   public void moveDown() {
	      y += ySpeed;   
	   }
	@Override
	   public void moveLeft() {
	      x -= xSpeed;  
	   }
	@Override
	   public void moveRight() {
	      x += xSpeed;   
	   }
	public String toString() {
		return "Point X: " + x + " Y: " + y + " Speed Xs: " + xSpeed + " Ys: " + ySpeed;
	}
	}
