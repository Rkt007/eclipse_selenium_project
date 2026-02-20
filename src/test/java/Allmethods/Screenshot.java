package Allmethods;

import java.io.File;

import base.DriverFactory;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		//WebDriver driver = new ChromeDriver();
		 WebDriver driver = DriverFactory.getDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");

		TakesScreenshot sc = (TakesScreenshot) (driver);
		File source = sc.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Saloni Tiwari\\OneDrive\\Desktop\\API Tester\\AutomationWithSelenium\\screenshot\\fullPage.png");

		FileUtils.copyFile(source, destination);

		System.out.println("Screenshot will be saved at: " + destination.getAbsolutePath());
	}

}
