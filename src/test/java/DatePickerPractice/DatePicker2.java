package DatePickerPractice;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker2 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 	
        driver.manage().window().maximize();

        driver.get("https://www.ixigo.com/flights");

        String year = "2026";
        String month = "August";
        String date = "9";

        // Open calendar widget
        driver.findElement(By.xpath("//p[@data-testid='departureDate']")).click(); 
     

        while (true) {
            String monthYear = driver.findElement(By.xpath(
                "//span[contains(@class,'react-calendar__navigation__label__labelText')]")).getText();
            
            String[] arr = monthYear.split(" ");
            String mon = arr[0];
            String yr = arr[1];

            if (mon.equalsIgnoreCase(month) && yr.equals(year)) {
                break;
            } else {
                // Click next month arrow
                driver.findElement(By.xpath("//button[contains(@class,'react-calendar__navigation__next-button')]")).click();
            }
        }

        // Now select the date
        List<WebElement> allDates = driver.findElements(By.xpath("//button[@class='react-calendar__tile']"));

        for (WebElement el : allDates) {
            String dt = el.getText();
            if (dt.equals(date)) {
                el.click();
                break;
            }
        }

        // Optional: close or proceed further
    }
}
