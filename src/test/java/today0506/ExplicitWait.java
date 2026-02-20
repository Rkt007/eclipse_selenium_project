package today0506;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class ExplicitWait {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Click the Select2 dropdown
        WebElement countryDropdown = driver.findElement(By.xpath("//span[@role='combobox']"));
        countryDropdown.click();

        // Wait until the options are visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='select2-country-results']/li")));

        // Get all visible dropdown options
        List<WebElement> countries = driver.findElements(By.xpath("//ul[@id='select2-country-results']/li"));

        System.out.println("Total countries visible in dropdown: " + countries.size());
        for (WebElement country : countries) {
            System.out.println(country.getText());
        }

        driver.quit();
    }
}
