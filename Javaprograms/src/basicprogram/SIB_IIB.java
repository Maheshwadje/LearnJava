package basicprogram;

public class SIB_IIB
{
	SIB_IIB()
	{
		System.out.println("This is constructor");
	}
	static
	{
		System.out.println("This is SIB");
	}
	static
	{
		System.out.println("This is SIB1");
	}
	{
		System.out.println("This is IIB");
	}
	{
		System.out.println("This is IIB1");
	}

	public static void main(String[] args)
	{
		System.out.println("This is main method");
		new SIB_IIB();
		//new SIB_IIB();
	}
}
