// File: CreditInquiryTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
package com.deitel.ch17;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.deitel.ch17.AccountRecord;
//Fig. 17.13: CreditInquiryTest.java
//This program tests class CreditInquiry.

public class CreditInquiryTest
{  
public static void main( String[] args )
{
   CreditInquiry application = new CreditInquiry();
   application.processRequests();
} // end main
} // end class CreditInquiryTest

class CreditInquiry
{
   private MenuOption accountType;
   private Scanner input;
   private final static MenuOption[] choices = { MenuOption.ZERO_BALANCE,
      MenuOption.CREDIT_BALANCE, MenuOption.DEBIT_BALANCE,
      MenuOption.END };

   // read records from file and display only records of appropriate type
   private void readRecords()
   {
      // object to store data that will be written to file
      AccountRecord record = new AccountRecord(); 

      try // read records
      {     
         // open file to read from beginning
         input = new Scanner( new File( "clients.txt" ) );

         while ( input.hasNext() ) // input the values from the file
         {
            record.setAccount( input.nextInt() ); // read account number
            record.setFirstName( input.next() ); // read first name
            record.setLastName( input.next() ); // read last name
            record.setBalance( input.nextDouble() ); // read balance

            // if proper acount type, display record
            if ( shouldDisplay( record.getBalance() ) )
               System.out.printf( "%-10d%-12s%-12s%10.2f\n",
                  record.getAccount(), record.getFirstName(),
                  record.getLastName(), record.getBalance() );
         } // end while
      } // end try
      catch ( NoSuchElementException elementException )
      {
         System.err.println( "File improperly formed." );
         input.close();
         System.exit( 1 );
      } // end catch
      catch ( IllegalStateException stateException )
      {
         System.err.println( "Error reading from file." );
         System.exit( 1 );
      } // end catch
      catch ( FileNotFoundException fileNotFoundException )
      {
         System.err.println( "File cannot be found." );
         System.exit( 1 );
      } // end catch
      finally
      {
         if ( input != null )
            input.close(); // close the Scanner and the file
      } // end finally
   } // end method readRecords

   // use record type to determine if record should be displayed
   private boolean shouldDisplay( double balance )
   {
      if ( ( accountType == MenuOption.CREDIT_BALANCE )
         && ( balance < 0 ) )
         return true;

      else if ( ( accountType == MenuOption.DEBIT_BALANCE )
         && ( balance > 0 ) )
         return true;

      else if ( ( accountType == MenuOption.ZERO_BALANCE )
         && ( balance == 0 ) )
         return true;

      return false;
   } // end method shouldDisplay

   // obtain request from user
   private MenuOption getRequest()
   {
      Scanner textIn = new Scanner( System.in );
      int request = 1;

      // display request options
      System.out.printf( "\n%s\n%s\n%s\n%s\n%s\n",
         "Enter request", " 1 - List accounts with zero balances",
         " 2 - List accounts with credit balances",
         " 3 - List accounts with debit balances", " 4 - End of run" );

      try // attempt to input menu choice
      {
         do // input user request
         {
            System.out.print( "\n? " );
            request = textIn.nextInt();
         } while ( ( request < 1 ) || ( request > 4 ) );
      } // end try
      catch ( NoSuchElementException elementException )
      {
         System.err.println( "Invalid input." );
         System.exit( 1 );
      } // end catch

      return choices[ request - 1 ]; // return enum value for option
   } // end method getRequest

   public void processRequests()
   {
      // get user's request (e.g., zero, credit or debit balance)
      accountType = getRequest();

      while ( accountType != MenuOption.END )
      {
         switch ( accountType )
         {
            case ZERO_BALANCE:
               System.out.println( "\nAccounts with zero balances:\n" );
               break;
            case CREDIT_BALANCE:
               System.out.println( "\nAccounts with credit balances:\n" );
               break;
            case DEBIT_BALANCE:
               System.out.println( "\nAccounts with debit balances:\n" );
               break;
         } // end switch

         readRecords();
         accountType = getRequest();
      } // end while
   } // end method processRequests
} // end class CreditInquiry

//Fig. 17.11: MenuOption.java
//Enumeration for the credit-inquiry program's options.

 enum MenuOption
{
// declare contents of enum type
ZERO_BALANCE( 1 ),
CREDIT_BALANCE( 2 ),
DEBIT_BALANCE( 3 ),
END( 4 );

private final int value; // current menu option

MenuOption( int valueOption )
{
   value = valueOption;
} // end MenuOptions enum constructor

public int getValue()
{
   return value;
} // end method getValue
} // end enum MenuOption
