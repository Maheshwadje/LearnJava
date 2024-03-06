package inheritance1;
//single inheritance
class Employee
{
	float salary = 100000;
}
public class Programmer extends Employee
{

	public static void main(String[] args)
	{
		int bonus = 5000;
		Programmer p1 = new Programmer();
		System.out.println("The salary is " +p1.salary);
		System.out.println("The bonus is " +bonus);
		

	}

}
