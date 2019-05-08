import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class BlockTestTwo extends Canvas {

	public BlockTestTwo()
	{
		setBackground(Color.WHITE);
	}

	public void paint(Graphics window)
	{
		Block one = new Block();
		one.draw(window);

		Block two = new Block(100,100,60,60);
		two.draw(window);

		Block three = new Block(700,700,30,30,Color.RED);
		three.draw(window);

		two.draw(window, Color.WHITE);

		Block four = new Block(900,100,40,120, Color.GREEN);
		four.draw(window);
	}
}
