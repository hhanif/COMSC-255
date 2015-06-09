// File: IterativeFactorialCalculator.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
// Fig. 18.9: FactorialCalculator.java
// Iterative factorial method.

public class IterativeFactorialCalculator
{
   // recursive declaration of method factorial   
   public static long factorial( long number )
   {
      long result = 1;

      // iterative declaration of method factorial
      for ( long i = number; i >= 1; i-- )
         result *= i;

      return result;
   } // end method factorial

   // output factorials for values 0-10
   public static void main( String[] args )
   {
      // calculate the factorials of 0 through 10
      for ( int counter = 0; counter <= 10; counter++ )
         System.out.printf( "%d! = %d\n", counter, factorial( counter ) );
   } // end main
} // end class FactorialCalculator
