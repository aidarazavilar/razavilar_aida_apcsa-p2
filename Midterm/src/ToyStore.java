//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys)
	{
		int loc = toys.indexOf(' ');
		String currentToy = "";
		String output = toys;
		Toy match = null; 
		while (loc != -1)
		{
			currentToy = output.substring(0,loc);
			output = output.substring(loc + 1);
			loc = output.indexOf(' ');
		
			if (toyList.size() > 0)
			{
				for (int x = 0; x < toyList.size(); x++)
		  		{
		  			if (toyList.get(x).getName().equals(currentToy))
		  			match = toyList.get(x);
		  		}
		  		
				if (match != null )
				{
					int count = match.getCount();
					match.setCount(count+1);
				}
				else
				{
					Toy toy = new Toy(currentToy);
					toy.setCount(1);
					toyList.add(toy);
				}
			}
			else 
			{
				Toy toy = new Toy(currentToy);
				toyList.add(toy);
				toy.setCount(1);
			}
			
		}
	
		
		sortToysByCount();
	}

  
  	public String getMostFrequentToy()
  	{
  		int most = 0;
  		
  		for (int x = 1; x < toyList.size(); x++)
  		{
  			if (toyList.get(x).getCount() > toyList.get(most).getCount())
  			{
  				most = x;
  			}
  		}
  		return toyList.get(most).getName();
  	}   
  
  	public void sortToysByCount()
  	{
  		int most = 0;
  		Toy current = null;

  		for (int x = 0; x < toyList.size()-1; x++)
  		{
  			if (toyList.get(x).getCount() > toyList.get(most).getCount())
  			{
  				current = (toyList.get(most));
  				toyList.set(0, toyList.get(x));
  				toyList.set(x, current);
  			}
  		}
  	}
  	  
	public String toString()
    {
		
	    return ""+toyList + "\n max == " + getMostFrequentToy();
	}
}
