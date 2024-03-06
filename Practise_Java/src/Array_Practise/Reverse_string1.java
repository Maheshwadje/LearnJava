package Array_Practise;
public class Reverse_string1 
{
	public static void main(String[] args) 
	{
		String input = "Mahesh";
		for(int i =input.length()-1; i>=0; i--)
		{
			char c1 = input.charAt(i);
			System.out.print(c1);
		}
	}

}
