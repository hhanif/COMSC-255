// File: GradeBookTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
public class GradeBookTest {
	public static void main( String[] args )
	{
			GradeBook gradeBook1 = new GradeBook("COMSC-255 Programming with Java", "Gene Khaja"); 
	 		GradeBook gradeBook2 = new GradeBook("COMSC-255 Programming with Java", "Tony Chern");
	 		System.out.printf( "Welcome to the grade book for\n%s!\n", gradeBook1.getCourseName() );
	 		System.out.printf( "This course is presented by:\n%s!\n", gradeBook1.getcourseInstructor() );
		   
		   System.out.printf( "Changing instructor name to:\n%s!\n", gradeBook2.getcourseInstructor() );
		   
		   System.out.printf( "Welcome to the grade book for\n%s!\n", gradeBook2.getCourseName() );
		   System.out.printf( "This course is presented by:\n%s!\n", gradeBook2.getcourseInstructor() );
		   
		
	}
}
