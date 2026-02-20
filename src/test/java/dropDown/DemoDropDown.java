package dropDown;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.testng.annotations.Test;

public class DemoDropDown {
    @Test
    public void ListedData() {
   //     System.setProperty("webdriver.chrome.driver",
     //           "C:\\Users\\Saloni Tiwari\\OneDrive\\Desktop\\API Tester\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

        // Explicit Wait for dropdown to be visible
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Skills")));

        Select dropdown = new Select(element);
        dropdown.selectByVisibleText("C");  // Corrected method 
		dropdown.selectByContainsVisibleText("C");
	//	dropdown.selectByValue("98");
		dropdown.selectByIndex(1);

        // Checking if dropdown supports multiple selections
        if (dropdown.isMultiple()) {
            System.out.println("Dropdown supports multiple selections.");
        } else {
            System.out.println("Dropdown does not support multiple selections.");
        }

        // Print all dropdown values
        List<WebElement> allOptions = dropdown.getOptions();
        for (WebElement el : allOptions) {
            System.out.println(el.getText());
        }

        // Close browser
        driver.quit();
    }
}
