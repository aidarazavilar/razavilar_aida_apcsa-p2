//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class AvgLen
{
   public static double go( String a, String b )
	{
	   double lengthStringA = a.length();
	   double lengthStringB = b.length();
	   double averageLength = 0;
	   averageLength = (lengthStringA + lengthStringB)/2;
	   return averageLength;
	}
}