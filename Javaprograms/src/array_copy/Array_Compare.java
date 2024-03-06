package array_copy;

import java.util.Arrays;

public class Array_Compare 
{
	public static void main(String[] args) 
	{
		int array1[] =new int[4]; 
		array1[0] = 10;
		array1[1] = 11;
		array1[2] = 12;
		array1[3] = 14;
		
		int array2[] =new int[4];
		array2[0] = 10;
		array2[1] = 11;
		array2[2] = 12;
		array2[3] = 13;
		
		if(Arrays.toString(array1).equals(Arrays.toString(array2)))
		{
			System.out.println("The arrays are equal");
		}
		else
		{
			System.out.println("The arrays are different");
		}
	}

}
