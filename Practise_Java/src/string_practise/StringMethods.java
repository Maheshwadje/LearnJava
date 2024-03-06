package string_practise;

public class StringMethods 
{

	public static void main(String[] args) 
	{
		String b = " Mahesh";
		String d = "Wadje ";
//		find length of string
		int c = b.length();
		System.out.println("The length of string " +c);
//		Find index of String
		System.out.println("The index is " +b.indexOf('h'));
//		Combine two strings
		System.out.println(b.concat(" ").concat(d));
//		Trim given string - remove extra space
		System.out.println(d.trim());
		System.out.println(b.trim());
//		Uppercase string
		System.out.println(b.toUpperCase());
//		Lowercase string
		System.out.println(b.toLowerCase());
//		check if strings are equal
		System.out.println(b.equals(d));
//		substring with 1 parameter
		System.out.println(b.substring(3));
//		substring with two parameter
		System.out.println(d.substring(3, 5));
//		endswith string or char
		System.out.println(b.endsWith("esh"));
//		starts with string or char
		System.out.println(d.startsWith("Wa"));
		
		

	}

}
