//Matthew Shamoon

import java.util.Scanner;

abstract public class player 
{
	board gameBoard;
	String playerName;
	int playerSymbol;
	
	public player()
	{
		
	}
	
	/**
	 * 
	 * @param board
	 * @param playerSymbol
	 * @param name
	 */
	public player(board board, int playerSymbol, String name)
	{
		gameBoard = board;
		this.playerSymbol = playerSymbol;
		playerName = name;
	}
	
	/**
	 * 
	 * @param board
	 */
	abstract public void play(board board);
	
		
}
