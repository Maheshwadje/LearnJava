package basicprogram;
abstract class Amazonlogic
{
	abstract void login();
}
public class AbstractParentclass extends Amazonlogic
{
	public static void main(String[] args)
	{
		AbstractParentclass a1 = new AbstractParentclass();
		a1.login();
	}

	@Override
	void login() {
		System.out.println("This is logic");
		
	}
		
}
