// File: Patterns.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
public class Patterns {
	public static void main(String[] args){
		System.out.printf("Pattern A:\n");
		for(int i=1;i<=6;i++)
		{
		for(int j=1;j<=i;j++)
		{
		System.out.printf("%d ", j);
		}
		System.out.printf("\n");
		}
		System.out.printf("\n");
		System.out.printf("Pattern B:\n");
		for(int i=6;i>=1;i--)
		{
		for(int j=1;j<=i;j++)
		{
		System.out.printf("%d ", j);
		}
		System.out.printf("\n");
		}
		System.out.printf("\n");
		System.out.printf("Pattern C:\n");
		for (int i = 1; i <= 6; i++) {
		for(int k=6;k >=i;k--){
		System.out.print(" ");
		}
		for (int j = i; j > 0; j--) {
		System.out.print("" + j);
		}
		System.out.println("");
		}
		System.out.printf("\n");
		System.out.printf("Pattern D:\n");
		for (int i = 6; i >= 1; i--)
		{
		      for(int j = 0; j < 6 - i; j++)
		            System.out.print(" ");
		      for (int j = 1; j <= i; j++)
					System.out.print("" + j);
		      System.out.println();
		}
		System.out.println();

	}
}


