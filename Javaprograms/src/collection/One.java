package collection;

import java.util.ArrayList;
import java.util.Collections;

public class One {

	public static void main(String[] args)
	{
		ArrayList a1 = new ArrayList();
//		a1.add("Mahesh");
//		a1.add("Mahananda");
//		a1.add("Neha");
//		a1.add("Shrisha");
//		a1.add(null);
		a1.add(21);
		a1.add(10);
		a1.add(31);
//		a1.add(20.1);
//		a1.add('a');
//		a1.add(true);
//		a1.add(1.24f);
//		a1.add(322394828);
		
		Collections.sort(a1);
		System.out.println(a1);

	}

}
