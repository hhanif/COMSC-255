// File: TicTacToeTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
import java.util.Scanner;
 
public class TicTacToeTest{
 
	public static void main( String[] args ){
	boolean isFull = false;//if true all the squares have been assigned.
	boolean isDraw = false;//to check if the game is draw
	boolean squareIsFull = false;//returns the status of a square, if false the square is full if true the square is empty
	boolean victory = false;//if returns true one of the players has won
	int playerCounter = 1;//if it is odd it's player1's turn if even it's player2's turn
	int rowInput;
	int colInput;
		Scanner input = new Scanner( System.in );
		TicTacToe myTicTacToe = new TicTacToe();//create object
		myTicTacToe.printBoard();
		while( !isFull ){
			isDraw = myTicTacToe.isDraw();
			if( isDraw ){
				System.out.println( "The game is draw!\n" );
				//print board
				//myTicTacToe.printBoard();
				break;
			}
			//print board
			//myTicTacToe.printBoard();
			//System.out.println("the number is " + playerCounter );
			if( !(myTicTacToe.isOdd( playerCounter ))){//player 1
				System.out.println( "\nPlayer 1: enter the coordinates of the square.\nRow and column - values between 1 and 3." );
			}
			else{//player 2
				System.out.println( "\nPlayer 2: enter the coordinates of the square.\nRow and column - values between 1 and 3." );
			}
			System.out.println( "\nRow and press enter: " );
			rowInput = input.nextInt();
			System.out.println( "\nColumn and press enter: " );
			colInput = input.nextInt();
			/*while( !rowInput.hasNextInt() )*/
			rowInput = myTicTacToe.optimizeInput( rowInput );//to subtract 1 from the input
			colInput = myTicTacToe.optimizeInput( colInput );//to subtract 1 from the input
 
			//check input
			squareIsFull = myTicTacToe.checkSquare( rowInput, colInput );
			//if the square is taken - true - input again row and column till you find a free one
			while( squareIsFull ){
				System.out.println( "Square taken, try again. \nEnter the coordinates of the square.\nRow and column - values between 1 and 3." );
				System.out.println( "\nRow: " );
				rowInput = input.nextInt();
				System.out.println( "\nColumn: " );
				colInput = input.nextInt();
				rowInput = myTicTacToe.optimizeInput( rowInput );//to subtract 1 from the input
				colInput = myTicTacToe.optimizeInput( colInput );//to subtract 1 from the input
				//check input
				squareIsFull = myTicTacToe.checkSquare( rowInput, colInput );
			}
			//assign the symbol to the chosen square
			myTicTacToe.assignSymbol( rowInput, colInput, playerCounter );
			//print board
			myTicTacToe.printBoard();
			//check for draw
			victory = myTicTacToe.checkVictory( rowInput, colInput, playerCounter );
			//player 1
			if(( victory ) && ( myTicTacToe.isOdd( playerCounter ) )){
				System.out.println( " Player 1 wins!" );
				//print board
				//myTicTacToe.printBoard();
				break;
			}
			//player2
			else if(( victory ) && !( myTicTacToe.isOdd( playerCounter ) )){
				System.out.println( " Player 2 wins!" );
				//print board
				myTicTacToe.printBoard();
				break;
			}			
			playerCounter++;//increment counter to change player's turn
		}//end while loop
	}//end main	
}//end TicTacToeTest class
