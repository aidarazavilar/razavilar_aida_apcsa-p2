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

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int rScore;
	private int lScore;
	private boolean gameOver;

	public Pong()
	{
		ball = new Ball(100,350,15,15,Color.BLUE,3,3);
		leftPaddle = new Paddle(20,350,20,50,Color.YELLOW,5);
		rightPaddle = new Paddle(740,350,20,50,Color.YELLOW,5);

		keys = new boolean[4];
		rScore = 0;
		lScore = 0;
		
		gameOver = false;
	    
    	setBackground(Color.WHITE);
    	setForeground(Color.BLACK);
		setVisible(true);

		this.addKeyListener(this);	
		new Thread(this).start();	//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
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


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);


		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<=750))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			
			if (ball.getX() < leftPaddle.getX()) rScore++;
			else if (ball.getX() + ball.getWidth() > rightPaddle.getX() + rightPaddle.getWidth()) lScore++;
			
			gameOver = true;
		}
		//see if the ball hits the top or bottom wall 
		if(!(ball.getY()>=10 && ball.getY()<=450))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

//+Math.abs(ball.getXSpeed())



		//see if the ball hits the left paddle
		
		if (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth()
		&& (ball.getY() >= leftPaddle.getY() && 
		ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight() ||
		ball.getY() + ball.getHeight() >= leftPaddle.getY() &&
		ball.getY() + ball.getHeight() < leftPaddle.getY() + leftPaddle.getHeight()))
{
	if (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - (Math.abs(ball.getXSpeed()))) ball.setYSpeed(-ball.getYSpeed());
	else ball.setXSpeed(-ball.getXSpeed());
}

//- Math.abs(ball.getXSpeed())
//see if the ball hits the right paddle
if (ball.getX() >= rightPaddle.getX() -rightPaddle.getWidth()
&& (ball.getY() >= rightPaddle.getY() && 
ball.getY() <= rightPaddle.getY() + rightPaddle.getHeight() ||
ball.getY() + ball.getHeight() >= rightPaddle.getY() &&
ball.getY() + ball.getHeight() < rightPaddle.getY() + rightPaddle.getHeight()))
{
	if (ball.getX() >= rightPaddle.getX() + (Math.abs(ball.getXSpeed()))) ball.setYSpeed(-ball.getYSpeed());
	else ball.setXSpeed(-ball.getXSpeed());
}
		
		//see if the paddles need to be moved

if(keys[0] == true)
{
	//move left paddle up and draw it on the window
	leftPaddle.moveUpAndDraw(graphToBack);
}
if(keys[1] == true)
{
	//move left paddle down and draw it on the window
	leftPaddle.moveDownAndDraw(graphToBack);
}
if(keys[2] == true)
{
	rightPaddle.moveUpAndDraw(graphToBack);
}
if(keys[3] == true)
{
	rightPaddle.moveDownAndDraw(graphToBack);
}

graphToBack.setColor(Color.WHITE);
graphToBack.fillRect(350, 500, 100, 100);
//need to stop score

graphToBack.setColor(Color.RED);

graphToBack.drawString("Right Score: " + rScore, 350, 550);
graphToBack.drawString("Left Score: " + lScore, 350, 525);

twoDGraph.drawImage(back, null, 0, 0);

}
	

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}