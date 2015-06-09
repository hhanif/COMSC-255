// File: Date.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
public class Date {
	private int Day;
	private int Month;
	private int Year;

public Date( int d, int m, int y ) // constructor name is class name
{
	Day = d;
	Month = m;
	Year = y;
} // end constructor

public void setDay( int d )
{
   Day = d;
}
public void setMonth( int m )
{
   Month = m;
}
public void setYear( int y )
{
   Year = y;
}
public int getDay()
{
   return Day;
}
public int getMonth()
{
   return Month;
}
public int getYear()
{
   return Year;
}

public void displayDate()
{
   System.out.printf(Month+"/"+Day+"/"+Year);
}

}
