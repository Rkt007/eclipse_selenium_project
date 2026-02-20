package dropDown;

import java.time.Duration;

import base.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropDown {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

      //WebDriver driver = new ChromeDriver();
		 WebDriver driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        driver.get("https://www.redbus.in/");

        Thread.sleep(3000); // Wait for page scripts to load fully

        // FROM city
        WebElement fromInput = driver.findElement(By.xpath("//input[@data-testid='src-input']"));
        fromInput.click();
        fromInput.sendKeys("Pune");
        Thread.sleep(1000);
        fromInput.sendKeys(Keys.ENTER);

        // TO city
        WebElement toInput = driver.findElement(By.xpath("//input[@data-testid='dest-input']"));
        toInput.click();
        toInput.sendKeys("Mumbai");
        Thread.sleep(1000);
        toInput.sendKeys(Keys.ENTER);

        Thread.sleep(2000); // Visual confirmation
        driver.quit();
    }
}
