// File: ValidateSSN.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;

public class ValidateSSN {

	public static void main(String[] args) {
		List<String> ssns = new ArrayList<String>();
		//Valid SSNs
		ssns.add("123-45-6789"); 
		ssns.add("856-45-6789"); 
		 
		//Invalid SSNs
		ssns.add("000-45-6789"); 
		ssns.add("666-45-6789"); 
		ssns.add("901-45-6789"); 
		ssns.add("85-345-6789");
		ssns.add("856-453-6789");
		ssns.add("856-45-67891");
		ssns.add("856-456789");
		
		String regex = "^(?!000|666)[0-8][0-9]{2}" + "-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$";
		
		Pattern pattern = Pattern.compile(regex);
		 
		for (String number : ssns)
		{
		    Matcher matcher = pattern.matcher(number);
		    System.out.println(number + " is " + (matcher.matches()?"a valid ":"an invalid") + " number");
		    
		}
		
	}

}
