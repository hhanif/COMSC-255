// File: Time2.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
public class Time2 {
private int hour; // 0 - 23
private int minute; // 0 - 59
private int second; // 0 - 59

 // Time2 no-argument constructor:
 // initializes each instance variable to zero
 public Time2()
 { 
	 this( 0, 0, 0 ); // invoke Time2 constructor with three arguments 
 }
// Time2 constructor: hour supplied, minute and second defaulted to 0 
	 public Time2( int h ) {
		 this( h, 0, 0 ); // invoke Time2 constructor with three arguments 
	 	} // end Time2 one-argument constructor
	 
	 public Time2( int h, int m )
	 {
	 this( h, m, 0 ); // invoke Time2 constructor with three arguments 
	 }
	 
	 public Time2( int h, int m, int s ) {
	 setTime( h, m, s ); // invoke setTime to validate time
	 }
	 public Time2( Time2 time )
	 {
	 // invoke Time2 three-argument constructor
	 this( time.getHour() , time.getMinute() , time.getSecond() ); 
	 }
	 public void setTime( int h, int m, int s )
	 {
	 setHour( h ) ; // set the hour 
	 setMinute( m ); // set the minute 
	 setSecond( s ); // set the second
	 }
	 
	 public void setHour( int h ) {
		 if( h>=0&&h<24) hour = h;
		 else
		 throw new IllegalArgumentException( "hour must be 0-23" );
		 } // end method setHour
	 
	 public void setMinute( int m ) {
		 if( m>=0&&m<60) minute = m;
		 else
		 throw new IllegalArgumentException( "minute must be 0-59" );
		 } // end method setMinute
	 public void setSecond( int s ) {
		 if( s>=0&&s<60)
		 second =((s>=0&&s<60)?s : 0);
		 else
			 throw new IllegalArgumentException( "second must be 0-59" ); 
		 } // end method setSecond
	 public int getHour() {
	 return hour;
	 } // end method getHour
	 public int getMinute() {
	 return minute;
	 }
	 public int getSecond() {
	 return second;
	 }
	 public String toUniversalString()
	 {
		 return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond() );
		} // end method toUniversalString
	 public String toString() {
		 return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12: getHour() % 12) , getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );
	 }
}
	 
