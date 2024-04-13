package learnSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch_Browser {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		EdgeDriver driver1 = new EdgeDriver();
		InternetExplorerDriver driver2 = new InternetExplorerDriver();
		ChromeDriver driver3 = new ChromeDriver();
	}

}
