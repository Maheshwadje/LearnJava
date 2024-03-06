package time;
import java.util.*;
public class DateClass {

	public static void main(String[] args)
	{
		//Epoch time
		Date d1 = new Date();
		System.out.println(d1.getTime());
		
		//Human understandable time
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
		
		//Find Future date
		Date d3 = new Date(d1.getTime()+1000*60*60*24*5);
		System.out.println("This is my future date " +d3);
		
		//Find Past date
		Date d4 = new Date(d1.getTime()-(1000*60*60*24*5));
		System.out.println("This is my past date " +d4);
	}

}
