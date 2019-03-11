//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds
		
		if (spot < pups.length)
		{
			Dog dog= new Dog(age,name);
			pups[spot]= dog;
		}
			
	}

	public String getNameOfOldest()
	{
		int old = 0;
		for(int x = 0;x < pups.length;x++)
		{
			if (pups[x].getAge() > pups[x+1].getAge())
			{
				old = x;
			}
			
		}
		return pups[old].getName();
	}

	public String getNameOfYoungest()
	{
		int young = 0;
		for(int x = 0;x<pups.length;x++)
			
		{
			if (pups[x].getAge() < pups[x+1].getAge())
			{
				young = x;
			}
		
		}
		
		return pups[young].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}