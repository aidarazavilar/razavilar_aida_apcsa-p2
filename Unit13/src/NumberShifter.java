//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] array = new int[size];
		
		for (int x = 0; x < array.length; x++)
		{
			array[x] = (int)(Math.random()*10)+1;
		}
		
		return array;
	}
	public static void shiftEm(int[] array)
	{
		int spot7 = 0;
		for (int x = 0; x < array.length; x++)
		{
			if (array[x] == 7)
			{
				int temp = array[spot7];
				array[spot7] = 7;
				array[x] = temp;
				spot7++;
			}
		}
	}
	
}
