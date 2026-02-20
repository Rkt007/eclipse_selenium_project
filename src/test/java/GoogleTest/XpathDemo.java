package GoogleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDemo {
	
@Test
	public void XpathDemo() 
	{
	
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saloni Tiwari\\OneDrive\\Desktop\\API Tester\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.saucedemo.com");
	
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	
	
	String cureeenWindowHandle =driver.getWindowHandle();
	driver.switchTo().window(cureeenWindowHandle);
 
	driver.findElement(By.xpath("//div[3]//div[3]//button[1]")).click();
	
	}
}
