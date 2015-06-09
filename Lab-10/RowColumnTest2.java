// File: RowColumnTest2.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RowColumnTest2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		while (true)
		{
			System.out.printf("Enter array size [Enter 0 to exit]: ");
			int n = input.nextInt();
			if (n == 0)
				break;
			int [] [] matrix = generateRandomMatrix(n);
			System.out.printf("The largest row index is %d\nThe largest column index is %d\n", largestRowIndex(matrix, n), largestColumnIndex(matrix, n));


		}
		

	}
	
	
	public static int [] [] generateRandomMatrix(int n)
	{
		Random randomNumbers = new Random();
		int [] [] matrix = new int [n] [n];
		
		for (int i =0; i < n; i++) //vertical
		{
			for (int j=0; j < n; j++)//horizontal
			{
				int r = randomNumbers.nextInt(2); //0-1				
				matrix[i][j] = r;
				System.out.printf("%d ", r);
			}
			System.out.printf("\n");
		}
		return matrix;
	}
	
	public static int largestRowIndex(int [] [] m, int n)
	{
		int index=0, largest = 0, current = 0;
		ArrayList list = new ArrayList();
		
		
		for (int i = 0; i < n; i++)
		{
			current=0;
			for (int j = 0; j < n; j++)
			{
				current += m[i][j]; //add up horizontal rows
				//list.add(m[i][j]);
			}
			if (current > largest)
			{
				index=i;
				largest = current;
			}
		}
		return index;
	}
	
	public static int largestColumnIndex(int [] [] m, int n)
	{
		int index=0, largest = 0, current = 0;
		
		for (int i=0; i < n; i++)
		{
			current=0;
			for (int j = 0; j < n; j++) 
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
