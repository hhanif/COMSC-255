import java.util.Scanner;

// File: AddMethodTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna 

public class AddMethodTest {

	public static void main( String[] args ) {
		Scanner in = new Scanner(System.in);
		
		int x1;
		int x2;
		System.out.print("Enter 2 integers:");
		x1 = in.nextInt();
		x2 = in.nextInt();
		int result = addMethod(x1, x2);
		System.out.printf("%d + %d added up: %d\n", x1, x2, result);
		
		
		String s1;
		System.out.print("Enter string 1:");
		s1 = in.next();
		System.out.print("Enter integer 1:");
		x2 = in.nextInt();
		String result2 = addMethod(s1, x2);
		System.out.printf("%s + %d added up: %s\n", s1, x2, result2);
		
		
		String s2;
		System.out.println( "Enter string 1:" ); // prompt for user input 
		s1 = in.next();
		System.out.println( "Enter string 2:" ); // prompt for user input 
		s2 = in.next();
		String result3 = addMethod(s1, s2);
		System.out.printf("%s and %s added up: %s", s1, s2, result3);

		
	}
	public static int addMethod(int x1, int x2) {
		int add;
		add = x1 + x2;
		return add;
	}
	public static String addMethod(String s1, int x2) {
		return s1 + x2;
	}
	public static String addMethod(String s1, String s2) {
		return s1 + s2;
	}
}
