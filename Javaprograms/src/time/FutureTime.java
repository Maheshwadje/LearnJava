package time;

import java.util.Date;

public class FutureTime 
{
	public static void main(String[] args)
	{
		
		Date d1 = new Date();//current time in epoch
		System.out.println(d1.getTime());
		Date d2 = new Date();
		System.out.println(d2);//current date and time in Thu Feb 08 20:27:40 IST 2024
		String time = d2.toString();
		String date = time.substring(8, 10);
		System.out.println(date);
		String month = time.substring(4, 7);
		System.out.println(month);
		String year = time.substring(24);
		System.out.println(year);
		System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
		System.out.println(date.concat("/").concat(month).concat("/").concat(year));
		System.out.println(date.concat("-").concat(month).concat("-").concat(year));

	}

}
