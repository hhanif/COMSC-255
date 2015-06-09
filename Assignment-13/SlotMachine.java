// File: SlotMachine.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;


public class SlotMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		File name = new File ("generatedNumbers.txt");

			FileWriter fw;
			try {
				//create the file
				fw = new FileWriter( name.getAbsoluteFile() );
				BufferedWriter bw = new BufferedWriter ( fw);

				//generate 100 random integers
				String line = "";
				for (int i = 0; i < 100; i++)
				{
					Random rn = new Random();
					int tempNumber = rn.nextInt(100);
					line = line + tempNumber + " ";

					//every 10 integers input a line
					if ( (i+1) % 10 == 0)
					{
						bw.write(line + "\n"); //write the line
						line = ""; //reset line to blank
					}
				}
				
				//close file
				bw.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		///filter integers
		Integer [] unsorted = new Integer [100];
		unsorted = readFile("generatedNumbers.txt");
		
		//sorts array
		Arrays.sort(unsorted, new Comparator<Integer> ()
				{
					@Override
					public int compare (Integer x, Integer y)
					{
						return x-y;
					}
				} );
		
		for (int i= 0; i < 100; i++)
		{
			System.out.print( unsorted [i] + " ");
			if ( (i+1) % 10 == 0)
				System.out.println();
		}
		
		System.out.println();
		System.out.println("\nFiltered:");
		//display filtered integers even/even and odd/odd
		for (int i= 0; i < 100; i++)
		{
			String temp = "" + unsorted[i];
			if (  temp.matches("[13579][13579]") || temp.matches("[2468][2468]"))
			{
				System.out.print(temp + " ");
			}
			if ( (i+1) % 10 == 0)
				System.out.println();
		}
		
			
		
	}

	private static Integer [] readFile(String fileName) {
		Integer [] arr = new Integer [100];
		
	       try {
	         File file = new File(fileName);
	         Scanner scanner = new Scanner(file);
	         int i = 0;
	         while (scanner.hasNextInt()) {
	           //System.out.println(scanner.nextLine());
	        	 arr[i] = scanner.nextInt();
	        	 i++;
	         }
	         scanner.close();
	       } catch (FileNotFoundException e) {
	         e.printStackTrace();
	       }
	       
		return arr;
	     }
}

