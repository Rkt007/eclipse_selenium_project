package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {

    public static void main(String[] args) {
        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

      
            // Launch URL and configure browser
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://demo.automationtesting.in/Frames.html");
            
    //   click on Iframe with in an Iframe']
            driver.findElement(By.xpath(" //a[normalize-space()='Iframe with in an Iframe']")).click();

            // Switch to outer frame
            WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
            driver.switchTo().frame(outerFrame);

            // Switch to inner frame
            WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
            driver.switchTo().frame(innerFrame);

            // Enter text into input field
           driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Test");
        

       
        
    }
}
