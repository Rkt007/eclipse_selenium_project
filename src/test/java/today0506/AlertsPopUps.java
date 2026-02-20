package today0506;

import org.openqa.selenium.Alert;

import base.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsPopUps {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        
//   	 WebDriver driver = new ChromeDriver();
   		 WebDriver driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
        
        driver.get("https://demo.automationtesting.in/Alerts.html");

        // Click to open alert
        driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();

        // Switch to alert
        Alert alert = driver.switchTo().alert();

        // Get alert text
        System.out.println("Alert says: " + alert.getText());

        // Accept the alert
        alert.accept();

        driver.quit();
    }
}
