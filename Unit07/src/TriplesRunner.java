//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

import java.util.Scanner;

public class TriplesRunner
{
   public static void main(String args[])
   {
 Scanner keyboard = new Scanner(in);
	   
	   out.print("Enter a number to find the Pythagorean triples: ");
	   int number = keyboard.nextInt();
	   
	   Triples test = new Triples(number);
	   
	   System.out.println(test);
	}
}