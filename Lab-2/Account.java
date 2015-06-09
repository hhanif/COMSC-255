// File: Account.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
// Fig. 3.13: Account. java
// Account class with a constructor to validate and
// initialize instance variable balance of type double.

public class Account {
	public static void main( String[] args )
	{
	}	
	 private double balance; // instance variable that stores the balance 8
	 // constructor
	 public Account(double initialBalance)
	 {
		 // validate that initialBalance is greater than 0.0;
		// if it is not, balance is initialized to the default value 0.0 if ( initialBalance > 0.0 )
		balance = initialBalance; } 
	 // end Account constructor

	//credit (add) an amount to the account
	 public void credit( double amount )
	 {
		 balance = balance + amount; // add amount to balance
	 } //end method credit
	 
	 public void debit( double amount )
	 {
		 if(balance > amount)
		 balance = balance - amount; // subtract amount to balance
		 else {
		 System.out.print("Debit amount exceeded account balance\n");
		 }
	 } //end method debit
	 
	//return the account balance
	 public double getBalance()
	 {
		 return balance; // gives the value of balance to the calling method
	 } // end method getBalance
	 public void setBalance(double balance) {
		 this.balance = balance;
	 }
} // end class Account
