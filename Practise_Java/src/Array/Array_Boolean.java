package Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array_Boolean 
{
	public static void main(String[] args) 
	{
		boolean b1[] = new boolean[4];
		Scanner input = new Scanner(System.in);
		for(int i = 0; i <=3; i++)
		{
			b1[i] = input.nextBoolean();
		}
		System.out.println(Arrays.toString(b1));
	}

}
