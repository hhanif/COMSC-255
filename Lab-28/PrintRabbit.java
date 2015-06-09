// File: PrintRabbit.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
import java.math.BigInteger;
import java.util.Scanner;


public class PrintRabbit {
	static int instance = 0;
	public static int rabbit(int n, int indents) {
		instance++;
		int id = instance;
		StringBuilder buffer = new StringBuilder();
		
		for( int i = 0; i < indents; i++) buffer.append("   ");
		indents++;
		
		
		System.out.printf("%s+Rabbit-%d\n", buffer, id);
		int result;

		if((( n == 1 ) || (n == 2)))
			result = n;
		else 
			result = rabbit(n - 1, indents) + rabbit(n - 2, indents);
		
		System.out.printf("%s+Rabbit-%d\n", buffer, id);
		return result;
	}
	
	   public static void main( String[] args )
	   {
		  Scanner input = new Scanner(System.in);
	      int n;
	      while(true) {
	    	  instance = 0;
	    	  System.out.print("Enter the generation: ");
	    	  n = input.nextInt();
	    	  if( n <= 0) break;
	    	  System.out.printf("Total rabits: %d\n", rabbit(n, 0));
	      }
	      input.close();
	      System.out.print("EXIT");
	   }
}
