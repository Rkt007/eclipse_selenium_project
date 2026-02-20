package GoogleTest;

import org.openqa.selenium.By;

import base.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseAction {
	
	@Test
	public void MouseAction()
	{
		WebDriverManager.chromedriver().setup();
//		 WebDriver driver = new ChromeDriver();
		 WebDriver Driver = DriverFactory.getDriver();
		Driver.manage().window().maximize();
		Driver.get("https://gorest.co.in/");
		
		
	WebElement link=	Driver.findElement(By.xpath("//a[normalize-space()='https://gorest.co.in/public/v2/users']"));

		Actions action = new Actions(Driver);
		action.doubleClick(link).perform();
		action.contextClick(link).perform();

	}

}
