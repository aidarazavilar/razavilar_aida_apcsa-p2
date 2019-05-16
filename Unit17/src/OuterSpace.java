//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
   private AlienHorde horde;
	private Bullets shots;
	private int bull=0;
	
	private boolean gameOver;
	private boolean dead;

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
		ship = new Ship(365,450,50,50,2);
		horde = new AlienHorde(20);
		shots = new Bullets();
		gameOver = false;
		dead = false;

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		
		ship.draw(graphToBack);

		if(keys[0] == true && !gameOver)
		{
			if(ship.getX() > 10) ship.move("LEFT");
		}

		//add code to move Ship, Alien, etc.
		if(keys[1] == true)
		{
			if(ship.getX() < 720 && !gameOver) ship.move("RIGHT");
		}
		
		if(keys[2] == true)
		{
			if(ship.getY() > 10 && !gameOver) ship.move("UP");
		}
		
		if(keys[3] == true)
		{
			if(ship.getY() < 500 && !gameOver) ship.move("DOWN");
		}
		
		
		if(keys[4] == true)
		{
			//Shoot bullets
			if (bull<25) {
				Ammo ammo = new Ammo(ship.getX() + 20,ship.getY() - 10,3);
				shots.add(ammo);
				keys[4] = false;
				bull++;
				System.out.println("Bullets Left " + (25-bull));
			}
			else {
				gameOver=true;
			}
		
			
		}
		
		shots.drawEmAll(graphToBack);
		horde.drawEmAll(graphToBack);
		
		for (int i = 0; i < shots.getList().size(); i++)
		{
			Ammo a = shots.getList().get(i);
			if (a.getY() < 0) shots.getList().remove(i);
			
			if (((a.getX() <= ship.getX() + ship.getWidth() + Math.abs(a.getSpeed()) &&
					a.getX() > ship.getX()) || 
					(a.getX() + a.getWidth() >= ship.getX() - Math.abs(a.getSpeed())) && 
					(a.getX() + a.getWidth() < ship.getX()+ship.getWidth())) && 
					((a.getY() >= ship.getY() && 
					a.getY() <= ship.getY() + ship.getHeight()) ||
					(a.getY() + a.getHeight() >= ship.getY() &&
					a.getY() + a.getHeight() < ship.getY() + ship.getHeight())) && a.getSpeed() < 0)
			{
				shots.getList().remove(i);
				gameOver = true;
			}
		}
		
		shots.moveEmAll();
		horde.moveEmAll();
	if(!gameOver)
	{
		
		if (horde.toString().equals("LOST") || Integer.parseInt(horde.toString()) >= ship.getY()) 
		{
			dead = true;
			gameOver = true;
		}
	}

		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
horde.removeDeadOnes(shots.getList());
		
		if(horde.toString().equals("NONE")) gameOver = true;
		
		if (gameOver)
		{
			//print game over
			graphToBack.setColor(Color.BLACK);
			graphToBack.fillRect(0, 0, 800, 600);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Game Over!", 350, 300);
			if (!dead)
			{
				graphToBack.drawString(" You Won!!", 350, 330);
			}
			else graphToBack.drawString("The Aliens Have Invaded! You Lost :(", 330, 330);
		}


		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

