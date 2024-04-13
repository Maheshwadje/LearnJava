package learntestng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngmethods 
{
	@AfterTest //shortcut -> STCM = Suit, Test, Class, Method
	void add()
	{
		System.out.println("AfterTest is called");
	}
	@BeforeTest
	void add1()
	{
		System.out.println("BeforeTest is called");

	}
	@AfterMethod
	void add3()
	{
		System.out.println("AfterMethod is called");

	}
	@BeforeClass
	void add4()
	{
		System.out.println("Beforeclass is called");

	}
	@Test
	void add2()
	{
		System.out.println("Test is called");

	}

}
