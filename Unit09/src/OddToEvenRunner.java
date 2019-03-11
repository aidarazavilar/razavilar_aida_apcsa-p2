import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ListOddToEven distance = new ListOddToEven();
		int[] array= new int[] {7,8,11,12,6,8,15};
		
		ArrayList<Integer> ray;
		ray = new ArrayList<Integer>();
	
		for (int x = 0; x<array.length; x++)
		{
			ray.add(array[x]);
		}
		
		System.out.println(distance.go(ray));
		
		
	}
}