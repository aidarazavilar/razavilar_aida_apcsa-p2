//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] arr = new String[]{"a", "b", "c", "7", "9", "x", "2"};
		Grid test = new Grid(10, 10, arr); 
		System.out.println(test);
		System.out.println(test.findMax(arr));
	}
}