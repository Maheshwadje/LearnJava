//super calling statement explicit way
package basicprogram;
class GrandParent2

{
	GrandParent2(char b)
	{
		System.out.println("Grand Parent2 constructor called");
	}
}
	
class Parent2 extends GrandParent2
{
	Parent2(String b)
	{
		super('j');
		System.out.println("Parent2 constructor called");
	}
	
}
public class Child1 extends Parent2
{
	Child1()
	{
		super("India");//super calling statement
		System.out.println("Child1 constructor called");
	}

	public static void main(String[] args)
	{
		new Child1();
		//new Parent2();

	}

}
