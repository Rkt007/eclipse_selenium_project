package GoogleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class scroll {
	@Test
	public void scrollonPage() 
	{
		  System.setProperty("webdriver.chrome.driver",
	                "C:\\Users\\Saloni Tiwari\\OneDrive\\Desktop\\API Tester\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");	
		
		  WebDriver driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.calculator.net/");
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			//  scroll vertically down by 500 pixel 
		  js.executeAsyncScript("window.scrollBy(0,1000)");
		  
		//  scroll till visibility of web element
		  WebElement element =driver.findElement(By.linkText("BMI Calculator"));
		  js.executeScript("arguments[0].scrollIntoView()", element);
		  
		//  To scroll down the web page at the bottom of the page 
		  js.executeScript("window.scrollTO(0,document.body.scrollHeight)");
		  
	}

}
