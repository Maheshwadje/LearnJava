package assert1;

import java.util.Scanner;

public class Assert
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter input values" );
		int input = s1.nextInt();
		
		assert input > 10;
		
	}

}
