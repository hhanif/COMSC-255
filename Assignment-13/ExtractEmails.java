// File: ExtractEmails.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExtractEmails {

	public static void main(String[] args) throws IOException {
		 // Simple expression to find a valid e-mail address in a file
        //Pattern pattern = Pattern.compile("^[\\w\\.-]+@([\\w-]+\\.)+[A-Z]{2,4}$");
        // Read file, find valid mail addresses and print result
        
		List<String> emails = new ArrayList<String>();
		emails = readFile ("raw.txt");

       
        int lines = 0;
        int matches = 0;
        
        String regex = "^[\\w\\.-]+@([\\w-]+\\.)+[A-Z]{2,4}$";
		
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		
		for (String email : emails)
		{
			lines++;
			Matcher matcher = pattern.matcher(email);
			
			if (matcher.matches())
			{
				System.out.print("Line: " + lines + ", email: " + email + "\n");
				matches++;
			}
		 
		
		}
        
			// output of summary
	        if (matches == 0) {    
	            System.out.println("No matches in " + lines + " lines");
	        } else {
	            System.out.println("\n" + matches + " matches in " + lines + " lines");
	        }
			
			

        
        
   }
	
	private static List<String> readFile(String fileName) {
		List<String> names = new ArrayList<String>();
		
	       try {
	         File file = new File(fileName);
	         Scanner scanner = new Scanner(file);
	         int i = 0;
	         while (scanner.hasNext()) {
	           //System.out.println(scanner.nextLine());
	        	 names.add(scanner.next());
	        	 i++;
	         }
	         scanner.close();
	       } catch (FileNotFoundException e) {
	         e.printStackTrace();
	       }
	       
		return names;
	     }
}   
   
