package DatePickerPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaytmDatePicker3 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open URL
        driver.get("https://tickets.paytm.com/flights/");
        driver.manage().window().maximize();

        // Click on the date picker input box
        driver.findElement(By.xpath("//span[@id='departureDate']")).click();

        String expectedMonth = "August";
        String expectedYear = "2025";
        String expectedDate = "31";
    
        // Loop until expected month and year appear
        while (true) {
            String calendarMonthYear = driver.findElement(By.xpath("//div[@class='TcV6A']")).getText();
            String[] parts = calendarMonthYear.split(" ");
            String month = parts[0];
            String year = parts[1];

            if (month.equalsIgnoreCase(expectedMonth) && year.equals(expectedYear)) {
                break;
            } else {
                // Click on the next button
                driver.findElement(By.xpath("//i[@class='AzD4s zamAL']")).click();
                try {
                    Thread.sleep(500); // slight wait for UI to update
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        // Now select the date
        List<WebElement> allDates = driver.findElements(By.xpath("//div[contains(@class,'_2uBFU')]//div[2]//td"));

        for (WebElement date : allDates) {
            String day = date.getText().trim();
            if (day.equals(expectedDate)) {
                date.click();
                break;
            }
        }

        // Optional: Close the browser
        // driver.quit();
    }
}
