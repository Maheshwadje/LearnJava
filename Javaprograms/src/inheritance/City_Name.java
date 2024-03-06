package inheritance;

class State_Name
{
	static void Maharashtra()
	{
		System.out.println("MH");
	}
	void Goa()
	{
		System.out.println("Goa");
	}
}

public class City_Name extends State_Name
{
	static void Pune()
	{
		System.out.println("Pune");
	}
	void Panji()
	{
		System.out.println("Panji");
	}
	public static void main(String[] args) 
	{
		City_Name c1 = new City_Name();
		c1.Goa();
		c1.Panji();
		Maharashtra();	
		Pune();
	}

}
