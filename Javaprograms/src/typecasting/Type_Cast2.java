package typecasting;

public class Type_Cast2
{
	public static void main(String[] args) 
	{
		byte b = 63; 
		long l = b ; //widening
		float f = l;
		System.out.println(l);
		System.out.println(f);
	}
	
}
