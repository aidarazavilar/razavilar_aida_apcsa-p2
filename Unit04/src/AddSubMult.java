//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{
		double result = 0;
		if (a==b) {
			result= a*b;
		}
		
		if (a>b) {
			result= a - b;
		}
		
		if (a<b) {
			result= b - a;
			
		}
		
		return (double)Math.round(result*10)/10;
	}
}