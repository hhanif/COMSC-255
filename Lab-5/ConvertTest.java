// File: ConvertTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
import java.util.Scanner;
import java.util.*;

public class ConvertTest {
	
	  public static double Celsius( double fahrenheit )
	   {
		  double Celsius =  ( 5.0 / 9.0 * (fahrenheit - 32 ) );
		  return Celsius;
		  
	   }

	   public static double Fahrenheit( double celsius )
	   {
	      double Fahrenheit = ( 9.0 / 5.0 *  celsius + 32  );  
	      return Fahrenheit;
	   }
	   
	public static void main(String[] args) 
	{
		double celsius;
		double fahrenheit;
		Scanner in = new Scanner(System.in);

	// menu
	System.out.println("Select one of the option");
	System.out.println("\t 1. Fahrenheit to Celsius");
	System.out.println("\t 2. Celsius to Fahrenheit");
	System.out.println("\t 3. Exit");
	System.out.println("\nEnter your choice : ");

	//take the choice from the user
	int choice = in.nextInt();

	System.out.println();

	if(choice == 1)
	{
	System.out.print("Enter temperatue in Fahrenheit : ");
	fahrenheit = in.nextInt();	//take the input of the fahrenheit
	System.out.println("\nTemperatue in Celsius = " + Celsius(fahrenheit));	//call the celsius method
	}
	else if(choice == 2)	
	{
	System.out.print("Enter temperatue in Celsius : ");
	celsius = in.nextInt();	//take the input of the celsius
	System.out.println("Temperatue in Fahrenheit = " + Fahrenheit(celsius));	//call the fahrenheit method
	}
	else if(choice == 3)
		System.out.print("You have now exitted the program");

	}
}
