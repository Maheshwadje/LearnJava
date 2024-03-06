package Strings_practise;

public class String_Function 
{
	public static void main(String[] args) 
	{
		String a = "Mahesh";
		String b = "I love my name mahesh";
		String c = "mahesh";
		String d = "I";
		System.out.println(a.charAt(0));
		System.out.println(b.indexOf('l'));
		System.out.println(a.concat(" ").concat(b));
		System.out.println(b.trim());
		if(a.equals(c))
		{
			System.out.println("Strings are same");
		}
		if(a.equalsIgnoreCase(c))
		{
			System.out.println("String are same and ignoring cases");
		}
		else
		{
			System.out.println("String are different");
		}
		System.out.println(a.toLowerCase());
		System.out.println(b.toUpperCase());
		System.out.println(c.substring(4));
		System.out.println(c.substring(2, 6));
		System.out.println(b.endsWith(c));
		System.out.println(b.startsWith(d));
	}

}
