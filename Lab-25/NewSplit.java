// File: NewSplit.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna

public class NewSplit {

	public static void main(String[] args) {
		String[][] sar = { {"ab12gf45e777", "\\d+"}, 
				{"ab#12#453##", "#"}, 
				{"a?b?gf#e", "[?#]"}};
		for(int i=0; i<3; i++) {
			System.out.print("\nSpliting " + sar[i][0]
					+ sar[i][1] + "\n\t");
			String[]tokens = split(sar[i][0], sar[i][1]);
			for(String s:tokens)
				System.out.print(s+' ');
		}
	}
	
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
}

