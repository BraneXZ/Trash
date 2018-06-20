
//Player Class
//Stores location of player within the playing field
//Will also allow movement of player character

public class Player
{
	private Coordinate playerXY;
	private int playerMS;
	
	public Player()
	{
		playerMS = 1;
		playerXY = new Coordinate(0,0);
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
}
