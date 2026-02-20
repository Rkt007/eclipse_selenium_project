package Allmethods;

import base.DriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		//WebDriver Driver =new ChromeDriver();
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://www.rediff.com/");
		System.out.println(driver.getTitle());

	Alert alert=	driver.switchTo().alert();
	
	
	alert.getText();                      // get the value
	alert.accept();                      // click on ok button
	alert.dismiss();                    // cancel
	alert.sendKeys("Hello");           //  provide value
		}
		
	}
