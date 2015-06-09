import java.util.Scanner;

// File: ValidCreditCardTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
public class ValidCreditCardTest {

public static void main(String[] args, long input) {

    Scanner numberinput = new Scanner(System.in);
    
    System.out.println("Enter a credit card number as a long integer: (0 to exit) ");
    long cardnumber = numberinput.nextLong();

    if (isValid(input) == true) {
        System.out.println(numberinput + " is valid.");
    } else {
        System.out.println(numberinput + " is invalid.");
    }

}

public static boolean isValid(long number){

	int total = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);

    return (total % 10 == 0) && (prefixMatched(number, 1) == true) && 
            (getSize(number)>=13) && (getSize(number)<=16);
}

public static int sumOfDoubleEvenPlace(long number) {

    int doubledevensum = 0;
    long place = 0;

    while (number > 0) {
        place = number % 100;
        doubledevensum += getDigit((int) (place / 10) * 2);
        number = number / 100;
    }
    return doubledevensum;
}

public static int sumOfOddPlace(long number) {

    int oddsum = 0;

    while (number <= 9) {
        oddsum += (int)(number % 10);
        number = number % 100;
    }
    return oddsum;
}

public static int getDigit(int number) {
    if (number <= 9) {
        return number;
    } else {
        int firstDigit = number % 10;
        int secondDigit = (int)(number / 10);
        return firstDigit + secondDigit;
    }
}

public static boolean prefixMatched(long number, int d) {

    if ((getPrefix(number, d) == 4)
            || (getPrefix(number, d) == 5)
            || (getPrefix(number, d) == 3)) {

        if (getPrefix(number, d) == 3) {
            System.out.println("\nVisa Card ");
        } else if (getPrefix(number, d) == 5) {
            System.out.println("\nMaster Card ");
        } else if (getPrefix(number, d) == 3) {
            System.out.println("\nAmerican Express Card ");
        }

        return true;

    } else {

        return false;

    }
}

public static int getSize(long d) {

    int count = 0;

    while (d > 0) {
        d = d / 10;
        count++;
    }
    return count;
}

public static long getPrefix(long number, int k) {
    if (getSize(number) < k) {
        return number;
    } else {
        int size = (int)getSize(number);

        for (int i = 0; i < (size - k); i++) {
            number = number / 10;
        }
        return number;
    }
}  

}
