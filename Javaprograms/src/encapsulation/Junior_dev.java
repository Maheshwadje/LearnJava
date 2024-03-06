package encapsulation;

class Senior_dev
{
	private int age = 18;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
public class Junior_dev 
{

	public static void main(String[] args)
	{
		Senior_dev s1 = new Senior_dev();
		s1.setAge(72);
		System.out.println(s1.getAge());

	}

}
