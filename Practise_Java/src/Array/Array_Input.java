//Take human input for array and print array
package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Input 
{
	public static void main(String[] args) 
	{
		int rollno[] = new int[4];
		Scanner input = new Scanner(System.in);
		//rollno[0] = input.nextInt();
		for(int i = 0; i<=3; i++)
		{
			rollno[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(rollno));

	}

}
