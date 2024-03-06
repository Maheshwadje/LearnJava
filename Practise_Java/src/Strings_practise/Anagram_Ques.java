package Strings_practise;

import java.util.Arrays;

public class Anagram_Ques 
{

	public static void main(String[] args)
	{
		String a1 = "listen";
		String a2 = "silent";
		
		if(a1.length()!=a2.length())//check by length of string
		{
			System.out.println("The given string are not anagram");
		}
		else
		{
			char char1[] = a1.toCharArray();
			Arrays.sort(char1);
//			System.out.println(char1);
			char char2[] = a2.toCharArray();
			Arrays.sort(char2);
//			System.out.println(char2);
		
		if(Arrays.equals(char1, char2)==true)
		{
			System.out.println("The given two strings are anagram");
		}
		else
		{
			System.out.println("The given two strings are not anagram");
		}

	}


	}
}	
