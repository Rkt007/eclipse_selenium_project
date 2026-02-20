package GoogleTest;

import java.util.List;

import base.DriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ListHperlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Saloni Tiwari\\\\OneDrive\\\\Desktop\\\\API Tester\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
//		 WebDriver driver = new ChromeDriver();
		 WebDriver driver = DriverFactory.getDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
	List <WebElement>LinkElements=	driver.findElements(By.tagName("a"));
	
	System.out.println("Total link of web page:" +LinkElements.size());
	
	for(WebElement  e1:LinkElements)
		
		System.out.println(e1.getText());
	}
}
