package GoogleTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.DriverFactory;

public class FileUploadAutoId {
	
	@Test
	public void upload()
	{
		System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Saloni Tiwari\\OneDrive\\Desktop\\API Tester\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");	
//		 WebDriver driver = new ChromeDriver();
		 WebDriver driver = DriverFactory.getDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
	WebElement button=driver.findElement(By.id("file-upload"));    //unable to perform file upload using selenium

		
		Actions act= new Actions(driver);
		act.moveToElement(button).click().perform();
		try {
			Runtime.getRuntime().exec("C:\\Users\\Saloni Tiwari\\OneDrive\\Desktop\\autoit\\FileUpload.exe C:\\Users\\Saloni Tiwari\\OneDrive\\Desktop\\thread.csv");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
