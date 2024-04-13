package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name_locator {

	public static void main(String[] args) 
	{
		ChromeDriver d2 = new ChromeDriver();
		d2.get("https://www.google.co.in/");
		d2.manage().window().maximize();
		
		WebElement search = d2.findElement(By.name("q"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);

	}

}
