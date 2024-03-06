//Method over-riding
package basicprogram;

class Sambhaji
{
	void add()
	{
		int a = 100;
		int b = 200;
		int c = a+b;
		System.out.println(c);
	}
	
}

public class Mahesh extends Sambhaji
{
	void add()
	{
		super.add();
		int a = 200;
		int b = 300;
		int c = a+b;
		System.out.println(c);
		
	}

	public static void main(String[] args) 
	{
		Mahesh m1 = new Mahesh();
		m1.add();
	}

}
