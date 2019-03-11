import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumFirstRunner
{
	public static void main( String args[] )
	{	
		ListSumFirst sum= new ListSumFirst();
		int[] array= new int[] {6,7,8,9,10};
		
		ArrayList<Integer> vals;
		vals = new ArrayList<Integer>();
		
		for (int x =0; x<array.length; x++)
		{
			vals.add(array[x]);
		}
		
		System.out.println(sum.go(vals));
	}
}