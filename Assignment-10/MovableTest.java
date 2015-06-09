// File: MovableTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
public class MovableTest {
	public static void main(String[] args) {
		System.out.println("Creating a new MovablePoint mp:");
		Movable mp = new MovablePoint(5, 6, 10);     // upcast
		System.out.println(mp);
		System.out.println("Moving mp left");
		mp.moveLeft();
		System.out.println(mp);
		System.out.println("Moving mp up");
		mp.moveUp();
		System.out.println(mp);
				
		System.out.println("Creating a new MovableCircle mc:");
		Movable mc = new MovableCircle(2, 1, 2, 20); // upcast
		System.out.println(mc);
		System.out.println("Moving mc right");
		mc.moveRight();
		System.out.println(mc);
		System.out.println("Moving mc down");
		mc.moveDown();
		System.out.println(mc);
	}
}
