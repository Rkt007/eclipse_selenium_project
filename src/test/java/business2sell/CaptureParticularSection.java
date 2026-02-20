package business2sell;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import base.DriverFactory;
public class CaptureParticularSection {

    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriverManager.chromedriver().setup();
      //WebDriver driver = new ChromeDriver();
		 WebDriver driver = DriverFactory.getDriver();

        driver.get("https://www.business2sell.com.au/businesses?page=1");
        driver.manage().window().maximize();

     
        // Locate a specific section — first listing title as example
        WebElement section = driver.findElement(By.xpath("(//div[@class='media-body']//h3/a)[1]"));

        // Capture screenshot of the section
        File src = section.getScreenshotAs(OutputType.FILE);

        // Set destination path
        File destination = new File("C:\\Users\\Saloni Tiwari\\OneDrive\\Desktop\\API Tester\\AutomationWithSelenium\\Screenshot\\WebElement.png");

        // Save the file
        FileUtils.copyFile(src, destination);

        System.out.println("Screenshot captured successfully!");

        driver.quit();
    }
}
