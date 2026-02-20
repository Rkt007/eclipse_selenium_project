package today0506;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementFindElements {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");

        // Click the Select2 country dropdown
        WebElement countryDropdown = driver.findElement(By.xpath("//span[@role='combobox']"));
        countryDropdown.click();

        // Wait for options to appear
        Thread.sleep(1000);

        // Get all list items from the dropdown (visible countries)
        List<WebElement> countries = driver.findElements(By.xpath("//ul[@id='select2-country-results']/li"));

        System.out.println("Total countries visible in dropdown: " + countries.size());
        for (WebElement country : countries) {
            System.out.println(country.getText());
        }

        driver.quit();
    }
}
