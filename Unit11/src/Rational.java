//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int num;
	private int den;

	//write two constructors
	public Rational()
	{
		setRational(1, 1);
	}
	
	public Rational(int n, int d)
	{
		setRational(n, d);
	}


	//write a setRational method
	public void setRational(int n, int d)
	{
		setNum(n);
		setDen(d);
	}


	//write  a set method for numerator and denominator
	public void setNum(int n)
	{
		num = n;
	}
	
	public void setDen(int d)
	{
		den = d;
	}
	
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		num = (num*other.getDen())+(other.getNum()*den);
		den = (den*other.getDen());	


		reduce();
	}

	private void reduce()
	{
		int div= gcd(num, den);
		num = num/div;
		den = den/div;


	}

	private int gcd(int numOne, int numTwo)
	{
		int div=1;
		for (int x=1; x<=numOne && x<=numTwo; x++) {
			if(numOne%x==0 && numTwo%x==0) {
				div=x;
			}
		}
		return div;
	}

	public Object clone ()
	{
		Rational object = new Rational (num,den);
		return object;
	}


	//ACCESSORS

	public int getNum()
	{
		return num;
	}
	
	public int getDen()
	{
		return den;
	}
	
	
	public boolean equals( Object obj)
	{
		Rational object = (Rational)obj;
		if (num*object.getDen() == den*object.getNum()) return true;
		return false;


	}

	public int compareTo(Rational other)
	{

		if (num*other.getDen() == den*other.getNum()) return 1;
		return -1;
	}
	
	//write  toString() method
	public String toString()
	{
		return ""+num + "/" + den;
	}
	
	
}