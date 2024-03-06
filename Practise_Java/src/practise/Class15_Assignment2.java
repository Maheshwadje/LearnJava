package practise;
import java.util.Scanner;

public class Class15_Assignment2 {
	static double pi = 3.14;
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter radius value ");
		double radius = s1.nextDouble();
		double area = pi*radius*radius;
		System.out.println("Area of circle is " +area);
		s1.close();
	}

}
