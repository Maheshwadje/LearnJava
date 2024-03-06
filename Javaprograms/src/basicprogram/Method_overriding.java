package basicprogram;
class Parent3
{
	void add()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);

	}
}
public class Method_overriding extends Parent3
{
	void add(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		Method_overriding m1 = new Method_overriding();
		m1.add();
	}

}
