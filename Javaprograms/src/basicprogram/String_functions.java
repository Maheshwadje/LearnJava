package basicprogram;

public class String_functions
{

	public static void main(String[] args)
	{
		String input = "My name is Mahesh";	
		//below function with turn above string in uppercase
		System.out.println(input.toUpperCase());
		String input1 = "My name is mahesh";
		//below function with turn above string in uppercase
		System.out.println(input.toLowerCase());
		//below function compare two string with case sensitivity
		System.out.println(input.equals(input1));
		//below function compare two string ignoring case sensitivity
		System.out.println(input.equalsIgnoreCase(input1));
		//below function print string from index3 to end
		String a = "1Mahesh2";
		System.out.println(a.substring(3));
		//below function print string from starting index to ending index-1
		System.out.println(a.substring(2, 5));
		//Below function checks weather a string ends with specified character
		System.out.println(a.endsWith(a));
		//Below function checks weather a string starts with specified character
		System.out.println(a.startsWith(a));
		
	}

}
