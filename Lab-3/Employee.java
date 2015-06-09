// File: Employee.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
public class Employee {
	private String FirstName;
	private String LastName;
	private double MonthlySalary;

public Employee( String First, String Last, double Salary ) // constructor name is class name
{
	FirstName = First;
	LastName = Last;
	MonthlySalary = Salary;
} // end constructor

public void setFirstName( String First )
{
   FirstName = First;
}

public void setLastName( String Last )
{
	LastName = Last;
}

public void setMonthlySalary( Double Salary )
{
	MonthlySalary = Salary;
}

public String getFirstName()
{
   return FirstName;
}

public String getLastName()
{
   return LastName;
}

public double getMonthlySalary()
{
   if(MonthlySalary >= 0)
	return MonthlySalary;
   else
	   return 0;
}

}
