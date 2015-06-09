// File: LineTest.java
// Name: Haris Hanif 
// DVC ID: 1392603
// IDE:  Eclipse Luna



public class LineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Line l1 = new Line(1, 2, 3, 4);
		System.out.println("Line 1: " + l1 );
		
		Point p1 = new Point(2,3);
		Point p2 = new Point(4,5);
		Line l2 = new Line(p1, p2);
		System.out.println("Line 2: " + l2);
		
		System.out.println("");
		
		//line sub
		LineSub ls1 = new LineSub(1, 2, 3, 4);
		System.out.println("Line Sub 1: " + ls1 );
		Point ps1 = new Point(2,3);
		Point ps2 = new Point(4,5);
		LineSub ls2 = new LineSub(ps1, ps2);
		System.out.println("Line Sub 2: " + ls2);
		
		

	}

}
