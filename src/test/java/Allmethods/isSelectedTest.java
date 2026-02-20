package Allmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import base.DriverFactory;


public class isSelectedTest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		 WebDriver driver = DriverFactory.getDriver();

		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		// Open language dropdown
		driver.findElement(By.id("Skills")).click(); 

		// Get all language options
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li/a"));

		boolean isEnglishSelected = false;

		for (WebElement ele : list) {
			String language = ele.getText().trim();
			if (language.equals("Iphone")) {
				ele.click();
				isEnglishSelected = true;
				System.out.println("English is selected.");
				break;
			}
		}

		if (!isEnglishSelected) {
			System.out.println("English is not available in the list.");
		}

		driver.quit();
	}
}
