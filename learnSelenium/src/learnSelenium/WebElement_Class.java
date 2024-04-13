package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Class {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.name("q"));
		
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		
		driver.quit();
	}

}
