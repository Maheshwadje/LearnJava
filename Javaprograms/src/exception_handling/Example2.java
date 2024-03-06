package exception_handling;

import java.util.Arrays;

public class Example2 
{

	public static void main(String[] args) 
	{
		int rollno[] = new int[3];
		rollno[0] = 21;
		rollno[1] = 21;
		rollno[2] = 21;
		try {
		rollno[3] = 21;
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("AIOBE");
		}
		catch(NullPointerException a2)
		{
			System.out.println("NPE");
		}
		catch(ArithmeticException a3)
		{
			System.out.println("AE");
		}
		finally
		{
			System.out.println("No matter what I am always there");
		}
		System.out.println(Arrays.toString(rollno));
				

	}

}
