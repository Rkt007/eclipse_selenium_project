package GoogleTest;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.DriverFactory;

public class erail {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
//   	 WebDriver driver = new ChromeDriver();
   	 WebDriver driver = DriverFactory.getDriver();

        try {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://erail.in/");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Step 1: Enter DEL in From Station field
            WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
            fromStation.clear();
            fromStation.sendKeys("DEL");

            // Step 2: Wait for suggestions and click 4th station
            List<WebElement> stationSuggestions = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='autocomplete']//div[4]"))
            );

            List <WebElement> ListAllStation = driver.findElements(By.xpath("//div[@class='autocomplete']//div"));
        	
        	System.out.println("count of all station:"+ListAllStation.size());
        	
        	for (WebElement el :ListAllStation)
        	{
        		
        		  System.out.println(el.getText());
        	}

            // Step 4: Click calendar field
            WebElement calendar = driver.findElement(By.xpath("//input[@title='Select Departure date for availability']"));
            calendar.click();

            // Step 5: Calculate 30 days from today
            LocalDate futureDate = LocalDate.now().plusDays(30);
            String expectedDay = String.valueOf(futureDate.getDayOfMonth());
            String expectedMonth = futureDate.getMonth().toString().substring(0, 1).toUpperCase()
                    + futureDate.getMonth().toString().substring(1, 3).toLowerCase();
            String expectedYear = String.valueOf(futureDate.getYear()).substring(2); // e.g. 25 for 2025

            // Step 6: Loop until correct month/year is found
            while (true) {
                String displayed = driver.findElement(By.xpath("(//td[@style='text-align:right'])[1]")).getText();
                String[] parts = displayed.split(" ");
                String currentMonth = parts[0];
                String currentYear = parts[1];

                if (currentMonth.equalsIgnoreCase(expectedMonth) && currentYear.equalsIgnoreCase(expectedYear)) {
                    break;
                } else {
                    driver.findElement(By.xpath("//a[@class='icon-right-big']")).click();
                    Thread.sleep(500);
                }
            }

            // Step 7: Select the correct date
            List<WebElement> allDates = driver.findElements(
                By.xpath("//div[@id='divCalender']//table//td[not(contains(@class, 'dayDisabled'))]")
            );

            boolean dateFound = false;
            for (WebElement date : allDates) {
                if (date.getText().trim().equals(expectedDay)) {
                    date.click();
                    dateFound = true;
                    System.out.println("\nDate selected: " + expectedDay + "-" + expectedMonth + "-" + expectedYear);
                    break;
                }
            }

            if (!dateFound) {
                System.out.println("Could not find the date: " + expectedDay);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        //    driver.quit();
        }
    }
}
