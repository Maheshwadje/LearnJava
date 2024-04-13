package learntestng;

import org.testng.annotations.Test;

public class Two_Test 
{
	@Test
	public static void sub()
	{
		System.out.println("sub called");
	}
	@Test
	public static void add()
	{
		System.out.println("add called");
	}
}
//Note - the functions are called alphabetically
//If alphabetically both methods are same then order will be numeric