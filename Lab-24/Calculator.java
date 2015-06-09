// File: Calculator.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
public class Calculator {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Incorrect number of args, \n" + "Use: java Calculator \"opr1 operator opr2\"");
			System.exit(0);
		}
		int result = 0;
		//eg. "55 + 33"
		String[] tokens = args[0].split(" ");
		int i = Integer.parseInt(tokens[0]);
		int j = Integer.parseInt(tokens[2]);
		switch(tokens[1].charAt(0)) {
		case '+':
			result = i + j;
			break;
		case '-':
			result = i - j;
			break;
		case '*':
			result = i * j;
			break;
		case '/':
			result = i / j;
			break;
		}
		System.out.println(i + tokens[1] + j + " = " + result);
	}

}
