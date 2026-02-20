package practice;

import org.openqa.selenium.WebDriver;

import base.DriverFactory;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
//		 WebDriver driver = new ChromeDriver();
			 WebDriver driver = DriverFactory.getDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/b/32702023031?node=32702023031&ld=AZINSOANavDesktop_T3&ref_=nav_cs_sell_T3");  //  open browser
		driver.get("https://www.google.com/");
	   driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		//driver.navigate().
	}

}
