// File: RowColumnTest.java
// Name: Haris Hanif 
// DVC ID: 1392603
// IDE:  Eclipse Luna

import java.util.Random;
import java.util.Scanner;

public class RowColumnTest {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		while (true)
		{
			System.out.printf("Enter any integer greater than 0 to run [Enter 0 to exit]: ");
			if (input.nextInt() == 0)
				break;
			int [] [] matrix = generateRandomMatrix();
			System.out.printf("The largest row index is %d\nThe largest column index is %d\n", largestRowIndex(matrix), largestColumnIndex(matrix));


		}
		

	}
	
	
	public static int [] [] generateRandomMatrix()
	{
		Random randomNumbers = new Random();
		int [] [] matrix = new int [4] [4];
		
		for (int i =0; i < 4; i++) //vertical
		{
			for (int j=0; j < 4; j++)//horizontal
			{
				int r = randomNumbers.nextInt(2); //0-1				
				matrix[i][j] = r;
				System.out.printf("%d ", r);
			}
			System.out.printf("\n");
		}
		return matrix;
	}
	
	public static int largestRowIndex(int [] [] m)
	{
		int index=0, largest = 0, current = 0;
		
		for (int i = 0; i < 4; i++)
		{
			current=0;
			for (int j = 0; j < 4; j++)
			{
				current += m[i][j]; //add up horizontal rows
			}
			if (current > largest)
			{
				index=i;
				largest = current;
			}
		}
		return index;
	}
	
	public static int largestColumnIndex(int [] [] m)
	{
		int index=0, largest = 0, current = 0;
		
		for (int i=0; i < 4; i++)
		{
			current=0;
			for (int j = 0; j < 4; j++) 
			{
				//add up vertical columns
				current += m[j][i];
			}
			if (current > largest)
			{
				index=i;
				largest = current;
			}
		}

		return index;
	}

}
