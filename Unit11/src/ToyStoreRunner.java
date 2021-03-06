//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		ToyStore test = new ToyStore();
		
out.print("Enter a list of toys (with spaces) ");
		
		String input = keyboard.nextLine() + " ";
		int loc = input.indexOf(' ');
		String currentToy = "";

		while (loc > -1)
		{
			currentToy = (input.substring(0, loc));
			test.loadToys(currentToy);
			input = input.substring(loc+1);
			loc = input.indexOf(' ');
		}

		System.out.println(test);
	}
}
