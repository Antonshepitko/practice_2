package pract2.ex2;

public class Ball
{
	private double X = 0.0, Y = 0.0;

	public Ball(double x, double y)
	{
		X = x;
		Y = y;
	}

	public double getX()
	{
		return (X);
	}

	public double getY()
	{
		return (Y);
	}

	public void setX(double x)
	{
		this.X = x;
	}

	public void setY(double y)
	{
		this.Y = y;
	}

	public void setXY(double x, double y)
	{
		X = x;
		Y = y;
	}

	public void move(double xDisp, double yDisp)
	{
		X += xDisp;
		Y += yDisp;
	}

	public String toString()
	{
		return ("Ball @ (" + this.X + ", " +this.Y + ")");
	}
}