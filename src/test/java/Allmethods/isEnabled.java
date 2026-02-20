package Allmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver Driver =new ChromeDriver();
		
		Driver.get("https://demo.automationtesting.in/Register.html");
		Driver.manage().window().maximize();
	WebElement checkEnable =	Driver.findElement(By.id("submitbtn"));
	
	if (checkEnable.isEnabled())
	{
		checkEnable.click();
	}else
	{
		System.out.println("submit button not enable");
	}
	
	}

}
