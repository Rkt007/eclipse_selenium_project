package DatePickerPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDateFromErail {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        driver.manage().window().maximize();
        driver.get("https://erail.in/");
    }

    @Test
    public void selectDate() {
        String expectedDay = "19";
        String expectedMonth = "Jul";
        String expectedYear = "25"; // two-digit year

        // Step 1: Click on the calendar field (correct ID is "dtJrny")
        WebElement dateInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("dtJrny")));
        dateInput.click();

        // Step 2: Wait for calendar to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("divCalender")));

        // Step 3: Navigate to correct month and year
        while (true) {
            WebElement monthYearElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("(//td[@style='text-align:right'])[1]"))); // e.g., "Jul 25"

            String displayedMonthYear = monthYearElement.getText().trim();
            System.out.println("Current Calendar View: " + displayedMonthYear);

            String[] parts = displayedMonthYear.split(" ");
            if (parts.length < 2) {
                throw new RuntimeException("Unexpected calendar format: " + displayedMonthYear);
            }

            String currentMonth = parts[0];
            String currentYear = parts[1];

            if (currentMonth.equalsIgnoreCase(expectedMonth) && currentYear.equals(expectedYear)) {
                break;
            }

            // Click next button to go forward in calendar
            WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='icon-right-big']")));
            nextButton.click();
        }

        // Step 4: Click on the desired date
        List<WebElement> allDates = driver.findElements(By.xpath(
                "//div[@id='divCalender']//table//td[not(contains(@class, 'dayDisabled'))]"));

        boolean found = false;
        for (WebElement date : allDates) {
            if (date.getText().trim().equals(expectedDay)) {
                date.click();
                found = true;
                break;
            }
        }

        if (!found) {
            throw new RuntimeException("Date " + expectedDay + " not found in calendar.");
        }

        // Step 5: Confirm selected date in input
        String selectedDate = driver.findElement(By.id("dtJrny")).getAttribute("value");
        System.out.println("✅ Selected Date: " + selectedDate);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
