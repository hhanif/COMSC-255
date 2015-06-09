// File: ResizableCircle.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
public class ResizableCircle extends Circle implements Resizable {
	
	public ResizableCircle() {
		super();
		
	}
	public ResizableCircle(double r) {
		super(r);
		
	}
	
	@Override
	public void resize(int percent) {
	System.out.printf("Changing to percent %d", percent);
	System.out.printf(" percent....\n");
	super.radius = (super.radius * (percent - 100) / 100) + super.radius;	
	}
	@Override
	public String toString() {
		return "ResizableCircle [radius=" + radius + ", getRadius()=" + getRadius()
				+ ", getArea()=" + getArea() + ", getPerimeter()="
				+ getPerimeter() + "]";
	}
	
	
}
