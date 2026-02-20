package DatePickerPractice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerByDropDown {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
        driver.manage().window().maximize();

        // Click on DOB field
        driver.findElement(By.id("dob")).click();

        // Select month
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")));
        monthDropdown.selectByVisibleText("Aug");

        // Select year
        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));
        yearDropdown.selectByVisibleText("1998");

        // Select date
        String date = "9";
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

        for (WebElement el : allDates) {
            if (el.getText().equals(date)) {
                el.click();
                break;
            }
        }
    }
}
