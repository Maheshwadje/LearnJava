package learntestng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Before_After_Method 
{
	@AfterMethod
	void add()
	{
		System.out.println("AfterMethod is called");
	}
	@Test
	void login()
	{
		System.out.println("test1 is called");

	}
	@BeforeMethod
	void sub()
	{
		System.out.println("BeforeMethod is called");

	}
	@Test
	void multiply()
	{
		System.out.println("Test2 is called");

	}

}
