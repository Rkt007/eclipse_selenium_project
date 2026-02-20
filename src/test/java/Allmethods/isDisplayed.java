package Allmethods;

import org.openqa.selenium.By;

import base.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
//		WebDriver Driver =new ChromeDriver();
		WebDriver Driver = DriverFactory.getDriver();
		
		Driver.get("https://demo.automationtesting.in/Register.html");
		Driver.manage().window().maximize();
	WebElement checkDisplay =	Driver.findElement(By.id("msdd"));
	
	if (checkDisplay.isDisplayed())
	{
		checkDisplay.click();
		
	}else
	{
		System.out.println("language  button not Display");
	}
	
	}

}
