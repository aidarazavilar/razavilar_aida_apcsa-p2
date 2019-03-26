//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for (int x=0; x<rows; x++)
		{
			for (int y=0; y<cols; y++)
			{
				String next = vals[(int)(Math.random()*(vals.length-1))];
				grid[x][y]= next;
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int max = 0;
		String m = "";
		for (String s: vals)
		{
			if (countVals(s)>max)
			{
				m = s;
				max = countVals(s);
			}
		System.out.println(s + " count is " + countVals(s) );
		}
		if (max>0)
		{
			return "\n" + m + " occurs the most.";
		}
		return "nothing yet";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for (int x= 0; x<grid.length; x++)
		{
			for (int y=0; y<grid[x].length; y++)
			{
				if ((grid[x][y].equals(val))) 
				{
					count++;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for (String[] x : grid)
		{
			for (String y : x)
			{
				output += " "+ y;
			}
			output += "\n";
		}
		
		return output;
	}
}