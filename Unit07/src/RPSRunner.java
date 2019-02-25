//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String response;
		
		do 
		{
			String player = "";
			out.print("pick your weapon[R,P,S] :: ");
			//read in the player value
			response = keyboard.next();
			RockPaperScissors newgame = new RockPaperScissors(response);
			System.out.println(newgame);
			out.print("Do you want to play again? (y or n)");
			response = keyboard.next();
			//add in a do while loop after you get the basics up and running
		} while (!response.equals("n"));
		

			
}

}



