package basicprogram;
//super calling statement implicit way
class GrandParent
{
	GrandParent()
	{
		System.out.println("Grand Parent constructor called");
	}
}
	
class Parent extends GrandParent
{
	Parent()
	{
		super();
		System.out.println("Parent constructor called");
	}
	
}
public class Child extends Parent
{
	Child()
	{
		super();
		System.out.println("Child constructor called");
	}

	public static void main(String[] args)
	{
		new Child();
		new Parent();

	}

}
