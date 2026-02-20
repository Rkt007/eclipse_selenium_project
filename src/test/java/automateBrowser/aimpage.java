package automateBrowser;

import org.openqa.selenium.By;

import base.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class aimpage {
	@Test
	public void aimopen() 
	{
	//	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saloni Tiwari\\OneDrive\\Desktop\\API Tester\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
			 WebDriver driver = DriverFactory.getDriver();
	    driver.get("https://www.cricbuzz.com/");
	   // driver.findElement(By.xpath("//input[@class='_18u87m _3WuvDp']")).sendKeys("8368058108");
	 //   driver.findElement(By.xpath("//button[normalize-space()='Request OTP']")).sendKeys("135248");
	   // driver.findElement(By.xpath("//div[@class='XDRRi5']//div[1]//input[1]")).sendKeys("135248");
	 //   driver.findElement(By.xpath("//button[normalize-space()='Verify']")).click();
	String res=  driver.getTitle();
	System.out.println("get tittle:" + res);
	String cureeenWindowHandle1 = driver.getWindowHandle();
	driver.findElement(By.linkText("Series")).click();
	//String cureeenWindowHandle2 = driver.getWindowHandle();
	driver.findElement(By.partialLinkText("Pakistan tour of New Zealand")).click();
	
	}

}
