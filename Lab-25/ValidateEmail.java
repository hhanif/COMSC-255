// File: ValidateEmail.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {

	public static void main(String[] args) {
		List<String> emails = new ArrayList<String>();

		//Valid Emails
		emails.add("abc@xyz.net"); 
		emails.add("ab.c@tx.gov"); 
		emails.add("a_bling@bling.jp");
		emails.add("1_3@xyz.net"); 
		emails.add("123@x.y.net"); 

		//Invalid emailsls
		emails.add("1@3@x.y.z.net"); 
		emails.add("abc@123.a"); 
		emails.add("d-e@zzz.zzzzz"); 
		emails.add("g+h@us.gov"); 
		emails.add("d-e@a b.zzzzz");
		
		String regex = "^[\\w\\.-]+@([\\w-]+\\.)+[A-Z]{2,4}$";
		
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		 
		for (String email : emails)
		{
		    Matcher matcher = pattern.matcher(email);
		    System.out.println(email + " is " + (matcher.matches()?"a valid ":"an invalid") + " email");
		    
		}
	}

}
