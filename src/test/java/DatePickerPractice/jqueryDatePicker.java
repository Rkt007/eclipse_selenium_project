package DatePickerPractice;

import java.util.List;

import base.DriverFactory;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jqueryDatePicker {
	@Test
	public void datepick() {

		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		 WebDriver driver = DriverFactory.getDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0); // date picker is inside iframe
		
		WebElement date = driver.findElement(By.id("datepicker"));
		date.click();

		// Set target date
		String expectedDay = "10";
		String expectedMonth = "August";
		String expectedYear = "2025";
		
		while (true) {
			String calenderMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String calenderYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if (calenderMonth.equals(calenderMonth) && calenderYear.equals(calenderYear)) {
				
				List<WebElement> dayList = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
			
				for (WebElement e : dayList) {
					String calenderDay = e.getText();
					if (calenderDay.equals(expectedDay)) {
						e.click();
						break;
					}
				}
				break;
			} else {
				// Click "Next" arrow
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}

		driver.quit();
	}
}
