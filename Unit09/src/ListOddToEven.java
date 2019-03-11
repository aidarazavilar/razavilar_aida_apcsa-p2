//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		for (int x=0; x<ray.size(); x++)
			if (ray.get(x)%2==1)
			{	
				for (int y= ray.size()-1; y>x; y--)
				{	
					if (ray.get(y)%2==0)
					{
						return y-x;	
					}	
				}
			}
		
return -1;
	}
}