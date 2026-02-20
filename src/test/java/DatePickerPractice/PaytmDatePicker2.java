package DatePickerPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaytmDatePicker2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://tickets.paytm.com/flights/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        // Open calendar by clicking the departure date field
        driver.findElement(By.id("departureDate")).click();
        Thread.sleep(2000);

        String expectedMonth = "July";
        String expectedYear = "2025";
        String expectedDay = "22";
        String expectedMonthYear = expectedMonth + " " + expectedYear;

        while (true) {
            try {
                // Get current visible month (only the left calendar is checked)
                WebElement monthYearElement = driver.findElement(By.xpath("(//div[contains(@class,'calendar__month')])[1]"));
                String currentMonthYear = monthYearElement.getText();

                if (currentMonthYear.equals(expectedMonthYear)) {
                    // Found the correct month
                    List<WebElement> dates = driver.findElements(By.xpath(
                        "(//div[contains(@class,'calendar__month') and text()='" + expectedMonthYear + "']/following::div[contains(@class,'calendar__day') and not(contains(@class,'disabledDay'))])[1]/div"
                    ));

                    for (WebElement date : dates) {
                        if (date.getText().equals(expectedDay)) {
                            date.click();
                            System.out.println("Selected date: " + expectedDay + " " + expectedMonthYear);
                            break;
                        }
                    }
                    break;
                } else {
                    // Navigate to next month
                    driver.findElement(By.xpath("//i[contains(@class,'zamAL')]")).click();
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                break;
            }
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
