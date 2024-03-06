//Multilevel Inheritance by creating 3 different class add 2 static methods in each program
package inheritance1;
class Superclass 
{
	static void add1()
	{
		System.out.println("Superclass add method called");
	}

}
class Parent_class extends Superclass
{
	static void add()
	{
		System.out.println("Parent class add called");
	}

}
public class Child_class extends Parent_class
{
	public static void main(String[] args)
	{
		add1();
		add();
	}

}
