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
		String list = toys;
		int loc =list.indexOf(' ');
		String currentToy= "";
		
		int spot =0;
		
		while (loc > -1)
		{
			currentToy = (list.substring(0, loc));
			
			if (toyList.size() > 0)
			{
				for (int x = 0; x < toyList.size(); x++)
				{
					if (getThatToy(currentToy) != null)
					{
						int count = getThatToy(currentToy).getCount();
						toyList.get(x).setCount(count+1);
					}
					else
					{
						Toy toy = new Toy(currentToy);
						toy.setCount(1);
						toyList.add(spot, toy);
						spot++;
					}
				}
			}
			else 
			{
				Toy toy = new Toy(currentToy);
				toyList.add(spot, toy);
				toy.setCount(toy.getCount()+1);
				spot++;
			}
			
			list = list.substring(loc+1);
			loc = list.indexOf(' ');
		}
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
  		for (int x = 0; x < toyList.size(); x++)
  		{
  			
  		}
  		return "";
  	}  
  
  	public void sortToysByCount()
  	{
  	}  
  	  
	public String toString()
	{
		 return ""+toyList;
	}
}