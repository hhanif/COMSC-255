// File: EmployeeTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
import java.util.Scanner;

public class EmployeeTest
{
	public static void main( String args[] )
	{
		Employee employee1 = new Employee(null, null, 0);
		Employee employee2 = new Employee(null, null, 0);
 
		Scanner input = new Scanner( System.in );
		String First;
		String Last;
		double Salary;
 
		System.out.print( "Enter the first name of the first employee: " );
		First = input.next();
		employee1.setFirstName( First );
 
		System.out.print( "Enter the last name of the first employee: " );
		Last = input.next();
		employee1.setLastName( Last );
 
		System.out.print( "Enter the first employee's monthly salary: " );
		Salary = input.nextDouble();
		employee1.setMonthlySalary( Salary );
 
		System.out.print( "Enter the first name of the second employee: " );
		First = input.next();
		employee2.setFirstName( First );
 
		System.out.print( "Enter the last name of the second employee: " );
		Last = input.next();
		employee2.setLastName( Last );
 
		System.out.print( "Enter the second employee's monthly salary: " );
		Salary = input.nextDouble();
		employee2.setMonthlySalary( Salary );
 
 
		System.out.println( "Now displaying employees' full names and annual salary.\n");
		System.out.println( employee1.getFirstName() + " " + employee1.getLastName() + "	 " + employee1.getMonthlySalary() * 12 + "\n" );
		System.out.println( employee2.getFirstName() + " " + employee2.getLastName() + "	 " + employee2.getMonthlySalary() * 12 + "\n" );
 
		double newsalary = employee1.getMonthlySalary()*0.1+employee1.getMonthlySalary();
		employee1.setMonthlySalary(newsalary);
		double newsalarytwo = employee2.getMonthlySalary()*0.1+employee2.getMonthlySalary();
		employee2.setMonthlySalary(newsalarytwo);
		
		System.out.println( "Now applying a 10% raise to each employee and displaying the updated information.\n");
		System.out.println( employee1.getFirstName() + " " + employee1.getLastName() + "	 " + employee1.getMonthlySalary() * 12 + "\n" );
		employee1.getMonthlySalary();
		System.out.println( employee2.getFirstName() +" " + employee2.getLastName() + "	 " + employee2.getMonthlySalary() * 12 + "\n" );
		employee2.getMonthlySalary();
		
		
 
	}
}
