package Allmethods;

import org.openqa.selenium.JavascriptExecutor;

import base.DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollOnPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		
//WebDriver driver = new ChromeDriver();
WebDriver driver = DriverFactory.getDriver();
		driver.get("https://int.zigzag.lk/");
		System.out.println(driver.getTitle());

		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	//	driver.quit(); )
		
		}
		
	}