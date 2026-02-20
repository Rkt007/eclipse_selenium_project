package DatePickerPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PaytmDatePicker4 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://paytm.com/");

        String date = "20";
        String month = "August";
        String year = "2025";

        // Open date picker
        driver.findElement(By.xpath("//span[@id='departureDate']")).click();

        Thread.sleep(2000); // wait for calendar to load

        // Loop until correct month & year is found
        while (true) {
            WebElement monthYearElement = driver.findElement(By.xpath("//div[@class='_2Gsc8']")); // Visible month
            String fullText = monthYearElement.getText(); // Example: "April 2025"
            String[] parts = fullText.split(" ");
            String mon = parts[0];
            String yr = parts[1];

            if (mon.equalsIgnoreCase(month) && yr.equals(year)) {
                break;
            } else {
                // Click next button
                driver.findElement(By.xpath("//div[@class='_1G239']/div[@class='_2Gsc8']/following-sibling::div")).click();
                Thread.sleep(1000);
            }
        }

        // Once month is correct, select date
        List<WebElement> dates = driver.findElements(By.xpath("//div[contains(@class,'_2uBFU')]/div"));
        System.out.println("Total dates found: " + dates.size());

        for (WebElement d : dates) {
            if (d.getText().trim().equals(date)) {
                d.click();
                System.out.println("Date " + date + " " + month + " " + year + " selected.");
                break;
            }
        }

        // Optional: driver.quit();
    }
}
