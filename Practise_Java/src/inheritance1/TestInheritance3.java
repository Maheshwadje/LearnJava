package inheritance1;
/*Hierarchical Inheritance Example
When two or more classes inherits a single class, it is known as hierarchical inheritance. 
In the example given below, Dog and Cat classes inherits the Animal class, so there is hierarchical inheritance.*/
class Animal3
{
	void eat()
	{
		System.out.println("eating..");
	}
}
class Dog3 extends Animal3
{
	void bark()
	{
		System.out.println("barking..");
	}
}
class Cat extends Animal3
{
	void meow()
	{
		System.out.println("meowing..");
	}
}
public class TestInheritance3 
{

	public static void main(String[] args)
	{
		Cat c = new Cat();
		c.eat();
		//c.bark();
		c.meow();

	}

}
