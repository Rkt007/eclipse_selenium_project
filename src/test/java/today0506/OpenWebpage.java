package today0506;

import org.openqa.selenium.WebDriver;

import base.DriverFactory;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenWebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	
//	 WebDriver driver = new ChromeDriver();
		 WebDriver driver = DriverFactory.getDriver();
	driver.get("https://www.google.com/");
	
	
	}

}
