package GoogleTest;

import org.openqa.selenium.By;


import base.DriverFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchInGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
//		 WebDriver driver = new ChromeDriver();
		 WebDriver driver = DriverFactory.getDriver();
		driver.manage().window().maximize();
// List of all link 
		driver.get("https://www.google.com/");
//	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("youtube");
		
		
	WebElement searchBox = driver.findElement(By.name("q"));
	searchBox.sendKeys("youtube");
	searchBox.sendKeys(Keys.ENTER);
	}

}
