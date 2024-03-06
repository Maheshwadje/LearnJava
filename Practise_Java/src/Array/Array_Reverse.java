//Reverse given array-
package Array;

import java.util.Arrays;

public class Array_Reverse 
{

	public static void main(String[] args)
	{
		int age[] = new int[] {10,20,30,40};
		int age1[] =new int[age.length];
		int k = 0;
		for(int i = age.length-1; i>=0 ; i--)
		{
			age1[k]=age[i];
			k++;
		}
		System.out.println(Arrays.toString(age1));

	}

}
