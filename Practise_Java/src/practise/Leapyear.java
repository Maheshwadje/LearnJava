package practise;
public class Leapyear
{
	public static void main(String[] args) 
	{
		int year1 = 2021;
		int year2 = 2024;
		if(year1 % 4 <= 0)
		{
			System.out.println("year1 is leap year");
		}
		else if(year2 % 4 <= 0)
		{
			System.out.println("year 2 is leap year");
		}
		else
		{
			System.out.println("year1 is normal year");
		}

	}

}
