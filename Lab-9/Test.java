import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	final int SIZE = 4;
    	int[][] matrix = new int[SIZE][SIZE];
    	int sentinel = 1;
    	while(true){
    		System.out.print("Enter 1 to continue, 0 to exit");
    		sentinel = input.nextInt();
    		int i = (int)(Math.random()*2);
    		System.out.printf("generated %d\n", i);
    		
    	}


    }
}
