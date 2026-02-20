package Allmethods;

import java.time.Duration;

import base.DriverFactory;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InterviewParallelTest {

    WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public void setup(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
    }

    @Test
    public void googleSearchTest() {

        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("selenium");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul")));

        List<WebElement> listall =
                driver.findElements(By.xpath("//div[@role='presentation']/ul/li"));

        System.out.println("Total Suggestions: " + listall.size());

        for (WebElement linktext : listall) {
            System.out.println(linktext.getText());
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
