package business2sell;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rssheety {

    public static void main(String[] args) {
        
        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        try {
            driver.manage().window().maximize();
            driver.get("https://rahulshettyacademy.com/loginpagePractise/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            
            // Click on the blinkingText link
            WebElement link = driver.findElement(By.className("blinkingText"));
            if (link.isEnabled()) {
                link.click();
                
                // Switch to the new tab (optional if opened in a new window)
                for (String handle : driver.getWindowHandles()) {
                    driver.switchTo().window(handle);
                }

                // Get the red paragraph text
                WebElement textElement = driver.findElement(By.xpath("//p[@class='im-para red']"));
                String value = textElement.getText();
                
                // Print the full text (optional)
                System.out.println("Extracted Text: " + value);
                
                // Extract only the email from the text (if needed)
                String email = value.split("at")[1].trim().split(" ")[0];
                System.out.println("Extracted Email: " + email);
                
                // Switch back to original window (if required)
                for (String handle : driver.getWindowHandles()) {
                    driver.switchTo().window(handle);
                    break;
                }

                // Enter the extracted email into the username field
                WebElement usernameField = driver.findElement(By.id("username"));
                usernameField.sendKeys(email);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close browser after short delay
            try { Thread.sleep(3000); } catch (InterruptedException e) {}
            driver.quit();
        }
    }
}
