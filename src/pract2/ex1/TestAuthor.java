package pract2.ex1;

import java.io.*;

public class TestAuthor
{
	public static void main(String[] args)
	{
		Author Anton = new Author("Anton", "antonshepitko99@gmail.com", 'm');

		PrintStream printr
				= new PrintStream(System.out);

		printr.println(Anton.getName());
		printr.println(Anton.getEmail());
		Anton.setEmail("antonshepitko@mail.ru");
		printr.println(Anton.getEmail());
		printr.print((Anton.getGender()));
		printr.println();
		printr.println(Anton.toString());
	}
}