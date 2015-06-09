// File: PolindromeCheck.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
import java.util.Scanner;

public class PolindromeCheck {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("Enter a String: ");
			String s = input.nextLine();
			// display results
			if(isPlindrome(s))
				System.out.println("\"" + s + "\" is an alphanumeric palindrome.");
			else {
				System.out.println("\"" + s + "\" is not an alphanumeric palindrome.");
				break;
			}
		}		
	}
	public static boolean isPlindrome(String s) {
		String s1 = filter(s);
		if(s1.length() == 0) return false;
		String s2 = reverse(s1);
		return (s1.equals(s2));
		
	}
	
	public static String filter(String s) {
		StringBuilder buffer = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if(Character.isLetterOrDigit(s.charAt(i)));
			buffer.append(s.charAt(i));
		}
		return buffer.toString();
	}
	public static String reverse(String s) {
		StringBuilder buffer = new StringBuilder(s);
		buffer.reverse();
		return buffer.toString();
	}

}
