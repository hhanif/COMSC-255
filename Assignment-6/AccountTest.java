// File: AccountTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
import java.util.Date;

public class AccountTest {

public static void main(String[] args) {
    // TODO Auto-generated method stub

Account account1 = new Account(1122, 20000, .045);
account1.withdraw(2500);
account1.deposit(3000);
java.util.Date dateCreated = new java.util.Date();
System.out.println ("Account number: "+ +account1.getId());
System.out.println ("The account balance is: $ " + +account1.getBalance());
System.out.println("The Annual Interest Rate is: $ " + account1.getAnnualInterestRate());

System.out.println ("The monthly interest earned is: $ " + +account1.getBalance() *account1.getMonthlyInterestRate());
java.util.Date dateCreated1 = new java.util.Date();
System.out.println("Date Created:" + dateCreated1);
System.out.println("Process completed.");
}
}
