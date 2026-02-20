package business2sell;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CapturePage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver Driver =new ChromeDriver();
		
		Driver.get("https://www.business2sell.com.au/businesses?page=1");
		Driver.manage().window().maximize();
		
		TakesScreenshot screenshot=  (TakesScreenshot)(Driver);
	
//	step 2 call getScreenshotAs method to create image file
	File src=	screenshot.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\Saloni Tiwari\\OneDrive\\Desktop\\API Tester\\AutomationWithSelenium\\screenshot\\fullPage.png");

	FileUtils.copyFile(src, destination);
	System.out.println("Screenshot will be saved at: " + destination.getAbsolutePath());

	}

}
