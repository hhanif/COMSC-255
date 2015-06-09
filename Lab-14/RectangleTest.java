// File: RectangleTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
import java.util.Scanner;


class Rectangle1 {
	double width;
	double length;
	
	Rectangle1() { width = 1.0; length = 1.0; }
	Rectangle1(int w, int l) { setWidth(w); setLength(l); }
	
	public void setWidth(double w) { width = w; }
	public void setLength(double l) { length = l; }
	public double getWidth() { return width; }
	public double getLength() { return length; }
	
	public String toString() {
		return String.format("Width: %.2f Length: %.2f\n", width, length);
	}
}
class Rectangle2 {
	double width;
	double length;
	
	public Rectangle2() { width = 2.0; length = 2.0; }
	public Rectangle2(int w, int l) { setWidth(w); setLength(l); }
	
	public void setWidth(double w) { width = w; }
	public void setLength(double l) { length = l; }
	public double getWidth() { return width; }
	public double getLength() { return length; }
	
	public String toString() {
		return String.format("Width: %.2f Length: %.2f\n", width, length);
	}
}
class Rectangle3 {
	double width;
	double length;
	
	Rectangle3() { width = 3.0; length = 3.0; }
	Rectangle3(int w, int l) { setWidth(w); setLength(l); }
	
	public void setWidth(double w) { width = w; }
	public void setLength(double l) { length = l; }
	public double getWidth() { return width; }
	public double getLength() { return length; }
	
	public String toString() {
		return String.format("Width: %.2f Length: %.2f\n", width, length);
	}
}

public class RectangleTest {
	public static void main(String[] args) {
	    Rectangle1 rec1 = new Rectangle1();
	    System.out.printf("rec1: %s\n", rec1);
	    Rectangle2 rec2 = new Rectangle2();
	    System.out.printf("rec2: %s\n", rec2);
	    Rectangle3 rec3 = new Rectangle3();
	    System.out.printf("rec3: %s\n", rec3);
	    
	}

}
