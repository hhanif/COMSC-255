// File: GradeBook.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna

public class GradeBook {	
	private String courseName; // course name for this GradeBook
	private String courseInstructor;
	//constructor initializes courseName with String argument
	public GradeBook( String name, String nametwo ) // constructor name is class name
	{
	courseName = name; // initializes courseName
	courseInstructor = nametwo;
	} // end constructor

	//method to set the course name
	public void setCourseName( String name )
	{
	   courseName = name; // store the course name
	} // end method setCourseName
	// method to retrieve the course name
	//method to set the courseInstructor
	public void setcourseInstructor( String nametwo )
	{
		courseInstructor = nametwo; // store the courseInstructor
	} // end method setcourseInstructor
	// method to retrieve the course Instructor
	public String getCourseName()
	{
	   return courseName;
	} // end method getCourseName
	
	public String getcourseInstructor()
	{
	   return courseInstructor;
	} // end method getcourseInstructor

	// display a welcome message to the GradeBook user
	public void displayMessage()
	{
	   // this statement calls getCourseName to get the
	   // name of the course this GradeBook represents
	   System.out.printf( "Welcome to the grade book for\n%s!\n", getCourseName() );
	   System.out.printf( "This course is presented by:\n%s!\n", getcourseInstructor() );
	} // end method displayMessage
	} // end class GradeBook
