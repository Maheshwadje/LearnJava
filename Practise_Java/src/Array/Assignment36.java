package Array;
public class Assignment36 
{

	public static void main(String[] args)
	{
		int a1[] = new int[4];
		a1[0]=33;
		a1[1]=34;
		a1[2]=45;
		a1[3]=56;
		for(int i = 0; i<=3;i++) 
		{
			if(a1[i]==34)
			{
				System.out.println("number 34 is present");
				System.out.println("the index of 34 is " +i);
			}
			
		}
	}

}
