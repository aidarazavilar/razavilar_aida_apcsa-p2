//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	List<Integer> totals = new ArrayList<Integer>();
    	for (int[] row : m)
    	{
    		int sum = 0;
    		for (int x: row)
    		{
    			sum = sum + x;
    		}
    		totals.add(sum);
    	}
		return totals;
    }
}
