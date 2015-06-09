import java.util.Scanner;

// File: CreditCardPreTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
public class CreditCardPreTest {
	public static void main( String[] args ) {
		Scanner in = new Scanner(System.in);
		while(true) {
			long number;
			System.out.print("Enter a credit card (13-16 digit) number as a long integer (0 to exit):");
			number = in.nextLong();
			if(number == 0) {
				break;
			}
			if(String.valueOf(number).length() > 16 || String.valueOf(number).length() < 13)
				System.out.print("invalid length\n");
			else
				System.out.print("valid length\n");
			
				
				int t = (int) number;
				int first = firstDigit(t);
				
			if(first != 4 || first != 5 || first !=6)
				System.out.print("invalid card type\n");
				else
					System.out.print("valid card type\n");

		}
		System.out.print("exit!");

	}
	public static int firstDigit(int n) {
		while (n < -9 || 9 < n) 
			n /= 10;
		return Math.abs(n);
		}
	
}
