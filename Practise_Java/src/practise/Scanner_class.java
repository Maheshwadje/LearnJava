//take two input 1 and 100 and print in between values
package practise;
import java.util.Scanner;

public class Scanner_class 
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("print first number ");
		int a = s1.nextInt();
		for(int i = 2;i<=99;i++)
		{
			System.out.println(i);
		}
		System.out.println("print last number ");
		int b = s1.nextInt();

	}

}
