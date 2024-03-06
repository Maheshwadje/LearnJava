package basicprogram;
//How to create relation between class and interface
interface Ilogindetails
{
	void login();
	void logout();
}

public class Addition_program implements Ilogindetails
{
	public static void main(String[] args)
	{
		Addition_program a1 = new Addition_program();
		a1.login();
		a1.logout();

	}@Override
	public void login()
	{
		System.out.println("Inner logic login");
	}@Override
	public void logout() 
	{
		System.out.println("Inner logic logout");
	
	}

}
