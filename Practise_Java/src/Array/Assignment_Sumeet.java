package Array;

public class Assignment_Sumeet
{

	public static void main(String[] args)
	{
		int a1[]=new int[] {34, 1, 34, 2};
		int counter = 0;
		for(int i = 0; i<a1.length;i++) 
		{
			if(a1[i]==34)
			{
				System.out.println("The number 34 is present");				
				counter++;
			}
		}
		System.out.println("counter = " +counter);
	}
}