//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

import java.util.Scanner;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		out.print("Give me a word: ");
		String word = keyboard.nextLine();
		TriangleOne testers = new TriangleOne(word);
		testers.print();
	}
}