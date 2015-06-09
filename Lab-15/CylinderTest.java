import java.util.Scanner;
//File: CylinderTest.java
//Name: Haris Hanif 
//DVC ID: 1392603
//IDE:  Eclipse Luna

public class CylinderTest {
	public static void main( String[] args ){
		Scanner input = new Scanner( System.in );
		Circle c1 = new Circle();
		System.out.println(c1.toString());
		Cylinder cy = new Cylinder();
		System.out.println(cy.toString());
		Cylinder c2 = new Cylinder(10.0);
		System.out.println(c2.toString());
		Cylinder c3 = new Cylinder(10.0, 2.0);
		System.out.println(c3.toString());

	}
}
