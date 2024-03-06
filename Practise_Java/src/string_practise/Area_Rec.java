package string_practise;
import java.util.Scanner;

public class Area_Rec
{

	public static void main(String[] args)
	{
		int side[] = new int[4];
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i<=3; i++)
		{
			side[i] = input.nextInt();
		}
		 
		int Area = (side[0]+side[1]+side[2]+side[3]);
		System.out.println("Area of rectancle is " +Area);
	}

}
