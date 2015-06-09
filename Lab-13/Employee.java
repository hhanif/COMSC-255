// File: Employee.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
public class Employee {
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Date hireDate;
	public Employee( String first, String last, Date dateOfBirth, Date dateOfHire )
			 {
			 firstName = first;
			 lastName = last;
			 birthDate = dateOfBirth;
			 hireDate = dateOfHire;
			 } // end Employee constructor
			
			 // convert Employee to String format
			 public String toString()
			 {
			 return String.format( "%s, %s Hired: %s Birthday: %s", lastName, firstName, hireDate, birthDate );
			 } // end method toString
}
