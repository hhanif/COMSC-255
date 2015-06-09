// File: Date.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
// Fig. 8.7: Date.java
 // Date class declaration. 3
 public class Date{
	 private int month;
	 private int day;
	 private int year;
 

private static final int[] daysPerMonth = // days in each month
   { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
// constructor: call checkMonth to confirm proper value for month;
// call checkDay to confirm proper value for day
public Date( int theMonth, int theDay, int theYear )
{
   month = checkMonth( theMonth ); // validate month
   year = theYear; // could validate year
   day = checkDay( theDay ); // validate day
   System.out.printf("Date object constructor for date %s\n", this );
} // end Date constructor
// utility method to confirm proper month value
private int checkMonth( int testMonth )
{
   if ( testMonth > 0 && testMonth <= 12 ) // validate month
      return testMonth;
   else // month is invalid
	  throw new IllegalArgumentException( "month must be 1-12" );
}
private int checkDay( int testDay )
 {
	if ( testDay > 0 && testDay <= daysPerMonth[ month ] )
		return testDay;
	if (month==2 && testDay==29 && (year % 400==0|| (year % 4== 0 && year % 100!=0)))
		return testDay;

	throw new IllegalArgumentException( "day out-of-range for the specified month and year.\n" );
 }
public String toString()
 {
 return String.format( "%d/%d/%d", month, day, year );
 } // end method toString
}
