//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{

		setNum(num);

	}

	public void setNum(int num)
	{
		number = num;


	}
	
	private int greatestCommonFactor(int a, int b, int c)
{
		
		//condition 3: GCF for all is no greater than 1
		int min = Math.min(a, Math.min(b, c));
		
		for (int x = min; x > 0; x--)
		{
            if ((a % x == 0) && (b % x == 0)) {
                for (int y = x; y > 0; y--) {
                    if ((x % y == 0) && (c % y == 0)) {
                        return y;
                    }
                }
            }
		}

		return 2;
	}

	public String toString()
	{
		String output = "";
		
		for (int a = 1; a <= number; a++) 
		{
			for (int b = a+1; b <= number; b++)
			{
				for (int c = b+1; c <= number; c++)
				{
					//condition 1: a^2 + b^2 == c^2
					if (Math.pow(a, 2)+Math.pow(b, 2) == Math.pow(c, 2))
					{
						//condition 2: a odd, b even; a even, b odd; c odd
						if (((a%2==1 && b%2==0) || (a%2==0 && b%2==1)) && c%2 == 1)
						{
							//condition 3
							if (greatestCommonFactor(a, b, c) <= 1)
							{
								output = output + a + " " + b + " " + c +"\n";
							}
						}
					}
				}
			}
		}
		
		return output;
	}
}