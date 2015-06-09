// File: FactorialCalculator.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna

// Fig. 18.3: FactorialCalculator.java
// Recursive factorial method.

public class FactorialCalculator
{
   // recursive method factorial (assumes its parameter is >= 0
   public static long factorial( long number )
   {
      if ( number <= 1 ) // test for base case
         return 1; // base cases: 0! = 1 and 1! = 1
      else // recursion step
         return number * factorial( number - 1 );
   } // end method factorial

   // output factorials for values 0-21
   public static void main( String[] args )
   {
      // calculate the factorials of 0 through 21
      for ( int counter = 0; counter <= 21; counter++ )
         System.out.printf( "%d! = %d\n", counter, factorial( counter ) );
   } // end main
} // end class FactorialCalculator
