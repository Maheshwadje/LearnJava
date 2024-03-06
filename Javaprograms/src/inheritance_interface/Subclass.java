package inheritance_interface;
//How to create relationship with interface
interface iSuperclass
{
	void un(); //public methods
	void pwd();//public methods
	
}
abstract class LogintoAmazon implements iSuperclass
{
	abstract void credentials();
	static void otp()
	{
		System.out.println("OTP's will be provided");
	}
}
public class Subclass extends LogintoAmazon
{

	public static void main(String[] args)
	{
		Subclass s1 = new Subclass();
		s1.un();
		s1.pwd();
		s1.credentials();
		otp();

	}

	@Override
	public void un() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pwd()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	void credentials()
	{
		// TODO Auto-generated method stub
		
	}

}
