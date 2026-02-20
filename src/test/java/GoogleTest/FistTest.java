package GoogleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FistTest {
	@Test
	public void TestAutomate()
	{
	//	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saloni Tiwari\\OneDrive\\Desktop\\API Tester\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        WebDriverManager.chromedriver().setup();
	        // Create an instance of ChromeDriver
//	   	 WebDriver driver = new ChromeDriver();
	   	 WebDriver driver = DriverFactory.getDriver();
	        
	        // Open Google
	        driver.get("https://www.google.com");
     String title =  driver.getTitle();
     System.out.println("Page Title:"+ title);
     System.out.println("URL:" + driver.getCurrentUrl());
	}

}
