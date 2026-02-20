package GoogleTest;

import org.openqa.selenium.By;

import base.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
//		 WebDriver driver = new ChromeDriver();
		 WebDriver Driver = DriverFactory.getDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.facebook.com/");
		
		
	@SuppressWarnings("deprecation")
	String actual=	Driver.findElement(By.linkText("Sign Up")).getAttribute("tittle");
	
	String expected="Sign up for Facebook";
//	Actions action = new Actions(Driver);
//	action.moveToElement(actual).perform();
	if (actual.equals(expected))
	{
		System.out.println("passed");

	}else {
		System.out.println("failed");
		
	}
	
	
	}

}
