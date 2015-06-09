// File: TicTacToe.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
import javax.swing.*;
public class TicTacToe{    
	//private boolean isFull = false;//if true all the squares have been assigned.
	//private int playerCounter = 1;//if it is odd it's player1's turn if even it's player2's turn
	private TicTacToeEn[][] board = new TicTacToeEn[3][3];//to represent the 3-by-3 board
 
	//private boolean isDraw;//to check if the game is draw
	//private boolean squareStatus;//returns the status of a square, if false the square is full if true the square is empty
	//private boolean victory;//if returns true one of the players has won	
	//private int row;//row of the 3-by-3 board
	//private int column;//column of the 3-by-3 board	
	//private int gameCounter;//counts the moves
 
 
	public enum TicTacToeEn{
		X, O, EMPTY	
	}//end of enum
	TicTacToeEn theSymbol;//of type enum holds the current theSymbol, X or O 
	//constructor
	public TicTacToe(){
		for( int i = 0; i < board.length; i++ ){
			for( int j = 0; j < board[i].length; j++ ){
				board[i][j] = TicTacToeEn.EMPTY;
			}//columns
		}//rows			
	}//end of constructor
 
	//checks if square is empty
	public boolean checkSquare( int row, int column ){
		if(board[row][column] == TicTacToeEn.EMPTY){
			return false;
		}
		else{
			return true;
		}		
	}//end of checkSquare()
 
	//assigns X or O to the square
	public void assignSymbol( int row, int column, int counter ){
		if( isOdd( counter )){//it's player1
			board[row][column] = TicTacToeEn.X;		
		}
		else{//it's player2
			board[row][column] = TicTacToeEn.O;		
		}
	}//end of assignSymbol()
 
	//check if the game is draw
	public boolean isDraw(){
		for( int i = 0; i < board.length; i++ ){
			for(int j = 0; j < board[i].length; j++ ){
				if( board[i][j] == TicTacToeEn.EMPTY ){//if there is an empty square
					return false;
				}				
			}//end of column array
		}//end of row array
		return true;//if there isn't an empty square
	}//end of isDraw()
 
	//checks if anybody has won the game
	public boolean checkVictory( int row, int column, int counter ){
		if( isOdd( counter )){//it's player1
			theSymbol = TicTacToeEn.X;
		}
		else{//it's player2
			theSymbol = TicTacToeEn.O;
		}
		//determine victory
		if(	
			( board[row][0] == theSymbol && board[row][1] == theSymbol &&	board[row][2] == theSymbol )//check 3-in-the-row horizontally	
			||  ( board[0][column] == theSymbol && board[1][column] == theSymbol && board[2][column] == theSymbol )//check 3-in-the-row vertically			
			||  ( board[0][0] == theSymbol && board[1][1] == theSymbol && board[2][2] == theSymbol )//check 3-in-the-row 1st diagonal			
			||  ( board[0][2] == theSymbol && board[1][1] == theSymbol && board[2][0] == theSymbol )//check 3-in-the-row 2nd diagonal
		){
			return true;
		}
 
		else{
			return false;
		}		
	}//end of checkVictory()
 
	//determine if the argument is odd or even
	public boolean isOdd( int number){
		if( number % 2 == 0){//it's even
			return true;
		}
		else{//it's odd
			return false;
		}
	}//end of isOdd()
 
	/*get the right input for the array, 
	effectively subtracting 1 to the input so that the 
	index is still within the array range*/
	public int optimizeInput( int theInput ){
			int newInput = theInput - 1;
			return newInput;
	}
 
	//print board
	public void printBoard(){
/* 		System.out.print("\n\n\n\n\n");
		System.out.println("|   " + board[0][0] + "   |   " + board[0][1] + "   |   " + board[0][2] + "   |");
		System.out.println("|   " + board[1][0] + "   |   " + board[1][1] + "   |   " + board[1][2] + "   |");
		System.out.println("|   " + board[2][0] + "   |   " + board[2][1] + "   |   " + board[2][2] + "   |");
		System.out.print("\n\n\n\n\n"); */
		System.out.print("\n\n\n\n\n");
		System.out.printf("| %6s | %6s | %6s |", board[0][0], board[0][1], board[0][2]);
		System.out.printf("\n| %6s | %6s | %6s |", board[1][0], board[1][1], board[1][2]);
		System.out.printf("\n| %6s | %6s | %6s |", board[2][0], board[2][1], board[2][2]);
		System.out.print("\n\n\n\n\n");
	}
}//end of class
