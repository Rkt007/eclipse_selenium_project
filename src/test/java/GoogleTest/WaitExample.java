package GoogleTest;

import java.time.Duration;

import base.DriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitExample {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
//		 WebDriver driver = new ChromeDriver();
		 WebDriver driver = DriverFactory.getDriver();

        try {
            // Set up explicit wait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Open Google
            driver.manage().window().maximize();
            driver.get("https://www.google.com/");

            // Enter search term and hit Enter
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("amazon");
            searchBox.sendKeys(Keys.RETURN);
          

            // Wait until Amazon link is visible and click it
            WebElement amazonLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[normalize-space()='Amazon.in']")));
            amazonLink.click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Optionally close the driver
            // driver.quit();
        }
    }
}
