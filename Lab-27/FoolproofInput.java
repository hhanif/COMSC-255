// File: FoolproofInput.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
package com.deitel.ch17;

//FoolproofInput.java
import java.util.Scanner;
import java.io.InputStream;
import java.io.PrintStream;

interface InputGrabber<T> {
	 boolean hasNextInput(Scanner scanner);
	 T getNextInput(Scanner scanner);
	 String getExpectedInputFormat();
}

class PromptCycle {

 private final Scanner scanner;
 private final PrintStream output;

 public PromptCycle(InputStream in, PrintStream out) {
     scanner = new Scanner(in);
     output = out;
 }

 public <T> T getInput(String prompt, InputGrabber<T> grabber) {
     do {
         output.print(prompt);
     } while (needsProperInput(grabber));
     T value = grabber.getNextInput(scanner);
     return value;
 }

 private <T> boolean needsProperInput(InputGrabber<T> grabber) {
     if (grabber.hasNextInput(scanner)) {
         return false;
     }
     output.println(grabber.getExpectedInputFormat());
     scanner.nextLine();
     return true;
 }

}

class IntegerInputGrabber implements InputGrabber<Integer> {

 public boolean hasNextInput(Scanner scanner) {
     return scanner.hasNextInt();
 }

 public Integer getNextInput(Scanner scanner) {
 	int input = scanner.nextInt();
 	scanner.nextLine();
     return input;
 }

 public String getExpectedInputFormat() {
     return "Invalid input! Requested an Int, recieved something else.";
 }

}

class DoubleInputGrabber implements InputGrabber<Double> {

 public boolean hasNextInput(Scanner scanner) {
     return scanner.hasNextDouble();
 }

 public Double getNextInput(Scanner scanner) {
 	double input = scanner.nextDouble();
 	scanner.nextLine();
     return input;
 }

 public String getExpectedInputFormat() {
     return "Invalid input! Requested a Double, recieved something else.";
 }

}

class StringInputGrabber implements InputGrabber<String> {

 public boolean hasNextInput(Scanner scanner) {
     return scanner.hasNextLine();
 }

 public String getNextInput(Scanner scanner) {
     return scanner.nextLine();
 }

 public String getExpectedInputFormat() {
     return "Invalid input! Requested a String, recieved something else.";
 }

}

public class FoolproofInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Foolproof input started");
		
     PromptCycle cycle = new PromptCycle(System.in, System.out);
     Integer ivalue = cycle.getInput("Enter an integer: ", new IntegerInputGrabber());
     System.out.println("Value retrieved: " + ivalue + "\n");
     
     Double dvalue = cycle.getInput("Enter a double: ", new DoubleInputGrabber());
     System.out.println("Value retrieved: " + dvalue + "\n");
     
     System.out.print("Enter a string: ");
     String svalue1 = input.nextLine();
     System.out.println("Value retrieved: " + svalue1 + "\n");
     
     // alternatively
     String svalue2 = cycle.getInput("Enter a string: ", new StringInputGrabber());
     System.out.println("Value retrieved: " + svalue2 + "\n");
     
     System.out.println("Thank you for your input.\nProgram exit.");
     input.close();
	}

}

