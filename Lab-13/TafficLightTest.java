// File: TafficLightTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
enum TrafficLight {
   RED(50, "Stop", "RED"), YELLOW(5, "Changing", "YELLOW"), GREEN(40, "Go", "GREEN");  // Named constants
   
   private final int seconds;      // Private variable
   private final String color;
   private final String meaning;
   
   TrafficLight(int s, String m, String c) {     // Constructor
	   seconds = s;
       color = c;
       meaning = m;
   }
   
   int getSeconds() {              // Getter
      return seconds;
   }
   String getColor() {              // Getter
	      return color;
	   }
   String getMeaning() {              // Getter
	      return meaning;
	   }
}
 
public class TrafficLightTest {
   public static void main(String[] args) {
      for (TrafficLight light : TrafficLight.values()) {
    	  System.out.println("The light starts out as " + light.getColor() + " means " + light.getMeaning());

      }
 	  System.out.println("Showing the whole enum defines:");

      for (TrafficLight light : TrafficLight.values()) {

    	  System.out.println("Light " + light + " means: " + light.getMeaning());
    	  System.out.println("Duration " + light.getSeconds() + " seconds");


      }
   }
}

enum TLight {
	   // Each instance provides its implementation to abstract method
	   RED(30) {
	      public TLight next() {
	    	  System.out.println(" Stop");
	         return GREEN;
	      }
	   },
	   YELLOW(10) {
	      public TLight next() {
	    	  System.out.println("Go");
	         return RED;
	      }
	   },
	   GREEN(30) {
	      public TLight next() {
	    	  System.out.println("Changing");
	         return YELLOW;
	      }
	   };
	 
	   public abstract TLight next(); // An abstract method
	   
	   private final int seconds;     // Private variable
	 
	   TLight(int seconds) {          // Constructor
	      this.seconds = seconds;
	   }
	 
	   int getSeconds() {             // Getter
	      return seconds;
	   }  
	}
	   
