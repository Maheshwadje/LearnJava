package practise;

import java.util.Scanner;

public class Factorial_Ques 
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = s1.nextInt();
		
		int factorial = 1;
		
		for(int i = 1; i<=num;i++)
		{
			factorial = factorial*i;
			
		}
		System.out.println("Factorial of number " +factorial);

	}

}
