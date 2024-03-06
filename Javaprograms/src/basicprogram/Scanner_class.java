package basicprogram;
import java.util.Scanner;

public class Scanner_class
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Number1 is ");
		int number1 = s1.nextInt();
		System.out.println("Number1 is ");
		int number2 = s1.nextInt();
		int sum = number1+number2;
		System.out.println("Addition is " +sum);
		s1.close();
		

	}

}
