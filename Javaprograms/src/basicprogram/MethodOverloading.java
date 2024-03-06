package basicprogram;

public class MethodOverloading {
	//non-static method overloading
	void add(int a, int b, int c)
	{
		System.out.println("add1 called");
	}
	void add(double a, int b, int c)
	{
		System.out.println("add2 called");
	}
	void add(int a, double b, int c)
	{
		System.out.println("add3 called");
	}
	//static method
	static void subtract(String a, char b)
	{
		System.out.println("subtract1 called");
	}
	static void subtract(char a, String b)
	{
		System.out.println("subtract2 called");
	}

	public static void main(String[] args) 
	{
		MethodOverloading m1=new MethodOverloading();
		m1.add(1,2,3);
		m1.add(1.2,4,6);
		m1.add(7, 4.5,9);
		
		subtract("Mahesh", 'W');
		subtract('W',"Mahesh");
		

	}

}
