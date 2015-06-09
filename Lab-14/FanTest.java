// File: FanTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
public class FanTest {

	//constants ( statics)
	private static int SLOW = 1;
	private static int MEDIUM = 2;
	private static int FAST = 3;
	
	private int speed; //default = SLOW
	private boolean on; //default = FALSE
	private double radius; //default = 5
	private static String color; //default = blue
	
	
	FanTest()
	{
		this(SLOW, false, 5, "blue");
	}
	FanTest(int s, boolean o, double r, String c)
	{
		if (s==1)
			speed=SLOW;
		else if (s==2)
			speed=MEDIUM;
		else
			speed=FAST;
		on=o;
		radius=r;
		color=c;
	}
	
	public String toString()
	{
		if (on == false)
			return ("Fan color: " + this.getColor() + ", Radius: " + this.getRadius() + ". Fan is off.\n");
		else
			return ("The fan is on. Fan speed: " + this.getSpeed() + ", Fan color: " + this.getColor() + ", Radius: " + this.getRadius() + "\n" );
	}
	
	
	
	//getters&setters
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public static String getColor() {
		return color;
	}
	public static void setColor(String color) {
		FanTest.color = color;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FanTest one = new FanTest(3, true, 10.0, "yellow");
		System.out.println("Fan 1 status: " + one.toString());

		FanTest two = new FanTest(2, false, 5.0, "blue");
		
		System.out.println("Fan 2 status: " + two.toString());
		System.out.println("Fan 1 status: " + one.toString());

		
	}

}
