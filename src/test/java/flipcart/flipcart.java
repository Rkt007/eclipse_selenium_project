package flipcart;

import org.openqa.selenium.By;

import base.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipcart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	
//	 WebDriver driver = new ChromeDriver();
	 WebDriver driver = DriverFactory.getDriver();
	
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//a[contains(text(),'Become a Seller')]")).click();
	
	}

}
