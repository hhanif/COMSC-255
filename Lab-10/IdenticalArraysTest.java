// File: IdenticalArraysTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
import java.util.Scanner ;
 
public class IdenticalArraysTest {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    final int row = 3;
    final int column = 3;

    System.out.print("Enter m1 (a 3 by 3 matrix) row by row: \n");

    int[][] m1 = new int[row][column];   

    for (int i = 0; i < m1.length; i++)

      for (int j = 0; j < m1[0].length; j++)

        m1[i][j] = input.nextInt();

 

    System.out.print("Enter m2 (a 3 by 3 matrix) row by row: \n");

    int[][] m2 = new int[row][column];   
    for (int i = 0; i < m2.length; i++)
      for (int j = 0; j < m2[0].length; j++)
        m2[i][j] = input.nextInt();

    if (equals(m1, m2))
        System.out.println("The two arrays are identical");
    else
        System.out.println("The two arrays are not identical");
  }

  public static boolean equals (int[][] m1, int[][] m2)
  {
     if (m1.length != m2.length) return false;
     for (int i = 0; i < m1.length; i++) {
       if (m1[i].length != m2[i].length) return false;
       for (int j = 0; j < m1[i].length; j++) {
         int b1 = m1[i][j];
         int b2 = m2[i][j];
         if (b1 != b2) return false;
       }
    }
    return true;
  }
}


