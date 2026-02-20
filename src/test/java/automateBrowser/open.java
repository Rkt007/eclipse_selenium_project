package automateBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class open {

    public static void main(String[] args) {

        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Open the OrangeHRM login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Wait to ensure elements are loaded (use WebDriverWait in real projects)
        try {
            Thread.sleep(3000); // Temporary static wait; better to use WebDriverWait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Enter username
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

        // Enter password
        driver.findElement(By.name("password")).sendKeys("admin123");

        // Click on the login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // (Optional) Close the browser after a short wait
        try {
            Thread.sleep(5000); // wait to see login result
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
