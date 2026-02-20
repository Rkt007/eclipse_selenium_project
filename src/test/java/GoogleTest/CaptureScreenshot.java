package GoogleTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaptureScreenshot {
	@Test
	public void Screenshot() throws IOException
	
	{
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saloni Tiwari\\OneDrive\\Desktop\\\\API Tester\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/login");
	
		//	capture full screenshot
	//	convert WebDriver object to TakeScreenshot interface
		TakesScreenshot screen1=  ((TakesScreenshot)driver);
		
		
//	step 2 call getScreenshotAs method to create image file
	File src=	screen1.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\Saloni Tiwari\\OneDrive\\Desktop\\API Tester\\AutomationWithSelenium\\screenshot\\fullPage.png");

	FileUtils.copyFile(src, destination);
	System.out.println("Screenshot will be saved at: " + destination.getAbsolutePath());

}
}