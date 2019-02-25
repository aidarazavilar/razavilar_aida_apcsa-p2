//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		playChoice = "";
		compChoice = "";
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player.toUpperCase().trim(); 
		int num = (int)(Math.random()* 3);
		if (num == 0)
		{
			compChoice = "R";
		}
		else if (num == 1)
		{
			compChoice = "P";
		}
		else if (num == 2) 
		{
			compChoice = "S";
		}
		
	}

	public String determineWinner()
	{
		String winner="";
		if (playChoice.equals(compChoice))
		{
			winner = "Draw Game!";
		}
		else if ((playChoice.equals("R") && compChoice.equals("S"))
				|| (playChoice.equals("P") && compChoice.equals("R"))
				|| (playChoice.equals("S") && compChoice.equals("P")))
		{
			winner = "Player";
		}
		else 
		{
			winner = "Computer";
		}
		
			
		return winner;
	}

	public String toString()
	{
		
		String output="Player choice: "+playChoice+"\nComputer choice: "+compChoice;
		
		if (determineWinner().equals("Draw Game!")) 
		{
			output = output + "\nDraw Game!";
		}
		else 
		{
		
			String result = "";
			if (determineWinner().equals("Computer")) {
				if (compChoice.equals("R")) {
					result = "Rock Breaks Scissors";
				}
				else if (compChoice.equals("P")) {
					result = "Paper Covers Rock";
				}
				else {
					result = "Scissors Cuts Paper";
				}	
			}
			
			if (determineWinner().equals("Player")) {
				if (playChoice.equals("R")) {
					result = "Rock Breaks Scissors";
				}
				else if (playChoice.equals("P")) {
					result = "Paper Covers Rock";
				}
				else {
					result = "Scissors Cuts Paper";
				}	
			}
			
			output = output + "\nThe winner is " + determineWinner()+"! <<" + result + ">>";
		}
		
		
		return output;
	}
}