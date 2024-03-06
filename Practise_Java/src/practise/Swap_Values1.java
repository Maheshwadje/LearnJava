//Swap values using 2 variables
package practise;
public class Swap_Values1 
{

	public static void main(String[] args) 
	{
		int a = 300;
		int b = 600;
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("value of a " +a);
		System.out.println("value of b " +b);

	}

}
