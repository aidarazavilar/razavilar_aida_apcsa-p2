//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		
		out.print("Enter Monster One's name : ");
		String name1 = keyboard.next();
		out.print("Enter Monster One's size : ");
		int size1 = keyboard.nextInt();
		
		//instantiate monster one
		
		Skeleton skel = new Skeleton(name1, size1);
		
		//ask for name and size
		
		out.print("Enter Monster Two's name : ");
		String name2 = keyboard.next();
		out.print("Enter Monster Two's size : ");
		int size2 = keyboard.nextInt();
		
		//instantiate monster two
		
		Vampire vamp = new Vampire (name2, size2);
		
		System.out.println("\nMonster 1 - "+skel);
		System.out.println("Monster 2 - "+vamp+"\n");
		
		if (skel.isBigger(vamp)) System.out.println("Monster one is bigger than Monster two.");
		else if (skel.isSmaller(vamp)) System.out.println("Monster one is smaller than Monster two.");

		if (skel.namesTheSame(vamp)) System.out.println("Monster one has the same name as Monster two.");
		else System.out.println("Monster one does not have the same name as Monster two.");
	}
}