// File: Addition.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
import java. util .Scanner; // program uses class Scanner
public class Addition {

	public static void main( String[] args ) {
		Scanner input = new Scanner( System. in );
		int number1;
		int number2;
		int sum;
		int product;
		int difference;
		int quotient;
		System.out.printf("Enter first integer:");
		number1 = input.nextInt();
		System.out.printf("Enter second integer:");
		number2 = input.nextInt();
        
		sum = number1 + number2;
		System.out.printf("Sum is %d\n", sum);
        
		product = number1 * number2;
		System.out.printf("Product is %d\n", product);
        
		difference = number2 - number1;
		System.out.printf("Difference is %d\n", difference);
        
		quotient = number2 / number1;
		System.out.printf("Quotient is %d\n", quotient);

	}
}
