package TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTesting {

    // Use ThreadLocal to ensure thread safety
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public WebDriver getDriver() {
        return driver.get();
    }

    @Test
    public void login() {
        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver());

        // Sample action
        getDriver().get("https://google.com");

        // Close browser
        getDriver().quit();
        driver.remove();
    }
   
}
