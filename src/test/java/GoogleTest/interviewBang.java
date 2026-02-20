package GoogleTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class interviewBang {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.automationpractice.pl/index.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement element1 = driver.findElement(By.id("search_query_top"));
        element1.sendKeys("t-shirt");
        element1.sendKeys(Keys.ENTER);

        WebElement element = driver.findElement(By.linkText("Faded Short Sleeve T-shirts"));

        String actualText = element.getText();
        String expectedText = "Faded Short Sleeve T-shirts";

        if (actualText.equals(expectedText)) {
            System.out.println("PASS: Found the correct product → " + actualText);
        } else {
            System.out.println("FAIL: Expected '" + expectedText + "' but got '" + actualText + "'");
        }

        driver.quit();
    }
}
