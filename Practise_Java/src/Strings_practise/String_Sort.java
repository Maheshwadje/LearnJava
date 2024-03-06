//How many char? and how many digit
package Strings_practise;
import java.util.Arrays;

public class String_Sort 
{

	public static void main(String[] args)
	{
		String name = "world is full of beautiful people";
		int char1 = 0;
		
		char a1[] = name.toCharArray();
		
		System.out.println(Arrays.toString(a1));//it will print in array format
		
		for(int i = 0;i<a1.length;i++)
		{
		boolean solution = Character.isAlphabetic(a1[i]);
			if(solution == true)
			{
				char1++;
			}
		}
		System.out.println(char1);

		

	}

}
