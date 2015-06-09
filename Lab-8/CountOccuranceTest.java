// File: CountOccuranceTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna 
import java.util.Scanner;

public class CountOccuranceTest
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int [] count = new int[100];
		System.out.print("" + "Enter the integers between 1 and 100 (0 to end):");
		while(true) {
			int i = input.nextInt();
			if(i == 0) 
				break;
			count[i - 1]++;
		}
			for(int i = 0; i < 100; i++){
				if (count[i] > 0){
					System.out.println("The number " + (i+1) + " occurs " + count[i] + " times");

				}

				
			}
		
		System.out.print("Done!");

	}
}
