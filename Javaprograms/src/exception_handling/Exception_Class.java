package exception_handling;

public class Exception_Class 
{

	public static void main(String[] args)
	{
try {
		int c = 1/0;
	}

catch(ArithmeticException a1)
	{
		System.out.println("infinity cannot be stored in int data type, "
				+ "we have handled this using exception handline");	
	}
	
	}

}
