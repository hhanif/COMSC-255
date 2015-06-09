// File: DateTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
import java.util.Scanner;
public class DateTest {
	 public static void main(String [] args){
		 Scanner S = new Scanner(System.in);

		 System.out.print("Enter day: ");
		 int Day = S.nextInt();

		 System.out.print("Enter month: ");
		 int Month = S.nextInt();
		 
		 System.out.print("Enter year: ");
		 int Year = S.nextInt();
		 
		 Date date = new Date(20, 01, 2015);
		 Date datetwo = new Date(Day, Month, Year);

		 System.out.print("The initial date is: ");
		 date.displayDate();

		 System.out.print("\nDate with new value is: ");
		 datetwo.displayDate();
		 
		 
	 }
}
