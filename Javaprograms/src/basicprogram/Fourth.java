package basicprogram;

public class Fourth {
	Fourth()
	{
		System.out.println("C1 called");
	}
	Fourth(int a,int b)
	{
		System.out.println("C2 called");
	}
	Fourth(int b,double a)
	{
		System.out.println("C3 called");
	}
	Fourth(double b, int a)
	{
		System.out.println("C4 called");
	}

	public static void main(String[] args)
	{
		new Fourth();
		new Fourth(1,2);
		new Fourth(4,1.2);
		new Fourth(3.4,5);

	}

}
