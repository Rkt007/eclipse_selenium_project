package today0506;

import java.time.Duration;

import base.DriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	 WebDriver driver = new ChromeDriver();
		 WebDriver driver = DriverFactory.getDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://demo.automationtesting.in/Register.html");
	     
	WebElement element =        driver.findElement(By.xpath(" //input[@placeholder='First Name']"));
	element.sendKeys("Rahul");
	        Actions act = new Actions(driver);
	        act.click();
	      
	}

}
