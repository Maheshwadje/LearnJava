package basicprogram;

public class NonStaticMethod {
	void add()
	{
		System.out.println("Addition");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// class name variable = new class name()
		NonStaticMethod a1 = new NonStaticMethod();
		a1.add();

	}

}
