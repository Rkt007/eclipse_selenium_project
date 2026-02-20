package DatePickerPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaytmDatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();

	        // Open URL
	        driver.get("https://paytm.com/");
	        driver.manage().window().maximize();

	        // Switch to iframe
	 //       driver.switchTo().frame(0);

	        // Click on the date picker input box
	       driver.findElement(By.xpath("//span[@id='departureDate']")).click();
	      
	     
	        // Target date
	        String expectedMonthYear = "August 2025";
	        String expectedDate = "31";
	while (true)
	{
	String calendermonthyear=	driver.findElement(By.xpath("//div[@class='TcV6A']")).getText();
	if (calendermonthyear.equals(expectedMonthYear))
	{
List <WebElement>	calenderdate=	driver.findElements(By.xpath("//body[1]/div[1]/section[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[5]"));
	
	for (WebElement e:calenderdate)
	{
	String dt=	e.getText();
	if (dt.equals(expectedDate))
	{
		e.click();
		break;
	}
	}
	break;
		
	}
	else
	{
		driver.findElement(By.xpath("//i[@class='fCLnC _1MMxa']")).click();
	}
	}
	
	}
	
	}