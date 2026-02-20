package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class LoginHRTest2 {

    WebDriver driver;

    @BeforeSuite
    void beforeSuite() {
        System.out.println("BeforeSuite: Setup system properties");
   //     System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriverManager.chromedriver().setup();
    }

    @BeforeTest
    void beforeTest() {
        System.out.println("BeforeTest: Launching browser");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeClass
    void beforeClass() {
        System.out.println("BeforeClass: Navigating to HR app login page");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); // replace with actual URL
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("BeforeMethod: Preparing for login test");
    }

    @Test
    public void loginHR() {
        System.out.println("Test: Executing loginHR test");

        // Simulate login
        driver.findElement(By.name("username")).sendKeys("Admin"); // Adjust selectors
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();


    }

    @AfterMethod
    void afterMethod() {
        System.out.println("AfterMethod: Logging out (if needed) or reset state");
        // Example: driver.findElement(By.id("logoutBtn")).click();
    }

    @AfterClass
    void afterClass() {
        System.out.println("AfterClass: Test class finished");
    }

    @AfterTest
    void afterTest() {
        System.out.println("AfterTest: Closing browser");
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterSuite
    void afterSuite() {
        System.out.println("AfterSuite: Test suite completed");
    }
}
