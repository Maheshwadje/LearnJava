package practise;

public class String_vertical1 
{
	public static void main(String[] args) 
	{
		String input = "I love my wife";
		int a = input.length();
		for (int i = 0; i < a; i++) 
		{
			char output = input.charAt(i);
			System.out.println(output);
		}
	}
}
