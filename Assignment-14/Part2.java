// File: Part2.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna

import java.awt.BorderLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

import java.net.*;
import java.io.*;

@SuppressWarnings("unused")
class Nation {
	private String name;
    private int gdp;
    private int population;
    private int ppp;

    public Nation(String name, int gdp, int population) {
        this.name = name;
        this.gdp = gdp;
        this.population = population;
        this.ppp = 1000*gdp/population;
    }

    
    //getters & setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getGdp() {
		return gdp;
	}

	public void setGdp(int gdp) {
		this.gdp = gdp;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getPpp() {
		return ppp;
	}
	public void setPpp(int ppp) {
		this.ppp = ppp;
	}



	@Override
	public String toString() {
		return "Nation [name=" + name + ", gdp=" + gdp + ", population="
				+ population + ", ppp=" + ppp + "]";
	}
	
	//define comparators for sort()
	public static class CompName implements Comparator<Nation>
	{
		@Override
		public int compare(Nation c1, Nation c2)
		{
			return (c1.name.compareToIgnoreCase(c2.name));
		}
		
	}
	public static class CompGdp implements Comparator<Nation>
	{
		@Override
		public int compare(Nation c1, Nation c2)
		{
			return (c1.gdp> c2.gdp ? -1 : (c1.gdp == c2.gdp ? 0 : 1));
		}
	}
	public static class CompPopulation implements Comparator<Nation>
	{
		@Override
		public int compare(Nation c1, Nation c2)
		{
			return (c1.population> c2.population ? -1 : (c1.population == c2.population ? 0 : 1));
		}
	}
	public static class CompPPP implements Comparator<Nation>
	{
		@Override
		public int compare(Nation c1, Nation c2)
		{
			return (c1.ppp> c2.ppp ? -1 : (c1.ppp == c2.ppp ? 0 : 1));
		}
	}
    
}
public class Part2 {

	public static void main(String[] args) throws Exception {

		///for line input
		ArrayList<String> lines = new ArrayList<String>();
		ArrayList<Nation> nations = new ArrayList<Nation>();
		
		
		
		////input lines
		   URL oracle = new URL("https://api.thingspeak.com/apps/thinghttp/send_request?"
					   		+ "api_key=9XAH2EW6JT2DOW1V");
		   BufferedReader in = new BufferedReader(
		   new InputStreamReader(oracle.openStream()));

		   String inputLine;
		   while ((inputLine = in.readLine()) != null)
		   {
		       //System.out.println(inputLine); //output each line
			   lines.add(inputLine);
			   String [] filtered = inputLine.split(",");
			   
			   
			   if (filtered.length == 3) //to ignore the first and last line
			   {
				   //for ( int i = 0; i < filtered.length; i++)
			       //{
			    //	   System.out.printf(filtered[i] + " ");
			      // }
				   
				   Nation temp = new Nation(filtered[0], Integer.valueOf(filtered[1]), Integer.valueOf(filtered[2]));
				   nations.add(temp);
			   }
			   
		       
		   }
		   in.close();
		   
		   //remove the first and last lines. they're just empty code
		   lines.remove(0);
		   lines.remove(lines.size() - 1);
		   
		   //time for filtering out 
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   ////print out sorted
		   ///by name
		   System.out.println("Number of records: " + nations.size());
		   System.out.println("Number of nations: " + nations.size());
		   System.out.println();
		   System.out.println( "----------Sorted by Name----------");
	        Collections.sort(nations, new Nation.CompName() );
			for (Nation c : nations)
				System.out.println (c.toString());
			
			 System.out.println( "----------Sorted by GDP----------");
			Collections.sort(nations, new Nation.CompGdp() );
			for (Nation c : nations)
				System.out.println (c.toString());
			System.out.println();System.out.println();
			System.out.println( "----------Sorted by Population----------");
			Collections.sort(nations, new Nation.CompPopulation() );
			for (Nation c : nations)
				System.out.println (c.toString());
			System.out.println();System.out.println();
			System.out.println( "----------Sorted by PPP----------");
			Collections.sort(nations, new Nation.CompPPP() );
			for (Nation c : nations)
				System.out.println (c.toString());
			System.out.println();System.out.println();
			

			System.out.println( "\n----------Sorted by REVERSE Name----------");
			Collections.sort(nations, Collections.reverseOrder(new Nation.CompName()));
			for (Nation c : nations)
				System.out.println (c.toString());
			System.out.println();System.out.println();
			System.out.println( "----------Sorted by REVERSE GDP----------");
			Collections.sort(nations, Collections.reverseOrder(new Nation.CompGdp()));
			for (Nation c : nations)
				System.out.println (c.toString());
			System.out.println();System.out.println();
			System.out.println( "----------Sorted by REVERSE Population----------");
			Collections.sort(nations, Collections.reverseOrder(new Nation.CompPopulation()));
			for (Nation c : nations)
				System.out.println (c.toString());
			System.out.println();System.out.println();
			System.out.println( "----------Sorted by REVERSE PPP----------");
			Collections.sort(nations, Collections.reverseOrder(new Nation.CompPPP()));
			for (Nation c : nations)
				System.out.println (c.toString());
			System.out.println();System.out.println();
	}

	/*
	public static String[] split(String s, String regex) {
		String[] tokens = s.split(regex); // split without delimiters
		// newTokens will include delimiters
		String[] newTokens = new String[2 * tokens.length - 1]; 
		String remainingString = null; // will be a substring from s
	  	  
		int size = 0; // tracks the position in s
		for (int i = 0; i < tokens.length; i++) {
			newTokens[2 * i] = tokens[i];
			size += newTokens[2 * i].length();
			remainingString = s.substring(size);
			if (i == tokens.length -1) break;
			int j = remainingString.indexOf(tokens[i + 1]);
			newTokens[2 * i + 1] = remainingString.substring(0, j);
			size += newTokens[2 * i + 1].length();
		}
	  	  
		// Check if there is a delimiter at the end of the original string
		if (remainingString != null && remainingString.length() > 0) {
	  		String[] result = new String[newTokens.length + 1];
	  	  	System.arraycopy(newTokens, 0, result, 0, newTokens.length);
	  	  	result[result.length - 1] = remainingString;
	  		return result;
	  	}
	  	else	  	  
	  	  	  return newTokens;
	}
	*/
}
