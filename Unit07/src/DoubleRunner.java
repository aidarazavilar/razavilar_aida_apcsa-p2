//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

import java.util.Scanner;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		BiggestDouble run = new BiggestDouble(4.5,6.7,7.8,9.0);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");

		//add more test cases
				
		Scanner keyboard = new Scanner (System.in);
		out.print("Type a number: ");
		double a = keyboard.nextDouble();
		out.print("Type another number: ");
		double b = keyboard.nextDouble();
		out.print("Type another number: ");
		double c = keyboard.nextDouble();
		out.print("Type one final number: ");
		double d = keyboard.nextDouble();
		run.setDoubles(a, b, c, d);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");
		
	}
}