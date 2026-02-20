package DatePickerPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class booking {

    public static void main(String[] args) throws InterruptedException {

        // -------- Setup --------

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.booking.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // -------- Close Popup If Present --------

        try {
            WebElement popupClose = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//button[@aria-label='Dismiss sign-in info.']")));
            popupClose.click();
        } catch (Exception e) {
            System.out.println("Popup not displayed");
        }

        // -------- Enter City --------

        WebElement city = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("ss")));

        city.clear();
        city.sendKeys("Delhi");

        // -------- Open Calendar --------

        driver.findElement(By.xpath("//span[text()='Check-in date']")).click();

        // -------- Target Date --------

        String targetMonth = "February 2026";
        String targetDate = "2026-02-15";

        // -------- Navigate To Required Month --------

        int count = 0;

        while (count < 12) {

            String currentMonth = driver.findElement(
                    By.xpath("//h3[@aria-live='polite']")).getText();

            if (currentMonth.equalsIgnoreCase(targetMonth)) {
                break;
            } else {
                driver.findElement(
                        By.xpath("//button[@aria-label='Next month']")).click();
            }

            count++;
        }

        // -------- Select Date --------

        WebElement dateElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//span[@data-date='" + targetDate + "']")));

        dateElement.click();

        // -------- Click Search Button --------

        WebElement searchBtn = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[@type='submit']")));

        searchBtn.click();

        // -------- Hold Browser For View --------

        Thread.sleep(5000);

        // -------- Close Browser --------

        driver.quit();
    }
}
