// File: QuickSortTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna

//Exercise 19.10 Solution: QuickSort
//Class that creates an integer array filled with random
//values and can sort that array using the quicksort algorithm

import java.util.Random;

class QuickSort
{
	private int[] data; // array of values
	private static Random generator = new Random();

	// create array of given size and fill with random integers
	public QuickSort( int size )
	{
		data = new int[ size ]; // create space for array

		// fill array with random ints in range 10-99
		/*for ( int i = 0; i < size; i++ )
			data[ i ] = 10 + generator.nextInt( 90 );*/
		data[0] = 30; data[1] = 60; data[2]	= 10; data[3] = 40;
		data[4] = 65; data[5] = 20; data[6] = 20; data[7] = 35;
		data[8] = 70; data[9] = 90; data[10] = 80;
	} // end QuickSort constructor

	// call recursive method quicksortHelper
	public void quickSortHelper()
	{
		quickSortHelper( 0, data.length - 1 );		
	} // end method sort

	// recursive method to sort array using quicksort
	private void quickSortHelper( int left, int right )
	{
		System.out.println( "pivot:   " + subarray( left, right ) );
		int pivot = partition( left, right );
		System.out.println( "split:   " + subarray( left, right ) );
		if ( left < pivot - 1 ) // if more than one element on left
			quickSortHelper( left, pivot - 1 ); // sort left side

		if ( pivot + 1 < right ) // if more than one element on right
			quickSortHelper( pivot + 1, right ); // sort right side
		System.out.println( "merge:   " + subarray( left, right ) );
	} // end method quickSortHelper

	// partition the given range and return final index of pivot
	private int partition( int left, int right )
	{
		int pivot = left; // index of pivot element

		// loop until two edges meet
		while ( true )
		{
			// search for data to right of pivot greater than pivot
			while ( data[ right ] >= data[ pivot ] )
			{
				if ( right == pivot )
					return pivot; // partitioning completed

				--right; // move left one element
			} // end while

			swap( pivot, right ); // move right element into correct location
System.out.println( "pRswap:  " + subarray( left, right ) );
			pivot = right--; // update pivot location and move right edge left

			while ( data[ left ] <= data[ pivot ] )
			{
				if ( left == pivot )
					return pivot; // partitioning completed

				++left; // move right one element
			} // end while

			swap( pivot, left ); // move left element into correct location
System.out.println( "pLswap:  " + subarray( left, right ) );
			pivot = left++; // update pivot location and move left edge right
		} // end while
	} // end method partition

	// helper method to swap values in two elements
	private void swap( int first, int second )
	{
		int temporary = data[ first ]; // store first in temporary
		data[ first ] = data[ second ]; // replace first with second
		data[ second ] = temporary; // put temporary in second
	} // end method swap

	// method to output certain values in array
	public String subarray( int low, int high )
	{
		StringBuilder temporary = new StringBuilder();

		// output spaces for alignment
		for ( int i = 0; i < low; i++ )
			temporary.append( "   " );

		// output elements left in array
		for ( int i = low; i <= high; i++ )
			temporary.append( " " + data[ i ] );

		return temporary.toString();
	} // end method subarray

	// method to output values in array
	@Override
	public String toString()
	{
		return subarray( 0, data.length - 1 );
	} // end method toString 
} // end class QuickSort

public class QuickSortTest
{
	public static void main( String[] args )
	{
		// create object to perform selection sort
		QuickSort sortArray = new QuickSort( 11 );
		
		System.out.print( "Before:  " );
		System.out.println( sortArray ); // print unsorted array

		sortArray.quickSortHelper(); // sort array

		System.out.print( "After:   " );
		System.out.println( sortArray ); // print sorted array
	} // end main
} // end class QuickSortTest
