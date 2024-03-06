package Strings_practise;

public class String_Que {

	public static void main(String[] args) 
	{
		
		String name="surekha";
		boolean s0 = name.matches("s(.*)");
		boolean s1=	name.matches("(.*)u(.*)");
		boolean s2= name.contains("u");
		System.out.println(s0);
		System.out.println(s1);
		System.out.println(s2);
	}

}
