// File: CircleTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
public class CircleTest {

	public static void main(String[] args) {
		System.out.println("c1 - default circle");
		Circle c1 = new Circle();
		System.out.println(c1);
		
		System.out.println("c2 - circle with radius == 2");
		Circle c2 = new Circle(2.0);
		System.out.println(c2);
		
		System.out.println("c3 - default ResizableCircle");
		ResizableCircle c3 = new ResizableCircle();
		System.out.println(c3);
		
		System.out.println("c3 - changing to 200%");
		c3.resize(200);
		System.out.println(c3);


	}

}
