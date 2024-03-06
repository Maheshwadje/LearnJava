package practise;
public class Class21_This 
{
	short s;
	
	void test(short i)
	{
		this.s=i;
	}

	public static void main(String[] args) 
	{
		Class21_This c2 = new Class21_This();
		c2.test((short)1234);
		System.out.println(c2.s);

	}

}
