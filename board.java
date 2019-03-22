//Matthew Shamoon

import java.util.*;
public class board extends block implements global
{
	block test = new block();
	//ArrayList<block> [][] blocks = new ArrayList[3][3];
	block[][] blocks = new block [3][3];
	
	//intially empty board
	
	public board()
	{
		super();
		for(int r = 0; r<3 ; r++)
		{
			for(int c = 0; c<3; c++)
			{
				blocks[r][c] = new block();
				blocks[r][c].setState(0);
				
			}
		}
	}
	
	/**
	 * 
	 * @param col
	 * @return
	 */
	// checks the columns for a win
	public int checkCol(int col)
	{
		int [] column = new int [3];
		for(int r =0; r<3; r++)
		{
			int state = blocks[r][col].getState();
			column[r] = state;
		}
		
		if(column[0] == 1 && column[1] == 1 && column[2]==1)
		{
			return 1; //X wins
		}
		
		if(column[0] == 2 && column[1] == 2 && column[2]==2)
		{
			return 2; // O wins
		}
		
		else
		{
			return 0; // no win
		}
	}
	 /**
	  * checks row for a win
	  * @param row
	  * @return
	  */
	public int checkRow(int row)
	{
		int [] rows = new int [3];
		for(int c=0; c<3; c++)
		{
			int state = blocks[row][c].getState();
			rows[c] = state;
		}
		
		if(rows[0] == 1 && rows[1] == 1 && rows[2]==1)
		{
			return 1; //X wins
		}
		
		if(rows[0] == 2 && rows[1] == 2 && rows[2]==2)
		{
			return 2; // O wins
		}
		
		else
		{
			return 0; // no win
		}
		
	}
	
	/**
	 * checks diagonals for a win
	 * @return
	 */
	public int checkDiagonals()
	{
		int [] diag1 = new int [3];
		int [] diag2 = new int [3];
		
		diag1 [0] = blocks[0][0].getState();
		diag1 [1] = blocks[1][1].getState();
		diag1 [2] = blocks[2][2].getState();
		
		diag2 [0] = blocks[0][2].getState();
		diag2 [1] = blocks[1][1].getState();
		diag2 [2] = blocks[2][0].getState();
		
		if(diag1[0] == 1 && diag1[1] == 1 && diag1[2]==1)
		{
			return 1; //X wins
		}
		
		if(diag1[0] == 2 && diag1[1] == 2 && diag1[2]==2)
		{
			return 2; // O wins
		}
		
		if(diag2[0] == 1 && diag2[1] == 1 && diag2[2]==1)
		{
			return 1; //X wins
		}
		
		if(diag2[0] == 2 && diag2[1] == 2 && diag2[2]==2)
		{
			return 2; // O wins
		}
		
		else
		{
			return 0; // no win
		}
	}
	
	/**
	 * checks for a draw
	 * @return
	 */
	public int checkDraw()
	{
		for(int r =0; r<3; r++)
		{
			for(int c = 0; c<3; c++)
			{
				if(blocks[r][c].getState() == 0)
				{
					return 0; // no draw
				}
			}
		}
		
		return 1; // it is a draw
	}
	
	/**
	 * displays board
	 */
	public void displayBoard()
	{
		for(int r =0; r<3; r++)
		{
			for(int c=0; c<1; c++)
			{
				
				System.out.println( blocks[r][c] + "|" + blocks[r][c+1]+ "|" + blocks[r][c+2]);

			}
		}
	}
	
	/**
	 * displays slection board
	 */
	public void displayPlayerSelectionBoard()
	{
		for(int r =0; r<3; r++)
		{
			for(int c=0;c<1;c++) 
			{
				if(blocks[r][c].getState() == 0)
				{
					System.out.print(3*r + 1 + c);
				}
				else
				{
					System.out.print(blocks[r][c]);
				}
				
				if(blocks[r][c+1].getState() == 0)
				{
					System.out.print("|" + (3*r + 2 + c) +"|");
				}
				else
				{
					System.out.print("|"+blocks[r][c+1]+"|");
				}
				
				if(blocks[r][c+2].getState() == 0)
				{
					System.out.println(3*r + 3 + c);
				}
				else
				{
					System.out.println(blocks[r][c+2]);
				}
				
			
			}
		}
	}
	
	/**
	 * 
	 * @param r
	 * @param c
	 * @param player
	 * @return
	 */
	//checks if move is legal and updates state 
	public boolean makeMove(int r, int c, int player)
	{
		if(blocks[r][c].getState() == 0)
		{
			blocks[r][c].setState(player);
			return true;
		}
		else 
		{
			System.out.println("INVALID MOVE!");
			return false;
		}
	}
	
	/**
	 * checks if move is valid
	 * @param r
	 * @param c
	 * @return
	 */
	public boolean isValid(int r, int c)
	{
		if(blocks[r][c].getState() == 0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
}
