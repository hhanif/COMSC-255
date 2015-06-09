// File: MovableCircle.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
public class MovableCircle implements Movable{
	   private MovablePoint center;   // can use center.x, center.y directly
	   private int radius;

		public MovableCircle(int x, int xSpeed, int ySpeed, int radius) {
		// Call the MovablePoint's constructor to allocate the center instance.
		this.center = new MovablePoint(x, xSpeed, ySpeed);
		this.radius = radius;
	}

	   // Implement abstract methods declared in the interface Movable
	   @Override
	   public void moveUp() {
	      center.y -= center.ySpeed;
	   }
	   @Override
	   public void moveDown() {
	      center.y += center.ySpeed;
	   }
	   @Override
	   public void moveLeft() {
	      center.x -= center.xSpeed;
	   }
	   @Override
	   public void moveRight() {
	      center.x += center.xSpeed;
	   }
		public String toString() {
			return "Radius: " + radius + " Center X: " + center.x + " Y: " + center.y + " Speed Xs: " + center.xSpeed + " Ys: " + center.ySpeed;
		}

	}
