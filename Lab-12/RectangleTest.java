package ArrayListTest;
// File: RectangleTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
import java.util.Scanner;


class Rectangle {
	
private double length;
private double width;

public Rectangle() {
    this(1.0, 1.0);
}
public Rectangle (double l, double w){
    setLength(l);//length = l;
    setWidth(w);width = w;
}
public void setLength(double l){
	if( 0 < l && l < 20.0)
    length = l;
	else {
		throw new IllegalArgumentException("Invalid input exception: length and width must be 0.0 - 20.0");
	}
}
public void setWidth(double w){
	if( 0 < w && w < 20.0)
    width = w;
	else {
		throw new IllegalArgumentException("Invalid input exception: length and width must be 0.0 - 20.0");
	}
}
public double getLength(){
    return length;
}
public double getWidth(){
    return width;
}
public double getArea(){
    return length*width;
}
public double getPerimeter(){
    return (2*length)+(2*width);
}

}

public class RectangleTest {
	public static void main(String[] args) {
	    Rectangle rec1 = new Rectangle();
		int choice;
	    double area, perimeter;     
	    Scanner input = new Scanner (System.in);

	   
	    while (true) {
	    	 System.out.print("Choose an action:\n" + "1. Set Length\n" + "2. Set Width\n" + "Else, Exit\n" + "Choice: ");
	 	    choice = input.nextInt();
	 	    if (choice == 3)
	 	    	break;
	 	    
	    switch(choice){
	        case 1:
	            System.out.print("Enter Length: ");
	            double l = input.nextDouble();
	           try{ 
	        	   rec1.setLength(l);
	           }
	           catch(IllegalArgumentException e) {
	        	   System.out.println("Invalid input exception: length and width must be 0.0 - 20.0");
	        	   break;
	           }
	           
	            System.out.println("Length: "+rec1.getLength());
	            System.out.println("Width: "+ rec1.getWidth());
	            System.out.println("Area: "+rec1.getArea());
	            System.out.println("Perimeter: "+rec1.getPerimeter());
	            break;
	        case 2:
	            System.out.println("Enter Width: ");
	            double w = input.nextDouble();
	            try {
	            rec1.setWidth(w);
	            }
		           catch(IllegalArgumentException e) {
		        	   System.out.println("Invalid input exception: length and width must be 0.0 - 20.0");
		        	   break;
		           }
	            System.out.println("Length: "+ rec1.getLength());
	            System.out.println("Width: "+rec1.getWidth());
	            System.out.println("Area: "+rec1.getArea());
	            System.out.println("Perimeter: "+rec1.getPerimeter());
	            break;
	        default:
	            System.exit(choice);
	    }	
	    }
	}

}
