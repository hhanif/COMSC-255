// File: EmployeeTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
public class EmployeeTest {
	public static void main( String[] args ) {
		
		
		
			  Date birth = new Date( 4, 4, 1995 );
		      Date hire = new Date( 1, 1, 2015 );
		      Employee employee = new Employee( "April", "Worker", birth, hire );
		      System.out.println( employee );
		      
		      birth = new Date( 6, 6, 1994 );
		      hire = new Date( 2, 2, 2015 );
			  employee = new Employee( "June", "Manager", birth, hire );
		      System.out.println( employee );
		      
				try {
					//what you're trying to do
				      birth = new Date( 8, 88, 1993 );

				}
				catch (IllegalArgumentException e)
				{
					//what to do if there is an error thrown 
					System.out.printf( e.getMessage() );
				}
				
		      birth = new Date( 7, 7, 1990 );
		      hire = new Date( 7, 1, 2013 );
			  employee = new Employee( "Julius", "Founder", birth, hire );
		      System.out.println( employee );
		   } // end main
}
