package DatePickerPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class irctcDatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();

		
		 driver.get("https://www.irctc.co.in/nget/train-search");
	        driver.manage().window().maximize();

	        // Open datepicker
	        driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
	        Thread.sleep(2000);

	        String expectedMonth = "August";
	        String expectedYear = "2026";
	        String expectedDay = "22";

	        // Navigate to correct month/year
	        while (true) {
	            String monthYear = driver.findElement(By.xpath(
	                "(//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all ng-tns-c58-10']"
	            )).getText();

	            String[] parts = monthYear.split(" ");
	            String month = parts[0];
	            String year = parts[1];

	            if (month.equals(expectedMonth) && year.equals(expectedYear)) {
	                break;
	            } else {
	                // Click next month
	                driver.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();
	                Thread.sleep(1000);
	            }
	        }

	        // Select the day
	        List<WebElement> allDays = driver.findElements(By.xpath(
	        		"//div[contains(@class,'ui-datepicker-group-first')]//table[@class='ui-datepicker-calendar']//td[not(contains(@class, 'ui-datepicker-other-month'))]/a"
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
