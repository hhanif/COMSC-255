// File: RowSortingTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
import java.util.Arrays; 
import java.util.Scanner ;


public class RowSortingTest {

	public static void main(String[] args) {

	    Scanner input = new Scanner(System.in);
	    final int row = 3;
	    final int column = 3;

	    System.out.print("Enter a 3 by 3 matrix row by row: \n");

	    double[][] array = new double[row][column];   

	    for (int i = 0; i < array.length; i++)

	      for (int j = 0; j < array[0].length; j++)

	        array[i][j] = input.nextDouble();

		System.out.println();
		System.out.println("Sorted Array:");
		printArray(SortRow(array));
		System.out.println();
		System.out.println("Entered Array:");
		printArray(array);

	}

	  public static double[][] SortRow(double[][] m) {
		  	double[][] result = new double[m.length][m[0].length];
		  	
		  	// Copy from m to result
		  	for (int i = 0; i < m.length; i++)
		      for (int j = 0; j < m[0].length; j++)
		        result[i][j] = m[i][j];

		  	// Check the sum of each column
		  	for (int i = 0; i < result.length; i++) 
		  		java.util.Arrays.sort(result[i]);

		  	return result;
		  } 

	public static void printArray(double[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
