//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		ToyStore test = new ToyStore();
		
		out.print("Enter toys: ");
		String toys = keyboard.nextLine();
		
		test.loadToys(toys+" ");
		System.out.println(test);
	}
}