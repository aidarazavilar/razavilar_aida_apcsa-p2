//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

import java.util.Scanner;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a word!");
		String word = keyboard.nextLine();
		
		Word testers = new Word(word);
		testers.getFirstChar();
		testers.getLastChar();
		testers.getBackWards();
		out.println(testers.toString());	
	}
}