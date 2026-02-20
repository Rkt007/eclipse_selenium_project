package DatePickerPractice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryUIDatepicker {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Open URL
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        // Switch to iframe
        driver.switchTo().frame(0);

        // Click on the date picker input box
        driver.findElement(By.id("datepicker")).click();

        // Target date
        String expectedMonth = "August";
        String expectedYear = "2025";
        String expectedDate = "9";

        while (true) {
            String calendarMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String calendarYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if (calendarMonth.equals(expectedMonth) && calendarYear.equals(expectedYear))
            {
                List<WebElement> dayList = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

                for (WebElement e : dayList) 
                {
                    String calendarDay = e.getText();
                    if (calendarDay.equals(expectedDate)) 
                    {
                        e.click();
                        break;
                    }
                }
                break;
            } else {
                // Click on Next button
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            }
        }
        
        // You can close the driver if you want
         driver.quit();
    }
}
