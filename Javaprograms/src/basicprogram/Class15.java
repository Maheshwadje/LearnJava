//SIB, IIB
package basicprogram;
public class Class15 
{
	Class15(int a)
	{
		System.out.println("This is constructor");
	}
	static
	{
		System.out.println("This is SIB");
	}
	{
		System.out.println("This is IIB");
	}

	public static void main(String[] args)
	{
		System.out.println("This is main method");
		new Class15(10);
	}

}
