//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class TriangleFiveRunner
{
      public static void main(String args[])
	   {
		   Scanner keyboard = new Scanner(in);
		   out.print("Enter a letter: ");
		   char c = keyboard.next().charAt(0);  
		   out.print("Enter a number: ");
		   int num = keyboard.nextInt(); 
		   TriangleFive test = new TriangleFive(c, num);
		   System.out.println(test);
	}
}