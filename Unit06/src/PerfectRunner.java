//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
      Scanner keyboard = new Scanner(System.in);
		out.print("Type an integer");
		int num = keyboard.nextInt();
		Perfect testers = new Perfect(num);
		testers.isPerfect();
		System.out.println(testers.toString());
																
	}
}