//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter(' ');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		char currentLetter = letter;
		int letterNum = amount;
		int subtractColumn = 0;
		int subtractRow = 0; 
		int rowNum = amount;

		for (int row = amount; row > 0; row--)
		{
			
			for (int column = rowNum; column > 0; column--)
			{
				while (letterNum != 0)
				{
					output = output + currentLetter;
					letterNum--;
				}
				
				output = output + " ";
				if (currentLetter == 90) 
				{
					currentLetter = 65;
				}
				else
				{
					currentLetter = (char)(currentLetter + 1);
				}
				
				subtractColumn++;
				letterNum = amount - subtractColumn;

			}
			
			currentLetter = letter;
			letterNum = amount;
			subtractColumn = 0;
			subtractRow++;
			rowNum = amount - subtractRow;
			
			output = output + "\n";
		}
		return output;
	}
}