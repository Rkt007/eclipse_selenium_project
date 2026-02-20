package today0506;

import org.openqa.selenium.WebDriver;

import base.DriverFactory;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitlePageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		
//		 WebDriver driver = new ChromeDriver();
			 WebDriver driver = DriverFactory.getDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	String title=	driver.getTitle();
	System.out.println("title of page:"+title);
	
	}

}
