import java.awt.Color;

public class BallTestOne {
	
	public static void main( String args[] )
	{
		Ball one = new Ball();
		System.out.println(one);
		
		Ball two = new Ball(200,200);
		System.out.println(two);
		
		Ball three = new Ball(200,200,90,500);
		System.out.println(three);
		
		Ball four = new Ball(200,200,90,100,Color.BLUE);
		System.out.println(four);
		
		Ball five = new Ball(200,200,90,100,Color.BLUE,10,12);
		System.out.println(five);
		
									//x, y, wid, ht, color, xSpd, ySpd
		Ball six = new Ball(200,200,90,100,Color.BLUE ,10,12);
		System.out.println(six);		
		
		System.out.println(four.equals(six));		
		
		System.out.println(five.equals(five));	
		
	}
}

