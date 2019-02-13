//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		System.out.println ("Enter a word or line to see if the length is even.");
		String words = keyboard.nextLine();
		
		StringOddOrEven test = new StringOddOrEven(words);
		System.out.println (test.toString());
		
				
	}
}