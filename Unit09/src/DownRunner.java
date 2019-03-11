import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{	
		ListDown down = new ListDown();
		int[] array= new int[]{7,8,9,10,11};
		
		ArrayList<Integer> vals;
		vals = new ArrayList<Integer>();
		
		for (int x=0; x<array.length; x++)
		{
			vals.add(array[x]);
		}
		
		System.out.println(down.go(vals));
		
	}
}