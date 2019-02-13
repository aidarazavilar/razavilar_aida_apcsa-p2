//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Write two words to see if they are the same.");
		String one = keyboard.nextLine();
		String two = keyboard.nextLine();
		StringEquality check = new StringEquality(one, two);
		check.checkEquality();
		System.out.println(check.toString());
		
		
		
		
	}
}