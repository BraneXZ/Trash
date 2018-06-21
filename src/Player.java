import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;

//Player Class
//Stores location of player within the playing field
//Will also allow movement of player character

public class Player extends JPanel
{
	private Coordinate playerXY;
	private int playerMS;
	
	public Player()
	{
		playerMS = 1;
		playerXY = new Coordinate(0,50);
		
		
	}
	public void setMS(int a)
	{
		playerMS = a;
	}
	
	public void setXY(int x, int y)
	{
		playerXY.setX(x);
		playerXY.setY(y);
	}
	
	public Coordinate getCord()
	{
		return playerXY;
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		loadPlayer(g);
	}
	public void loadPlayer(Graphics g)
	{
		g.drawRect(playerXY.getX(), playerXY.getY(), 10, 4);
		g.setColor(Color.WHITE);
		
		Toolkit.getDefaultToolkit().sync();
	}
}
