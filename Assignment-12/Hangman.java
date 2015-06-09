// File: Hangman.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
import java.io.PrintStream;
import java.util.Scanner;

public class Hangman
{
public static void main(String[] args)
{
String[] words = { "write", "program", "that", "receive", "positive" };

Scanner input = new Scanner(System.in);
char anotherGame;
do
{
int index = (int)(Math.random() * words.length);

String hiddenWord = words[index];
StringBuilder guessedWord = new StringBuilder();

for (int i = 0; i < hiddenWord.length(); i++) {
guessedWord.append('*');
}
int numberOfCorrectLettersGuessed = 0; int numberOfMisses = 0;

while (numberOfCorrectLettersGuessed < hiddenWord.length()) {
System.out.print("(Guess) Enter a letter in word " + guessedWord +
" > ");
String s = input.nextLine();
char letter = s.charAt(0);

if (guessedWord.indexOf(String.valueOf(letter)) >= 0) {
System.out.println("\t" + letter + " is already in the word");
} else if (hiddenWord.indexOf(letter) < 0) {
System.out.println("\t" + letter + " is not in the word");
numberOfMisses++;
} else {
int k = hiddenWord.indexOf(letter);
while (k >= 0) {
guessedWord.setCharAt(k, letter);
numberOfCorrectLettersGuessed++;
k = hiddenWord.indexOf(letter, k + 1);
}
}
}

System.out.println("The word is " + hiddenWord + ". You missed " + numberOfMisses +         (numberOfMisses <= 1 ? " time" : " times"));

System.out.print("Do you want to guess for another word? Enter y or n> ");
anotherGame = input.nextLine().charAt(0);
}while (anotherGame == 'y');
}
}
