package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopclues {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		WebElement Search = driver.findElement(By.id("autocomplete"));
		Search.sendKeys("shoes");
		
		
	

	}

}
