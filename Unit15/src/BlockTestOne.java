import java.awt.Color;

public class BlockTestOne {
	
	public static void main( String args[] )
	{
		Block one = new Block();
		System.out.println(one);

		Block two = new Block(100,100,60,60);
		System.out.println(two);

		Block three = new Block(700, 700,30,30,Color.RED);
		System.out.println(three);

		Block four = new Block(900,100,40,120, Color.GREEN);
		System.out.println(four);
		
		System.out.println(one.equals(two));
		System.out.println(one.equals(one));		
	}

}
