// File: CountUpperCases.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
import java.util.Scanner;

public class CountUpperCases {
	public static void main(String[] args) { 
		String s = args[0]; 
		int total = 0; 
		for (int i = 0; i < args.length; i++) { 
			for (int j = 0; j < args[i].length(); j++) { 
			if ((s.charAt(j) >= 'A') && (s.charAt(j) <= 'Z')) { 
			total++; 
			} 
			}
			System.out.println("The total number of uppercase letters is " + total); 

		}

}
}
