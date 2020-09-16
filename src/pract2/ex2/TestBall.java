package pract2.ex2;

import java.io.*;

public class TestBall
{
	public static void main(String[] args)
	{
		PrintStream printr = new PrintStream(System.out);

		Ball ball1 = new Ball(1,2);
		Ball ball2 = new Ball(12,423);
		printr.println(ball1);
		printr.println(ball2);
		ball1.move(11,22);
		ball2.move(2342,4554);
		printr.println(ball1);
		printr.println(ball2);
	}
}