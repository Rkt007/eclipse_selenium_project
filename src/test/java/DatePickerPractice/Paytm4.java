package DatePickerPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Paytm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        String expectedDate = "23";
	        // Open URL
	        driver.get("https://tickets.paytm.com/flights/");
	        driver.manage().window().maximize();

	        // Click on the date picker input box
	        driver.findElement(By.xpath("//span[@id='departureDate']")).click();
	        driver.findElement(By.xpath("//i[@class='fCLnC _1MMxa']")).click();
	 
	}

}
