
//Coordinates of player and all objects in play field

public class Coordinate 
{
	private int xPos;
	private int yPos;
	
	public Coordinate()
	{
		xPos =0;
		yPos= 0;
	}
	public Coordinate(int x,int y)
	{
		xPos =x;
		yPos= y;
	}
	
	public void setX(int a)
	{
		xPos= a;
	}
	public void setY(int a)
	{
		yPos = a;
	}
	public int getX()
	{
		return xPos;
	}
	public int getY()
	{
		return yPos;
	}
}
