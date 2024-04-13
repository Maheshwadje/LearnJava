package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/work/Java/LearnJava/learningHTML1.html");
		driver.manage().window().maximize();
		
		WebElement URL = driver.findElement(By.linkText("https://grotechminds.com/"));
		URL.click();
		

	}

}
