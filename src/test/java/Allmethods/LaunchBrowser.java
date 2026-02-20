package Allmethods;

import org.openqa.selenium.chrome.ChromeDriver;

import base.DriverFactory;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		//WebDriver driver = new ChromeDriver();
		 WebDriver driver = DriverFactory.getDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());

		driver.quit();
		
		}
		
	}
