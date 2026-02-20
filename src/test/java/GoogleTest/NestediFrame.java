package GoogleTest;

import org.openqa.selenium.WebDriver;

import base.DriverFactory;
import org.openqa.selenium.chrome.ChromeDriver;

import base.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NestediFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
//		 WebDriver driver = new ChromeDriver();
		 WebDriver Driver = DriverFactory.getDriver();
		Driver.manage().window().maximize();
		Driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	}

}
