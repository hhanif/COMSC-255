// File: TossCoinTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna 
import java.util.*;
 
public class TossCoinTest
{

	public static void main(String[] args)
	
	    {
	
	        Scanner input = new Scanner( System.in );
	
	        Random randomNumbers = new Random();
	        int heads = 0;
	        int tails = 0;
	        int choice;
	        int toss;
	        
	        while(true) {
	        System.out.println("1. Coin Toss");
	        System.out.println("2. Exit:");
	        System.out.println("Your Choice: ");

	
	        choice = input.nextInt();
	        if(choice == 2)
	        {
	        	System.out.printf("Thanks for using");
	        	return;
	        }
	    
	            if (choice == 1)
	            {
	            	toss = flip();
	                if(toss == 0)
	                    heads++;
	
	            	else if(toss ==1)
	                    tails++;
	
	                System.out.printf( "Heads: %d. Tails: %d\n", heads, tails );
	            }
	
	       
	
	    }
	    }
	public static int flip() {
        Random randomNumbers = new Random();
        int t;
         t = randomNumbers.nextInt(2);
        return t;

	}


}
