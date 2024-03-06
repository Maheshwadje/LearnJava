package basicprogram;

public class Third {
	void nonstaticmethod()
	{
		System.out.println("This is my nonstatic method");
	}
	
	static void staticmethod()
	{
		System.out.println("This is my static method");
	}
	Third()
	{
		System.out.println("This is my constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is my main method");
		Third t1 = new Third();
		t1.nonstaticmethod();
		staticmethod();
		

	}

}
