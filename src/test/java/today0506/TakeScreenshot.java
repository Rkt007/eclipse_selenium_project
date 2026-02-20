package today0506;

import java.io.File;

import base.DriverFactory;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TakeScreenshot {

    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
//   	 WebDriver driver = new ChromeDriver();
   		 WebDriver driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.myntra.com");

        // Take screenshot
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        // Save screenshot to desired location
        File dest = new File("screenshot_myntra.png");
        Files.copy(src, dest);

        System.out.println("Screenshot saved successfully.");
        
        driver.quit();
    }
}
