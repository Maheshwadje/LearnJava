package array_copy;

import java.util.Arrays;

public class Copy_array 
{
	public static void main(String[] args)
	{
		int array1[] = new int[] {76,78,67,46};
		int array2[] = new int[4];
		
		for(int i = 0;i<array1.length; i++)
		{
			array2[i] = array1[i];
		}
		System.out.println(Arrays.toString(array2));
	}

}
