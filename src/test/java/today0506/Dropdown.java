package today0506;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Register.html");

        WebElement element = driver.findElement(By.id("Skills"));
        Select dropdown = new Select(element);

        // Select the option containing 'Java'
        dropdown.selectByVisibleText("Java");

        // Get all options
        List<WebElement> allOptions = dropdown.getOptions();
        System.out.println("Total options: " + allOptions.size());

        // Print all options and stop at "Java"
        for (WebElement option : allOptions) {
            String text = option.getText();
            System.out.println(text);
            if (text.equals("Java")) {
                break;
            }
        }

        driver.quit();
    }
}
