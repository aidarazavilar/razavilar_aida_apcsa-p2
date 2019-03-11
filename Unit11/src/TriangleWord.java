//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		
		for (int x =0; x<word.length(); x++)
		{
			for (int y=0; y<x+1; y++)
			{
				System.out.print(word.substring(0,x+1));
			}
			System.out.print("\n");
		
		
		
		
		}
		
	}
	
}
	
