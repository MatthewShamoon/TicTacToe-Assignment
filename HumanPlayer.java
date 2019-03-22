//Matthew Shamoon

import java.util.*;

public class HumanPlayer extends player
{
	board gameBoard;
	int Symbol;
	String name;
	
	/**
	 * 
	 * @param board
	 * @param playerSymbol
	 * @param name
	 */
	public HumanPlayer(board board, int playerSymbol, String name) 
	{
		super();
		this.gameBoard= board;
		this.playerSymbol = playerSymbol;
		this.name = name;
	}
	/**
	 * @param board 
	 * plays the game
	 */
	public void play(board board)
	{
		int r=0;
		int c=0; 
		boolean nextTurn = false;
		while(!nextTurn)
		{
		Scanner sc1 = new Scanner(System.in);
		board.displayPlayerSelectionBoard();
		
		int selection = sc1.nextInt();
		
		switch(selection)
		{
			case 1: r=0;
					c=0;
					break;
			
			case 2: r=0;
					c=1;
					break;
					
			case 3: r=0;
					c=2;
					break;

			case 4: r=1;
					c=0;
					break;
				
			case 5: r=1;
					c=1;
					break;
	
			case 6: r=1;
					c=2;
					break;
			
			case 7: r=2;
					c=0;
					break;

			case 8: r=2;
					c=1;
					break;
					
			case 9: r=2;
					c=2;
					break;	
		}
		
		if(board.isValid(r,c))
		{
		board.makeMove(r, c, playerSymbol);
		nextTurn = true;
		}
		else
		{
			System.out.println("INVALID MOVE! PICK ANOTHER SPOT");
		}
	}
		//sc1.close();
	}
}
	


