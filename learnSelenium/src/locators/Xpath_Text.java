package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Text {

	public static void main(String[] args) 
	{
		ChromeDriver d2 = new ChromeDriver();
		d2.get("https://www.google.co.in/");
		d2.manage().window().maximize();
		
		d2.findElement(By.xpath("//a[.='Gmail']")).click();

	}

}
