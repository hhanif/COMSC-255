// File: Account.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
import java.util.*;
public class Account
{
private int id;
private String name;
private double balance;
private static double annualInterestRate;
private Date dateCreated;
private ArrayList transactions = new ArrayList();
//dateCreated = new Date();
public Account(String name, int id, double balance)
{
this.id = id;
this.name = name;
this.balance = balance;
}
public Account()
{
this.name = "";
this.balance = 0;
dateCreated = new java.util.Date();
}
public int getId()
{
return this.id;
}
public double getBalance()
{
return balance;
}
public ArrayList getTransaction()
{
return transactions;
}
public String getName()
{
return name;
}
public static double getAnnualInterestRate()
{
return annualInterestRate;
}
public void setId(int id)
{
this.id = id;
}
public void setBalance (double balance)
{
this.balance = balance;
}
public static void setAnnualInterestRate(double annualInterestRate)
{
Account.annualInterestRate = annualInterestRate;
}
public double getMonthlyInterest()
{
return balance * (annualInterestRate / 1200);
}
public Date getDateCreated()
{
return dateCreated;
}
public void withdraw(double amount)
{
balance = balance - amount;
transactions.add(new Transaction('w', amount, balance, ""));
}
public void deposit(double amount)
{
balance += amount;
transactions.add(new Transaction('D', amount, balance, ""));
}
}
