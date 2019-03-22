//Matthew Shamoon

import java.util.*;

public class AIPlayer extends player
{
	board gameBoard;
	int Symbol;
	String name;
	
	AIPlayer(board gameBoard, int Symbol, String name )
	{
		super();
		this.gameBoard = gameBoard;
		this.Symbol = Symbol;
		this.name = name;
		
	}
	
	/**
	 * plays the game 
	 * @param board
	 */
	public void play(board board)
	{
		Random rand = new Random ();
		int [][] Valid = new int [9][2];
		int i =0;
		boolean valid = false;
		while(!valid)
		{
			for(int row=0; row<3; row++)
			{
				for (int col = 0; col<3; col++)
				{
					if(board.isValid(row,col))
					{
						Valid[i][0] =row;
						Valid[i][1] =col;
						i++;
						
					}
					
				}
			}
			
			int index = rand.nextInt(i) + 0;
			
			int r = Valid[index][0];
			int c = Valid[index][1];
			if(board.isValid(r, c))
			{
				board.makeMove(r, c, Symbol);
				valid = true;
			}
		}
	
		
	}
}
