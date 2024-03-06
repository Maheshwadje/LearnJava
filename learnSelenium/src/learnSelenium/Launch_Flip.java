package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Flip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d2 = new ChromeDriver();
		d2.get("https://www.flipkart.com/");
		d2.findElement(By.name("q")).sendKeys("Shoe");
		d2.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	}

}
