package pract2.ex1;

public class Author
{
	private String Name, Email;
	private char Gender;

	public Author(String name, String email, char gender)
	{
		Name = name;
		Email = email;
		Gender = gender;
	}

	public String getName()
	{
		return (Name);
	}

	public String getEmail()
	{
		return (Email);
	}

	public void setEmail(String email)
	{
		this.Email = email;
	}

	public char getGender()
	{
		return (Gender);
	}

	public String toString()
	{
		return (this.Name + " " + this.Email + " " +  this.Gender);
	}
}