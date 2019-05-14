//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
	boolean right = false, left = false, down = false;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
		int x = 0;
		int y = 0;

		for (int j = 0; j < (size/10); j++) 
		{
			x = 0;

			for(int i = 0; i < 10; i++)
			{
				Alien a = new Alien(x, y, 50, 50,1);
				aliens.add(a);
				x += 60;
			}
			y += 60;
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien a : aliens) {
			a.draw(window);
		}
	}

	public void moveEmAll()
	{
		if (aliens.size() > 0)
		{
			for (Alien a : aliens)
			{
				if (a.getX() == 0) 
				{
					right = true;
					left = false;
					down = true;
				}
				else if (a.getX()+a.getWidth() == 785) 
				{
					right = false;
					left = true;
					down = true;
				}
								
				if(right) a.move("RIGHT");
				if(left) a.move("LEFT");
				if(down)
				{
					for (Alien b : aliens)
					{
						for(int i = 0; i < 10; i++)	b.move("DOWN");
					}
					down = false;
				}
			}
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		if (shots.size() > 0)
		{
			for (int i = 0; i < shots.size(); i++)
			{
				for (int j = 0; j < aliens.size(); j++)
				{
					Ammo b = shots.get(i);
					Alien a = aliens.get(j);
					if (((b.getX() <= a.getX() + a.getWidth() + Math.abs(b.getSpeed()) &&
							b.getX() > a.getX()) || 
							(b.getX() + b.getWidth() >= a.getX() - Math.abs(b.getSpeed())) && 
							(b.getX() + b.getWidth() < a.getX()+a.getWidth())) && 
							((b.getY() >= a.getY() && 
							b.getY() <= a.getY() + a.getHeight()) ||
							(b.getY() + b.getHeight() >= a.getY() &&
							b.getY() + b.getHeight() < a.getY() + a.getHeight())))
					{
						shots.remove(i);
						aliens.remove(a);
					}
					if (shots.size() == 0) break;
				}
			}
		}
	}

	public String toString()
	{
		if (aliens.size() == 0) return "NONE";
		for (Alien a : aliens)
		{
			if (a.getY() + a.getHeight() >= 500) return "LOST";
			return ""+(a.getHeight()+a.getY());
		}
		return "";
	}
}
