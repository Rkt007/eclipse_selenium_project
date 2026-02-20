package GoogleTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureParticularPortionImage {
	
	@Test
	public void ParticularPortionImage() throws IOException
	{
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saloni Tiwari\\OneDrive\\Desktop\\\\API Tester\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriverManager.chromedriver().setup();
//WebDriver driver = new ChromeDriver();
WebDriver driver = DriverFactory.getDriver();

driver.manage().window().maximize();
driver.get("https://translate.google.com/?sl=hi&tl=en&op=translate");


//TakesScreenshot sreenshot = ((TakesScreenshot)driver);   not in user for particular section

WebElement section=driver.findElement(By.xpath("//button[@id='i11']//span[@class='VfPpkd-YVzG2b']"));   // use for particular section
File src =section.getScreenshotAs(OutputType.FILE);

File destination=new File("C:\\Users\\Saloni Tiwari\\OneDrive\\Desktop\\API Tester\\AutomationWithSelenium\\Screenshot\\WebElement.png");

//FileUtils.copyFile(src, destination);
FileUtils.copyFile(src, destination);

	}
}
