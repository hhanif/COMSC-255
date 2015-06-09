// File: ArrayListTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
package ArrayListTest;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;


public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[5];
		System.out.println("Enter five double values:");
		for(int i = 0; i < 5; i++){
			list.add(input.nextDouble());
		}
		System.out.println("Count: " + list.size());
		System.out.println("Entered: " + list);
		
		for(double item: list) {
			System.out.print(item+" ");
		}
		list.add(0, 10.0);
		System.out.println();
		
			for(double item: list) {
				System.out.print(item+" ");
			}
				list.remove(list.size() -1);
				System.out.println();
				System.out.print("Altered front and back:");
				
			for(double item: list) {
					System.out.print(item+" ");
				}
			System.out.println();
			System.out.print("Reversed:");
			Collections.reverse(list);
			
			for(double item: list) {
				System.out.print(item+" ");
			}
			System.out.println();
			System.out.print("Sorted:");
			Collections.sort(list);
			
			for(double item: list) {
				System.out.print(item+" ");
			}
			System.out.println();
			System.out.print("Sum:" + sum(list));
			
			

}
	public static double sum(ArrayList<Double> list) {
			double sum = 0;
			for(int i = 0; i < 5; i++) {
				sum += list.get(i);

			}
			return sum;
	}
}
