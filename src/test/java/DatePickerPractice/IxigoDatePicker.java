package DatePickerPractice;

import java.util.List;

import base.DriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IxigoDatePicker {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
      //WebDriver driver = new ChromeDriver();
		 WebDriver driver = DriverFactory.getDriver();

        driver.get("https://www.ixigo.com/flights");
        driver.manage().window().maximize();

        // Open datepicker
        driver.findElement(By.xpath("//p[normalize-space()='Departure']")).click();
        Thread.sleep(2000);

        String expectedMonth = "April";
        String expectedYear = "2026";
        String expectedDay = "22";

        // Navigate to correct month/year
        while (true) {
            String monthYear = driver.findElement(By.xpath(
                "(//div[contains(@class,'react-calendar')])[1]//span[contains(@class,'labelText--from')]"
            )).getText();

            String[] parts = monthYear.split(" ");
            String month = parts[0];
            String year = parts[1];

            if (month.equals(expectedMonth) && year.equals(expectedYear)) {
                break;
            } else {
                // Click next month
                driver.findElement(By.xpath("//button[@aria-label='Next month']")).click();
                Thread.sleep(1000);
            }
        }

        // Select the day
        List<WebElement> allDays = driver.findElements(By.xpath(
        		"//div[contains(@class,'react-calendar__month-view__days')]//div"
        ));

        for (WebElement day : allDays) {
            if (day.getText().equals(expectedDay)) {
                day.click();
                break;
            }
        }

        Thread.sleep(3000); // Pause to observe
        driver.quit();
    }
}
