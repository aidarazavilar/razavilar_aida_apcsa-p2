//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int z = 0;
		for (int x=0; x<ray.length; x++)
		{
			if (ray[x]%2 == 1)
			{
				for (int y = x+1; y<ray.length; y++);
				{
					z += 1;
					if (ray[z]%2 == 0)
					{
							return z - x;
					}
				}
			}
		}
		return -1;
	}
}