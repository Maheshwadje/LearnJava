//Global vs local variable
package basicprogram;

public class Variables 
{
	int age;
	String name;
	double salary;
	void add(int age, String name, double salary)
	{
		this.age=age;
		this.name=name;
		this.salary=salary;

	}

	public static void main(String[] args) 
	{		
		Variables v1 = new Variables();
		v1.add(21, "vishnu", 878798.34);
		System.out.println(v1.age);
		System.out.println(v1.name);
		System.out.println(v1.salary);
	}

}
