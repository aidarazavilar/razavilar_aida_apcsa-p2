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

	public void loadToys( String toys )
	{
		if (toyList.size() > 0)
		{
			if (getThatToy(toys) != null )
			{
				int count = getThatToy(toys).getCount();
				getThatToy(toys).setCount(count+1);
			}
			else
			{
				Toy toy = new Toy(toys);
				toy.setCount(1);
				toyList.add(toy);
			}
		}
		else 
		{
			Toy toy = new Toy(toys);
			toyList.add(toy);
			toy.setCount(toy.getCount()+1);
		}
		
		sortToysByCount();
	}
	
  
  	public Toy getThatToy( String nm )
  	{
  		for (int x = 0; x < toyList.size(); x++)
  		{
  			if (toyList.get(x).getName().equals(nm)) return toyList.get(x);
  		}
  		
  		return null;
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
  		int most = toyList.size() - 1;
  		Toy current;

  		for (int x = 0; x < toyList.size()-1; x++)
  		{
  			if (toyList.get(x).getCount() > toyList.get(most).getCount())
  			{
  				current = getThatToy(toyList.get(most).getName());
  				toyList.set(most, getThatToy(toyList.get(x).getName()));
  				toyList.set(x, current);
  			}
  		}
  	}    
  	  
	public String toString()
    {
		
	    return ""+toyList + "\n max == " + getMostFrequentToy();
	}
}
