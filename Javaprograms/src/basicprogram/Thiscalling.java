package basicprogram;
public class Thiscalling
{
	Thiscalling()
	{
		this(2);
		System.out.println("1");
	}
	Thiscalling(int a)
	{
		this('c');
		System.out.println("2");
	}
	Thiscalling(char c)
	{
		this("mahesh");
		System.out.println("3");
	}
	Thiscalling(String s)
	{
		System.out.println("4");
	}
	Thiscalling(int a, int b, int c)
	{
		this();
		System.out.println("5");
	}

	public static void main(String[] args) 
	{
		new Thiscalling(10,20,25);
	}

}
