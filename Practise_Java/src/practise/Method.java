package practise;

public class Method {
	static void staticmethod1()
	{
		System.out.println("staticmethod1 called");
	}
	static void staticmethod2()
	{
		System.out.println("staticmethod2 called");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticmethod1();
		staticmethod2();
		Method m1=new Method();
		m1.nonstaticmethod1();
		m1.nonstaticmethod2();

	}
	void nonstaticmethod1()
	{
		System.out.println("nonstaticmethod1 called");
	}
	void nonstaticmethod2()
	{
		System.out.println("nonstaticmethod2 called");
	}

}
