// File: CountRandomDigitsTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
import java.util.Random;

public class CountRandomDigitsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] count = new int[10];
		
		for (int i = 0; i < 100; i++){
			
		int random = (int)(Math.random()  * 10);
		count[random]++;
		
		}
		for(int i = 0; i < 10; i++){
			
			if (count[i] > 0){
				
				System.out.println("The number " + (i) + " occurs " + count[i] + " times");

			}
		

	}

}
}
