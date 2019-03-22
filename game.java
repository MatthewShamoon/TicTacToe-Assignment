// Matthew Shamoon

import java.util.*;


public class game extends board implements global
{
	boolean done = false;
	board gameBoard = new board();
	int playerO = 2;
	int playerX = 1;
	
	Random rand = new Random();
	int turn = rand.nextInt(2) + 1;
	
	
	public game()
	{
		super();
	}
	
	/**
	 * starts the game and runs it depending on the users inputs
	 */
	public void start()
	{
		Scanner sc1 = new Scanner(System.in);
		int choice = 1;
		boolean valid = false;
		boolean exit = false;
		

		valid = false;
		while(!valid)
		{
		System.out.println("TIC TAC TOE");
		System.out.println("Pick an option:");
		System.out.println("1: Player VS Player");
		System.out.println("2: Player VS AI");
		System.out.println("3: QUIT");
	
		choice = sc1.nextInt();
		sc1.nextLine();
	if(choice == 1 || choice == 2 || choice ==3)
		{
			valid = true;
		}
		}
		
		
			if (choice == 1)
			{
				System.out.println("Input Player 1's Name");
				String name1 = sc1.nextLine();
				HumanPlayer player1 = new HumanPlayer(gameBoard, 1, name1);
				
				System.out.println("Input Player 2's Name");
				String name2 = sc1.nextLine();
				HumanPlayer player2 = new HumanPlayer(gameBoard, 2, name2);
				
				while(!done) 
				{
					if (turn == 1)
					{
						System.out.println("It is " + player1.name +"'s turn");
						player1.play(gameBoard);
					}
					else 
					{
						System.out.println("It is " + player2.name +"'s turn");
						player2.play(gameBoard);
					}
					

					
					for(int i =0; i<3; i++)
					{
						if(gameBoard.checkRow(i) == 1 || gameBoard.checkCol(i) == 1)
						{
							System.out.println("X Wins");
							done = true;
							gameBoard.displayBoard();

							break;
							
						}
						if(gameBoard.checkRow(i) == 2 || gameBoard.checkCol(i) == 2)
						{
							System.out.println("O Wins");
							done = true;
							gameBoard.displayBoard();

							break;
						}
					}
					
					if(gameBoard.checkDiagonals() == 1) 
					{
						System.out.println("X Wins");
						done = true;
						gameBoard.displayBoard();

					}
					
					if(gameBoard.checkDiagonals() == 2)
					{
						System.out.println("O Wins");
						done = true;
						gameBoard.displayBoard();

					}
					
					if(gameBoard.checkDraw() == 1) 
					{
						System.out.println("It is a draw");
						done = true;
						gameBoard.displayBoard();
					}
					
					if(turn == 1)
					{
						turn = 2;
					}
					else
					{
						turn = 1;
					}
			
		}
			
		}
		if(choice == 2)
		{
			System.out.println("Input Player 1's Name");
			String name1 = sc1.nextLine();
			HumanPlayer player1 = new HumanPlayer(gameBoard, 1, name1);
			
			AIPlayer AI = new AIPlayer(gameBoard, 2,"Bot");
			
			while(!done) 
			{
				if (turn == 1)
				{
					System.out.println("It is " + player1.name +"'s turn");
					player1.play(gameBoard);
				}
				else  if(turn ==2)
				{
					System.out.println("It is the bot's turn");
					AI.play(gameBoard);
				}
				
				for(int i =0; i<3; i++)
				{
					if(gameBoard.checkRow(i) == 1 || gameBoard.checkCol(i) == 1)
					{
						done = true;
						gameBoard.displayBoard();
						System.out.println("X Wins");


						break;
						
					}
					if(gameBoard.checkRow(i) == 2 || gameBoard.checkCol(i) == 2)
					{

						done = true;
						gameBoard.displayBoard();
						System.out.println("O Wins");
						break;
					}
				}
				
				if(gameBoard.checkDiagonals() == 1) 
				{

					done = true;
					gameBoard.displayBoard();
					System.out.println("X Wins");
				}
				
				if(gameBoard.checkDiagonals() == 2)
				{
					done = true;
					gameBoard.displayBoard();
					System.out.println("O Wins");

				}
				
				if(gameBoard.checkDraw() == 1) 
				{
					done = true;
					gameBoard.displayBoard();
					System.out.println("It is a draw");

				}
				
				if(turn == 1)
				{
					turn = 2;
				}
				else
				{
					turn = 1;
				}
				
			}
		
		}
		
		if(choice == 3)
		{
			exit = true;
		}
	
		sc1.close();
	}
}

