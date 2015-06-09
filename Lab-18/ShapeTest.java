// File: ShapeTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//circle
		Circle a = new Circle();
		System.out.println(a);
		
		//Rectangle
		Rectangle b = new Rectangle(33.3, 22.2, "green", false);
		System.out.println(b);
		
		//compare a & b's areas
		System.out.println(equalArea(a, b)? "":"not" + " equal");
		
		
	}
	
	public static boolean equalArea(Shape one, Shape two)
	{
		if (one.getArea() == two.getArea())
			return true;
		else
			return false;
	}
}
