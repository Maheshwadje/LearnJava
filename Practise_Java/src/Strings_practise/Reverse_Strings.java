package Strings_practise;

public class Reverse_Strings
{

	public static void main(String[] args) 
	{
		String input = "Mahesh";
		String output = "";
		for(int i = input.length()-1; i>=0; i--)
		{
			char c1 = input.charAt(i);
			output = output+c1;
		}
		System.out.println(output);
		if(input.equals(output))
		{
			System.out.println("The given word palindrome");
		}
		else
		{
			System.out.println("The given word is not a palindrome");
		}

	}

}
