package practise;
import java.util.Scanner;

public class Class15_Scanner 
{
	static void add()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter a ");
		int a = s1.nextInt();
		System.out.println("enter b ");
		int b = s1.nextInt();
		int sum = a+b;
		System.out.println("sum is " +sum);
		System.out.println("----------------");
	}
	static void substract()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter a ");
		int a = s1.nextInt();
		System.out.println("enter b ");
		int b = s1.nextInt();
		int sub = a-b;
		System.out.println("sub is " +sub);
		System.out.println("----------------");
	}
	static void Multiply()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter a ");
		int a = s1.nextInt();
		System.out.println("enter b ");
		int b = s1.nextInt();
		int mul = a*b;
		System.out.println("mul is " +mul);
		System.out.println("----------------");
	}
	static void Divide()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter a ");
		int a = s1.nextInt();
		System.out.println("enter b ");
		int b = s1.nextInt();
		int div = a/b;
		System.out.println("div is " +div);
	}
	public static void main(String[] args) 
	{
		add();
		substract();
		Multiply();
		Divide();
	}

}
