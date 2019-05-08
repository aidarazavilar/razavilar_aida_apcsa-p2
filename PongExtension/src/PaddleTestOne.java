//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.awt.Color;

class PaddleTestOne
{
	public static void main( String args[] )
	{
		Paddle one = new Paddle();
		out.println(one);
		
		Paddle two = new Paddle(200,180);
		out.println(two);
		
		Paddle three = new Paddle(200,200,60);
		out.println(three);
		
		Paddle four = new Paddle(200,200,60,100,16);
		out.println(four);
		
		Paddle five = new Paddle(200,200,60,40, Color.GREEN,12);
		out.println(five);
		
		
		out.println(four.equals(five));		
		
		out.println(five.equals(five));										
	}
}