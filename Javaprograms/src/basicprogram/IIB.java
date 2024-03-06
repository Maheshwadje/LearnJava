package basicprogram;

public class IIB 
{
	{
		System.out.println("This is SIB");
	}
	{
		System.out.println("This is SIB1");
	}

	public static void main(String[] args) 
	{
		System.out.println("This is main method");		
		new IIB();
		new IIB();//we have to call multiple IIB's by creating multiple object
	}

}
