package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d2 = new ChromeDriver();
		d2.get("https://www.google.co.in/");
		d2.findElement(By.name("q")).sendKeys("India");
		//Thread.sleep(3000);
		d2.findElement(By.name("btnK")).click();
//		d2.quit();

	}

}
