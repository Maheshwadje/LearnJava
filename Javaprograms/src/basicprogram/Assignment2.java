//Do a Constructor overloading and method overloading in single program
package basicprogram;
public class Assignment2 
{
	//constructor overloading
	Assignment2(int a, int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	//static method overloading
	static void add(int a, int b)
	{
		System.out.println(a);
		System.out.println(b);		
	}
	//non-static method overloading
	void subtract(double a, double c)
	{
		System.out.println(a);
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		//new Assignment2(1,4);
		Assignment2 a1=new Assignment2(3,4);
		add(12,34);
		a1.subtract(1.2,3.2);
	}

}
