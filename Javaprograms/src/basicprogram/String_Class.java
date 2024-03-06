package basicprogram;
public class String_Class {

	public static void main(String[] args) 
	{
String name="Srilanka";
int a1=	name.length();
System.out.println(a1);
System.out.println(name.charAt(5));

String name1=" is my neighbour country";

System.out.println(	name.concat(name1));
System.out.println(name.concat("Manish"));
System.out.println("Manish".concat(" ").concat("Kumar"));
System.out.println("Manish".concat(" ").concat("Kumar").concat(" ").concat("Tiwari"));
System.out.println(name.indexOf('S'));
System.out.println(name.trim());
String a2="              I Love My friends    ";
System.out.println(a2);
System.out.println(a2.trim()); // trimming extra spaces
	}

}
