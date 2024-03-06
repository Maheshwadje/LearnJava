package inheritance;
public class Student extends Teacher //This is how we can create relation btw two classes. 
{
	static void learn_java()
	{
		System.out.println("Learn Java is called");
	}
	static void learn_selenium()
	{
		System.out.println("learn selenium called");
	}
	public static void main(String[] args) 
	{
		learn_java();
		learn_selenium();
		java_knowledge();
		selenium();

	}

}
