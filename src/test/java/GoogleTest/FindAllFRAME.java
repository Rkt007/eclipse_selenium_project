package GoogleTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAllFRAME {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
//   	 WebDriver driver = new ChromeDriver();
   	 WebDriver driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rediff.com/");
        
        
//    	driver.switchTo().defaultContent();   // go to home page
        
        // Count total number of frames and iframes
        List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
        List<WebElement> allLegacyFrames = driver.findElements(By.tagName("frame")); // sometimes older pages use <frame>

        int totalFrames = allFrames.size() + allLegacyFrames.size();

        System.out.println("Total number of frames/iframes on the page: " + totalFrames);

        driver.quit();
    }
}
