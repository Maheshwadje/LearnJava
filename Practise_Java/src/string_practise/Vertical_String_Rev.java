package string_practise;

public class Vertical_String_Rev 
{

	public static void main(String[] args) 
	{
		String w = "Wadje";
		
		for(int i = w.length()-1 ; i >=0 ; i--)
		{
			char c1 = w.charAt(i);
			System.out.println(c1);
		}

	}

}
