package typecasting;

class GGParent 
{
	void add()
	{
		System.out.println("add calling");
	}
}
class GParent extends GGParent
{
	void subtract()
	{
		System.out.println("subtract calling");
	}
}
class Parent extends GParent
{
	void multiple()
	{
		System.out.println("multiple calling");
	}
}
public class Child extends Parent
{

	public static void main(String[] args)
	{
		GParent g1 = new Parent();
		g1.add();
		g1.subtract();
		

	}

}
