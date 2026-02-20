package Allmethods;

import org.openqa.selenium.By;
import base.DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import base.DriverFactory;

public class isEnabledTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
//		WebDriver Driver =new ChromeDriver();
		WebDriver driver = DriverFactory.getDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	WebElement checkEnable =	driver.findElement(By.id("submitbtn"));
	
	if (checkEnable.isEnabled())
	{
		checkEnable.click();
	}else
	{
		System.out.println("submit button not enable");
	}
	
	}

}
