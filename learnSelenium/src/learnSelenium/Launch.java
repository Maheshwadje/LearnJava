package learnSelenium;

import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch 
{
	public static void main(String[] args) 
	{
		//Launch browser
		ChromeDriver d1 = new ChromeDriver();
		
//		Type or get URL
		d1.get("https://www.flipkart.com/");
		
//		Store title in string var
		String title = d1.getTitle();
		
//		print
		System.out.println(title);
		
//		Convert to array of string
		char c1[] = title.toCharArray();
		System.out.println(Arrays.toString(c1));
		d1.quit();
	}
}
