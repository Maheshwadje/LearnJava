package basicprogram;

public class Assignment1 {
	static void ramesh() //static method1
	{
		System.out.println("Ramesh is present");
	}
	static void suresh() //static method2
	{
		System.out.println("Suresh is present");
	}
	void ganesh() //non static method1
	{
		System.out.println("Ganesh is present");
	}
	void naresh() //non static method2
	{
		System.out.println("Naresh is present");
	}
	
	public static void main(String[] args)
	{
		ramesh();
		suresh();
		Assignment1 a1 = new Assignment1();
		//Assignment1 a2 = new Assignment1();
		a1.ganesh();
		a1.naresh();
	}

}

