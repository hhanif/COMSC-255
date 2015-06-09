// File: AverageArrayTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna 
import java.util.Scanner;

public class AverageArrayTest {

    public static void main(String [] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter 1 to average an INT or hit 2 to average a DOUBLE");
    int entry = input.nextInt();

        if (entry == 2) {                                  //choose double and call double method
            double[] array = new double[10];
                for(int i = 0; i < 10; i++){
                    System.out.println("Enter a number to average.");
                    array[i] = input.nextDouble();
                }
                System.out.println("The average of your arrays numbers is: " + average(array));

        } else if (entry == 1) {                           //choose int and call int method
            int[] array = new int[10];
                for(int b = 0; b < 10; b++) {
                    System.out.println("Enter a number to average.");
                    array[b] = input.nextInt();
                }
                System.out.println("The average of your arrays numbers is: " + average(array));
        }

    }

    public static int average(int[] array){
        int total =0;
        int avg1 = 0;
            for(int b=0; b < 10; b++) {
                total = total + array[b];
                avg1 = total / 10;
            }
        return avg1;

    }

    public static double average(double[] array) {
        double total = 0;
        double avg = 0;
            for(int i =0; i < 10; i++) {
                total =  total + array[i];
                avg = total / array.length;
            }
        return avg;

    }

}
