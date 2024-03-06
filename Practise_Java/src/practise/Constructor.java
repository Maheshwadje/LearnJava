package practise;

public class Constructor {
	Constructor()
	{
		System.out.println("Non-parameterized constructor is called");
	}
	Constructor(int a)
	{
		System.out.println("parameterized constructor int is called");
	}
	Constructor(boolean c)
	{
		System.out.println("parameterized constructor boolean is called");
	}
	Constructor(String m)
	{
		System.out.println("parameterized constructor string is called");
	}
	Constructor(char b)
	{
		System.out.println("parameterized constructor char is called");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Constructor();
		new Constructor(9);
		new Constructor(false);
		new Constructor("Mahesh");
		new Constructor('b');
	}

}
