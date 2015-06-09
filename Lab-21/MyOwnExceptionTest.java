// File: MyOwnExceptionTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
class MyOwnException extends Exception {
	public MyOwnException(String message) {  //constructor
	   super(message);
	}
}

public class MyOwnExceptionTest {
	public static void main( String[] args ) {
		try {
			magic(9);
			magic(8);
		}
		catch(MyOwnException e) {
			e.printStackTrace();
		}
	}



public static void magic(int number) throws MyOwnException {
	if (number == 8) {
	      throw (new MyOwnException("you hit the magic number"));
	   }
	   System.out.println("hello");  // skip if exception triggered
	}
}
