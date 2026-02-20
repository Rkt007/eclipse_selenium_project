package GoogleTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.DriverFactory;

public class ImageLinkCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.chrome.driver",
//				"C:\\\\Users\\\\Saloni Tiwari\\\\OneDrive\\\\Desktop\\\\API Tester\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		
//		 WebDriver driver = new ChromeDriver();
		 WebDriver driver = DriverFactory.getDriver();

		driver.manage().window().maximize();
		driver.get("https://www.opencart.com");
		driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']")).click();
		
//verify title
		if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution"))
		{
			System.out.println("Test Passed");
		} 
		else
		{
			System.out.println("Test Failed");
		}	
		driver.close();
	}
}